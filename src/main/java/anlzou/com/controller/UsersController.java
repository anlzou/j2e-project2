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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UsersController {
//    @RequestMapping("/reg")
//    public String selectUser(){
//        return "regusers";
//    }

    @RequestMapping("/ulist")
    public String ulist(){
        return "/userlist";
    }

    @RequestMapping("/ulogin")
    public String ulogin(){
        return "userlogin";
    }

    @RequestMapping("/getuserdata")
    @ResponseBody
    public void getuserdata(HttpServletResponse response) throws IOException {
        response.getWriter().println("{\"total\":9,\"rows\":[");
        response.getWriter().println("{\"id\":\"FI-SW-01\",\"username\":\"Koi\",\"password\":10.00},");
        response.getWriter().println("{\"id\":\"K9-DL-01\",\"username\":\"Dalmation\",\"password\":12.00},");
        response.getWriter().println("{\"id\":\"RP-SN-01\",\"username\":\"Rattlesnake\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"RP-SN-01\",\"username\":\"Rattlesnake\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"RP-LI-02\",\"username\":\"Iguana\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"FL-DSH-01\",\"username\":\"Manx\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"FL-DLH-02\",\"username\":\"Persian\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"FL-DLH-02\",\"username\":\"Persian\",\"password\":12.00},\n");
        response.getWriter().println("{\"id\":\"AV-CB-01\",\"username\":\"Amazon Parrot\",\"password\":92.00}\n");
        response.getWriter().println("]}");
    }

    @RequestMapping("/adduser")
    @ResponseBody
    public void adduser(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.getWriter().println("{\"success\":true}");
    }

    @RequestMapping("/updateuser")
    @ResponseBody
    public void updateuser(HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.getWriter().println("{\"success\":true}");
    }

    @RequestMapping("/deluser")
    @ResponseBody
    public void deluser(HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.getWriter().println("{\"success\":true}");
    }
}