package com.serverBigdata.api.controller;

import com.serverBigdata.api.entity.User;
import com.serverBigdata.api.service.UserService;
import com.greedystar.generator.entity.Response;
import com.greedystar.generator.entity.ResponseBean;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Author jishuai
 * Date  2019-07-26
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = {"/list"}, method = RequestMethod.POST)
    public ResponseBean select(@RequestBody User user) {
        try {
            List<User> users = userService.select(user);
            return Response.success(users,"");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }


    @RequestMapping(value = {"/pageList"}, method = RequestMethod.POST)
    public ResponseBean selectPage(@RequestBody User user) {
        try {
            PageInfo pageInfo = userService.selectPage(user);
            return Response.success(pageInfo,"");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }
    
    
    @RequestMapping(value = {"/ids/list"}, method = RequestMethod.POST)
    public ResponseBean selectByIds(@RequestBody List<String> ids) {
        try {
            if(ids.size() == 0){
                return Response.error("","ids不能为空");
            }
            List<User> users = userService.selectByIds(ids);
            return Response.success(users,"");
        }catch(Exception e){
            e.printStackTrace();
            return Response.error("","");
        }
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public ResponseBean selectByPrimaryKey(@RequestParam String id) {
        try{
            User user = userService.selectByPrimaryKey(id);
            return Response.success(user == null ? "" : user ,"");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseBean insert(@RequestBody User user) {
        try{
            userService.insert(user);
            return Response.success("");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }

    @RequestMapping(value = "/saveBatch", method = RequestMethod.POST)
    public ResponseBean insertBatch(@RequestBody List<User> users) {
        try{
            userService.insertBatch(users);
            return Response.success("");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseBean updateByPrimaryKey(@RequestBody User user) {
        try{
            int update = userService.updateByPrimaryKey(user);
            if(update > 0){
                return Response.success("");
            }else{
                return Response.error("","");
            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return Response.error("","");
        }
    }
	

}
