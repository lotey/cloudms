package com.zttd.member.dao;

import com.zttd.member.model.User;
import org.apache.ibatis.annotations.Select;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
    
    Map<String, Object> getUserInfoById(int userId);
    
    List<Map<String, Object>> getUserList(Map<String, Object> paramMap);

    int getUserListCount(Map<String, Object> paramMap);

    List<User> selectByOpenId(String openId);

    User selectAdminUserByUserId(Map<String, Object> paramMap);

    List<User> selectUserByParam(Map<String, Object> paramMap);

    User selectByUserName(String userName);

    Map<String, Object> getUserInfoWithParentById(int userId);

    List<Map<String,Object>> getAllOnlineAgentUserList(Map<String, Object> paramMap);

    User findLastInsertSameNameUser(Map<String, Object> paramMap);

    User selectByShortUrl(String shortUrl);

    List<Map<String,Object>> getMemberList(Map<String, Object> paramMap);

    int getMemberListCount(Map<String, Object> paramMap);

    List<Map<String, Object>> getAgentUserList(Map<String, Object> paramMap);

    int getAgentUserListCount(Map<String, Object> paramMap);

    List<User> getTotalAgentWithRobotList(Map<String, Object> paramMap);

    BigDecimal statisticAgentSumAmt(Map<String, Object> paramMap);

    List<Map<String,Object>> statisticSumAmt(Map<String, Object> paramMap);

    @Select("SELECT * FROM t_user")
    List<User> queryAll();
}