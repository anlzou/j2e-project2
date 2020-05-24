package anlzou.com.controller;

import anlzou.com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    //当前控制器的login方法映射到地址
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //当前控制器的logincheck方法映射到地址
    @RequestMapping("/logincheck")
    @ResponseBody
    public void logincheck(@RequestBody User user, HttpServletResponse response) throws IOException {
        if("qin".equals(user.getName()) && "qin".equals(user.getPass())){
            response.getWriter().println("{\"success\":true}");
        }else{
            response.getWriter().println("{\"success\":false}");
        }
    }
}
