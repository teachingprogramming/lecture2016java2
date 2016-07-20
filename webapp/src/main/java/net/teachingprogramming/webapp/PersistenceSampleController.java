package net.teachingprogramming.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 永続化に関する例
 */
@Controller
@RequestMapping("/persistence")
public class PersistenceSampleController {

    @Autowired
    MemoRepository memoRepository;

    @RequestMapping(value = "/file", method = RequestMethod.GET)
    String loadText(ModelMap modelMap) {
        ArrayList<String> lineList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/sample.txt"))) {
            String line = br.readLine(); // 最初の行を読み込む
            while (line != null) {
                lineList.add(line);
                line = br.readLine(); // 次の行を読み込む
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelMap.addAttribute("lineList", lineList);
        return "persistence/file";
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    String appendText(ModelMap modelMap, String line) {
        boolean append = true; // 追記ならtrue、新規ならfalse
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/sample.txt",append))) {
            bw.append(line);
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect://localhost:18080/persistence/file";
    }

    @RequestMapping(value = "/memo", method = RequestMethod.GET)
    String memoGet(ModelMap modelMap) {
        List<Memo> memoList = memoRepository.findAll();
        modelMap.addAttribute("memoList", memoList);
        return "persistence/memo";
    }

    @RequestMapping(value = "/memo", method = RequestMethod.POST)
    String memoPost(ModelMap modelMap, @RequestParam("text") String text) {
        Memo memo = new Memo();
        memo.setText(text);
        memo.setDate(new Date());
        memoRepository.save(memo);
        return "redirect://localhost:18080/persistence/memo";
    }

}
