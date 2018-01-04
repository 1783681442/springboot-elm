package cn.enilu.elm.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by zt on 2017/12/12 0012.
 */
@Controller
@RequestMapping("/")
public class IndexController {



    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object index(Map<String,Object> map){
       return  "欢迎光临springboot-elm的api服务,点击进入<a href=\"/swagger-ui.html\">api文档</a>";
    }


}