package com.forget.gmall.user.service.impl;

import com.forget.gmall.user.bean.UmsMember;
import com.forget.gmall.user.bean.UmsMemberReceiveAddress;
import com.forget.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.forget.gmall.user.mapper.UserMapper;
import com.forget.gmall.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Feng
 * @create 2019-11-27-15:44
 */
@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    UserMapper um;

    @Autowired
    UmsMemberReceiveAddressMapper umram;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers=um.selectAll();//um.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umra=new UmsMemberReceiveAddress();
        umra.setMemberId(memberId);
        return umram.select(umra);
    }

    @Override
    public int insertReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return umram.insert(umsMemberReceiveAddress);
    }

    @Override
    public int updateReceiveAddress(UmsMemberReceiveAddress ra) {
        return umram.updateByPrimaryKey(ra);
    }

    @Override
    public int deleteReceiveAddress(UmsMemberReceiveAddress ra) {
        return umram.delete(ra);
    }
}
