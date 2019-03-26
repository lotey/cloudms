package com.zttd.purchase.client;

import com.zttd.purchase.hystrix.MemberClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;

@FeignClient(name = "member",fallback = MemberClientHystrix.class)
public interface MemberClient {

    @GetMapping(value = "/user/queryMemberList",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Map<String,Object>> queryMemberList(@RequestParam Map<String,Object> paramMap);
}
