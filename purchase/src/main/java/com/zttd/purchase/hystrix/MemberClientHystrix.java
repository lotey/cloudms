package com.zttd.purchase.hystrix;

import com.zttd.purchase.client.MemberClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MemberClientHystrix implements MemberClient {

    @Override
    public List<Map<String, Object>> queryMemberList(Map<String, Object> paramMap) {
        return null;
    }
}
