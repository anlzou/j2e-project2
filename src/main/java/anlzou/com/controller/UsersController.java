/**
 * @author anlzou
 * @date 2020/4/28 19:55
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import anlzou.com.entity.UserLi;
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

    /*显示所有用户信息的页面*/
    @RequestMapping("usersList")
    public String usersList(){
        return "userslist";
    }
    /*接收用户信息*/
    @RequestMapping("getUserInfo")
    public String getUserInfo(UserLi usersLi){
        System.out.println(usersLi.getUsersList());  /*记得重写一下Users实体类的toString()方法*/
        return "userslist";
    }
}