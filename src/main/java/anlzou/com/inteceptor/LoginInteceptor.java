package anlzou.com.inteceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInteceptor implements HandlerInterceptor {
    //处理器方法映射之前执行
    //返回true，放行；false，不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("进入拦截器");
        //得到请求的url
        String url = request.getRequestURI();
        //判断是否是公开地址
        //实际开发中需要公开地址配置在配置文件中
        if(url.indexOf("login")>=0){
            //如果是公开地址则放行
            return true;
        }
        //判断用户身份在session中是否存在
        HttpSession session = request.getSession();
        String usercode = (String) session.getAttribute("usercode");
        //如果用户身份在session中存在放行
        if(usercode!=null){
            return true;
        }
        //执行到这里拦截，跳转到登陆页面，用户进行身份认证
        request.getRequestDispatcher("login").forward(request, response);
        //如果返回false表示拦截不继续执行handler，如果返回true表示放行
        return false;
    }
    //处理器方法映射执行之后会自动调用
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("处理器方法结束");
    }
    //所有请求完成之后调用
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("所有请求完成");
    }
}