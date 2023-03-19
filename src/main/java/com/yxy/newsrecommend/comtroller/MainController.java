package com.yxy.newsrecommend.comtroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import javax.annotation.Resource;


/**
 * 全局控制器
 * @author yangxinyu
 */
@RestController
@Slf4j
public class MainController {

    final static int MAX_SIZE = 1024;

    @Resource
    private MultipartResolver multipartResolver;

    @GetMapping("/javaTest")
    public String getTest(){
        return "hello Java";
    }

//        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo"+userId);
//        UserInfo userInfo1 = redisCache.getCacheObject("userInfo" + userId);

///////////------------------以下都是thymeleaf时期的映射方法---------------------《《《《《《《《《《《《《《《《》》》》》》》》》》》》》》》》》》
//    @RequestMapping("/test")
//    public String test() {
//        return "zhuye";
//    }

//
//    @RequestMapping("/blogmd")
//    public String blogmd() {
//        return "/main/resources/static/MdBlog/sendMD.html";
//    }

//    @RequestMapping("/index")
//    public String index1(HttpSession session, HttpServletRequest request) {
//        String path = request.getContextPath();
//        session.setAttribute("path", path);
//        return "index";
//    }

//    @RequestMapping("/view")
//    public String view() {
//        return "view";
//    }
//
//
//    @RequestMapping("/file")
//    public String File() {
//        return "file";
//    }


//    /**
//     * thymeleaf时期的首页
//     * @return
//     */
//        @RequestMapping("/")
//    public String index() {
//
//        return "index";
//    }


    //    /**
//     * 网站简介
//     *
//     * @return
//     */
//    @RequestMapping("/about")
//    public String about() {
//        return "about";
//    }
//

//    /**
//     * thymeleaf
//     * 帮助页面
//     * @return
//     */
//    @RequestMapping("/help")
//    public String help() {
//        return "help";
//    }


//    @RequestMapping("/testInfo")
//    public String testBlog() {
//        return "testBlog";
//    }



}
