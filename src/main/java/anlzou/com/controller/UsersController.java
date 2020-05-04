/**
 * @author anlzou
 * @date 2020/4/28 19:55
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    /*跳转到显示用户列表的页面*/
    @RequestMapping("userList")
    public String userList(Integer[] usersId){
        return "users";
    }
    /*显示要删除用户的信息*/
    @RequestMapping("deleteUser")
    public String deleteUser(Integer[] usersId){
        for(int i=0;i<usersId.length;i++){
            System.out.println("delete userName=userName"+usersId[i]);
        }
        return "users";
    }
}