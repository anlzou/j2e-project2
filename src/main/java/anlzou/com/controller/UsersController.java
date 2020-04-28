/**
 * @author anlzou
 * @date 2020/4/28 19:55
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {
    @RequestMapping("/selectUser")
    public String selectUser(Integer id) {
        System.out.println("id="+id);
        return "success";
    }
}
