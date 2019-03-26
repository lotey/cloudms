package com.zttd.member.controller;

import com.zttd.member.model.User;
import com.zttd.member.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/queryMemberList",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Map<String,Object>> queryMemberList(@RequestParam Map<String,Object> paramMap) {
        return userService.queryMemberList(paramMap);
    }

    @GetMapping(value = "/queryAll",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> queryAll() {
        return userService.queryAll();
    }
}
