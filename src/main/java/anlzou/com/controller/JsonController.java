package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsonController {
    @RequestMapping("/jsontest")
    public String jsontest(){
        return "json";
    }
}
