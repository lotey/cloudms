package com.zttd.purchase.dao;

import com.zttd.purchase.model.Account;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("accountMapper")
public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    void deleteByUserId(int userId);

    Account selectByUserId(int userId);

    int updateAccountAmt(Map<String, Object> accountMap);

    int updateAccountAmtByUserId(Map<String, Object> accountMap);
}