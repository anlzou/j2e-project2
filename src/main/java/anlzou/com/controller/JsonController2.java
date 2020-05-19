package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsonController2 {
    @RequestMapping("/jsontest2")
    public String jsontest(){
        return "json2";
    }
}
