package com.serverBigdata.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class getGlobalUid { //获取全局用户Id
    @RequestMapping("/uid")
    public @ResponseBody String say(){
        return "G100010";
    }
}
