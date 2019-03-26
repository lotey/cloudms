package com.zttd.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class User {
    private Integer id;

    private String userName;

    private String salt;

    private String nickName;

    private String sex;

    private String qq;

    private String weixin;

    private String status;

    private String isOnline;

    private String type;

    private String handicap;

    private Integer parentUserId;

    private String headimg;

    private String advertisement;

    private String openid;

    private String remarks;

    private String shortUrl;

    private String referUrl;

    private String wechatType;

    private String isEnableRobot;

    private Integer robotUserCount;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}