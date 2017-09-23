package com.hackx.controller;

import com.hackx.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by 曹磊(Hackx) on 22/9/2017.
 * Email: caolei@mobike.com
 */
@Controller
public class UsersController {

    public static Logger logger = LoggerFactory.getLogger(UsersController.class.getName());

    @Resource
    UsersService usersService;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("current_time", new Date());
        return "index";
    }

    @RequestMapping("/user-detail")
    public String userDetail(Map<String, Object> model) {
        /*Pageable pageable = new PageRequest(0, 2, Sort.Direction.DESC, "id");*/
        model.put("userDetail", usersService.findById(1L));
        return "user-detail";
    }


}
