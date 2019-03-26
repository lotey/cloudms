package com.zttd.purchase.service;

import com.zttd.purchase.client.MemberClient;
import com.zttd.purchase.dao.AccountMapper;
import com.zttd.purchase.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Resource
    private MemberClient memberClient;

    public Account getAccountByUid(int uid) {
        return accountMapper.selectByUserId(uid);
    }

    public List<Map<String,Object>> getUserList(Map<String,Object> paramMap) {
       return memberClient.queryMemberList(paramMap);
    }
}
