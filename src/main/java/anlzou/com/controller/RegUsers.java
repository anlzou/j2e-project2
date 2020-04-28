/**
 * @author anlzou
 * @date 2020/4/28 20:16
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import anlzou.com.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegUsers {
    /*
     * 向用户注册页面跳转
     */
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "regusers";
    }
    /*
     * 接收用户注册信息
     */
    @RequestMapping("/registerUser")
    public String registerUser(Users user) {
        String username=user.getName();
        String  password=user.getPass();
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "success";
    }
}
