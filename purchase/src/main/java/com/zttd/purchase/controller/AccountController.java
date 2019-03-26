package com.zttd.purchase.controller;

import com.zttd.purchase.model.Account;
import com.zttd.purchase.service.AccountService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping(value = "/getAccountByUid",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Account queryAll(int uid) {
        return accountService.getAccountByUid(uid);
    }

    @GetMapping(value = "/getUserList",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Map<String,Object>> getUserList(@RequestParam Map<String,Object> paramMap) {
        return accountService.getUserList(paramMap);
    }

}
