/**
 * @author：anlzou
 * @Date：Created in15:04 2020/6/9
 * @Github：https://github.com/anlzou
 * @Description：
 */
package anlzou.com.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class DownLoadFileController {
    //把dfile()方法映射到downloadfile.jsp页面
    @RequestMapping("/dfile")
    public String dfile() {
        return "downloadfile";
    }

    ///////////////////////////方法一/////////////////////////////////
    @RequestMapping("/downfile")
    //从前端获取要下载的文件名存放在filename中
    public ResponseEntity<byte[]> downfile(String filename, HttpServletRequest request) throws IOException {

        //从前端获取文件名
        System.out.println(filename);

        //获取服务器的真实物理路径
        String path = request.getSession().getServletContext().getRealPath("/upload/");

        //拼接文件路径
        String pathAndFilename = path + filename;
        System.out.println(pathAndFilename);

        //创建文件对象以供后面流传输
        File file = new File(pathAndFilename);

        //创建字节数组用于存放读取出来的文件内容
        byte body[] = null;

        //创建spring mvc的ResponseEntity类的对象
        ResponseEntity<byte[]> entity = null;

        try {

            //创建java流
            InputStream input = new FileInputStream(file);

            //创建数组，数组长度是由下载文件大小决定，其中input.available()是获取文件的长度
            body = new byte[input.available()];

            //把文件的内容读取到数据中
            input.read(body);

            //定义http头 ，状态
            HttpHeaders header = new HttpHeaders();
            header.add("Content-Disposition", "attchement;filename=" + file.getName());
            HttpStatus statusCode = HttpStatus.OK;

            //定义ResponseEntity封装返回信息
            entity = new ResponseEntity<byte[]>(body, header, statusCode);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return entity;
    }

    /////////////////////////////方法二////////////////////////////
    /*
    * @RequestMapping("/downfile")
    //从前端获取要下载的文件名存放在filename中

    public ResponseEntity<byte[]> downfile(String filename,HttpServletRequest request) throws IOException {
        //获取web服务器的物理路径
        String path=request.getServletContext().getRealPath("/upload/");

        //拼接文件路径
        String pathAndFile=path+filename;

        //创建文件对象以供后面流传输
        File file=new File(pathAndFile);

        //定义http头对象
        HttpHeaders headers = new HttpHeaders();

        //下载显示的文件名，解决中文名称乱码问题
        String fileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题

        //通知浏览器以attachment（下载方式）
        headers.setContentDispositionFormData("attachment", fileName);

        //application-octet-stream:二进制流数据（最常见的文件下载）;
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        //创建springmvc的ResponseEntity对象，封装并返回信息，
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }
    * */
}
