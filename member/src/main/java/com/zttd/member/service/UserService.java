package com.zttd.member.service;

import com.zttd.member.dao.UserMapper;
import com.zttd.member.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<Map<String,Object>> queryMemberList(Map<String,Object> paramMap) {
        return userMapper.getMemberList(paramMap);
    }

    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
