/**
 * @author anlzou
 * @date 2020/4/28 19:55
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UsersController {
    @RequestMapping("/reg")
    public String selectUser(){
        return "regusers";
    }

    @RequestMapping("/ulist")
    public String ulist(){
        return "userlist";
    }

    @RequestMapping("/ulogin")
    public String ulogin(){
        return "userlogin";
    }

    @RequestMapping("/getuserdata")
    @ResponseBody
    public void getuserdata(HttpServletResponse response) throws IOException {
        response.getWriter().println("{\"total\":4,\"rows\":[");
        response.getWriter().println("{\"id\":1,\"name\":\"lisi1\",\"pass:\"lisi\"},");
        response.getWriter().println("{\"id\":2,\"name\":\"lisi2\",\"pass:\"lisi\"},");
        response.getWriter().println("{\"id\":3,\"name\":\"lisi3\",\"pass:\"lisi\"},");
        response.getWriter().println("{\"id\":4,\"name\":\"lisi4\",\"pass:\"lisi\"}");
        response.getWriter().println("]}");
    }
}