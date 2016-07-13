package net.teachingprogramming.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.*;

/**
 * フォームを扱う例
 * テンプレートは https://github.com/teachingprogramming/lecture2016java2/tree/master/webapp/src/main/resources/templates/form
 */
@Controller
@RequestMapping("/form")
public class FormSampleController {

    @RequestMapping("/")
    String index() {
        return "form/index";
    }

    /**
     * テキスト（入力）
     */
    @RequestMapping("text")
    String text(ModelMap modelMap) {
        String def1 = "ううう";
        String def2 = (new Date()).toString();
        modelMap.addAttribute("def1", def1);
        modelMap.addAttribute("def2", def2);
        return "form/text";
    }

    /**
     * テキスト（出力）
     */
    @RequestMapping("textOut")
    String textOut(@RequestParam("text1") String text1, @RequestParam("text2") String text2, ModelMap modelMap) {
        modelMap.addAttribute("text1", text1);
        modelMap.addAttribute("text2", text2);
        return "form/textOut";
    }

    /**
     * チェックボックス（入力）
     */
    @RequestMapping("checkbox")
    String checkbox(ModelMap modelMap) {
        boolean def1 = Math.random() > 0.5;
        boolean def2 = Math.random() > 0.5;
        modelMap.addAttribute("def1", def1);
        modelMap.addAttribute("def2", def2);
        return "form/checkbox";
    }

    /**
     * チェックボックス（出力）
     */
    @RequestMapping("checkboxOut")
    String checkboxOut(@RequestParam(value = "checkbox1", required = false) boolean checkbox1, @RequestParam(value = "checkbox2",required = false) boolean checkbox2, ModelMap modelMap) {
        modelMap.addAttribute("checkbox1", checkbox1);
        modelMap.addAttribute("checkbox2", checkbox2);
        return "form/checkboxOut";
    }

    /**
     * ラジオボタン（入力）
     */
    @RequestMapping("radio")
    String radio(ModelMap modelMap) {
        String def = Math.random() > 0.5 ? "radio1" : "radio2";
        modelMap.addAttribute("def", def);
        return "form/radio";
    }

    /**
     * ラジオボタン（出力）
     */
    @RequestMapping("radioOut")
    String checkboxOut(@RequestParam("radio") String radio, ModelMap modelMap) {
        modelMap.addAttribute("radio", radio);
        return "form/radioOut";
    }

    /**
     * セレクトボックス（入力）
     */
    @RequestMapping("select")
    String select(ModelMap modelMap) {
        // リスト
        List<String> nameList = new ArrayList<>();
        nameList.add("taro");
        nameList.add("jiro");
        nameList.add("hanako");
        modelMap.addAttribute("nameList", nameList);
        // マップ
        Map<String,String> nameMap = new HashMap<>();
        nameMap.put("taro", "たろう");
        nameMap.put("jiro", "じろう");
        nameMap.put("hanako", "はなこ");
        modelMap.addAttribute("nameMap", nameMap);
        return "form/select";
    }

    /**
     * セレクトボックス（出力）
     */
    @RequestMapping("selectOut")
    String selectOut(@RequestParam("select") String select, ModelMap modelMap) {
        modelMap.addAttribute("select", select);
        return "form/selectOut";
    }

    /**
     * ファイルアップロード（入力）
     */
    @RequestMapping("upload")
    String upload() {
        return "form/upload";
    }

    /**
     * ファイルアップロード（出力）
     */
    @RequestMapping("uploadOut")
    String uploadOut(@RequestParam("file") MultipartFile multipartFile, ModelMap modelMap) {
        modelMap.addAttribute("originalFilename", multipartFile.getOriginalFilename());
        StringJoiner stringJoiner = new StringJoiner(System.lineSeparator());
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(multipartFile.getInputStream()));
            while (bufferedReader.ready()) {
                stringJoiner.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelMap.addAttribute("text", stringJoiner.toString());
        try {
            multipartFile.transferTo(new File("/tmp/upload.txt")); // ファイルをセーブ
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "form/uploadOut";
    }
}
