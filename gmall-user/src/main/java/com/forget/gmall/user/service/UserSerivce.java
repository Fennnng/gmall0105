package com.forget.gmall.user.service;

import com.forget.gmall.user.bean.UmsMember;
import com.forget.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author Feng
 * @create 2019-11-27-15:44
 */
public interface UserSerivce {


    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    int insertReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    int updateReceiveAddress(UmsMemberReceiveAddress ra);

    int deleteReceiveAddress(UmsMemberReceiveAddress ra);
}
