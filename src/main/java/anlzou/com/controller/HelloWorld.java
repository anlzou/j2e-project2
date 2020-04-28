/**
 * @author anlzou
 * @date 2020/4/28 17:31
 * @version xx
 * @description xx
 */

package anlzou.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
    /**动作，action*/
    @RequestMapping("/hi")
    public String hi(Model model){
        //向模型中添加属性msg与值，将与页面模板渲染后输出
        model.addAttribute("msg","Hello Spring MVC!");
        return "hi";
    }
}
