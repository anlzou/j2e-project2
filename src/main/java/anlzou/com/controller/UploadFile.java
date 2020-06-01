//package anlzou.com.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//
//@Controller
//@RequestMapping("/upload")
//public class UploadFile {
//    /*跳转到上传文件的页面*/
//    @RequestMapping("/suploadfile")
//    public String uploadfile() {
//        return "suploadfile";
//    }
//
//    /*接收上传单个文件*/
//    @RequestMapping("/sfile")
//    public void suploadfile(@RequestParam("uploadfile") MultipartFile uploadfile, HttpServletRequest request, HttpServletResponse response) {
//        /*获取上传文件的文件名*/
//        String fileName = uploadfile.getOriginalFilename();
//        /*设置上传文件的保存地址目录*/
//        String path = request.getServletContext().getRealPath("/upload/");
//        File filePath = new File(path);
//        /*判断保存上传文件的目录是否存在，若没有存在则进行创建*/
//        if (filePath.exists()) {
//            filePath.mkdirs();
//        }
//        try {
//            /*把上传的文件保存在指的目录中（即网站根目录下的upload目录中）*/
//            uploadfile.transferTo(new File(path + fileName));
//            System.out.println("ok");
//        } catch (Exception e) {
//            /*若没有能上传则提示错误*/
//            System.out.println("error");
//        }
//    }
//}
