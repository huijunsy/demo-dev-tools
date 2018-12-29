package com.hj.demodevtools.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ha2")
public class TestController {

    @GetMapping("/he")
    private String test(@RequestParam("k") String str){

        return str==null?"哈哈哈哈":str;
    }

    @GetMapping("/hao")
    public String test2(){
        return  "hao 个毛线大幅度";
    }

    @PostMapping("/nihao")
    public String test3(){
        return "tianxia";
    }

    @GetMapping("bucuo")
    public String test4(){
        String str = "我是来拼接字符串的";
        return str+"不错啊，可以自动加载修改后的内容 尽然识别到了,好像不太对";
    }

}
