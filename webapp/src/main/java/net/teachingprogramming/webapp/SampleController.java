package net.teachingprogramming.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample")
public class SampleController {

    /**
     * インデックス
     */
    @RequestMapping("/")
    String index() {
        return "sample/index";
    }

    /**
     * ダイス
     */
    @RequestMapping("/dice")
    String dice(ModelMap modelMap) {
        int pips = (int)Math.floor(Math.random()*6) + 1;
        modelMap.addAttribute("pips", pips);
        return "sample/dice";
    }

    /**
     * 文字数（入力）
     */
    @RequestMapping("/noc_input")
    String nocInput() {
        return "sample/noc_input";
    }

    /**
     * 文字数（結果）
     */
    @RequestMapping("/noc_result")
    String nocResult(ModelMap modelMap, @RequestParam("text") String text) {
        int num = text.length();
        modelMap.addAttribute("text", text);
        modelMap.addAttribute("num", num);
        return "sample/noc_result";
    }

}
