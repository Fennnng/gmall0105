package com.forget.gmall.user.controller;

import com.forget.gmall.user.bean.UmsMember;
import com.forget.gmall.user.bean.UmsMemberReceiveAddress;
import com.forget.gmall.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Feng
 * @create 2019-11-27-15:43
 */

@Controller
public class UserController {

    @Autowired
    private UserSerivce us;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers=us.getAllUser();

        return umsMembers;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddress=us.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddress;
    }

    @RequestMapping("insertReceiveAddress")
    @ResponseBody
    public int insertReceiveAddress(String memberId){

        UmsMemberReceiveAddress ra = us.getReceiveAddressByMemberId(memberId).get(0);
        ra.setId("5");
        return us.insertReceiveAddress(ra);
    }

    @RequestMapping("updateReceiveAddress")
    @ResponseBody
    public int updateReceiveAddress(String memberId){

        UmsMemberReceiveAddress ra = us.getReceiveAddressByMemberId(memberId).get(3);
        ra.setName("张三");
        return us.updateReceiveAddress(ra);
    }

    @RequestMapping("deleteReceiveAddress")
    @ResponseBody
    public int deleteReceiveAddress(String memberId){

        UmsMemberReceiveAddress ra = us.getReceiveAddressByMemberId(memberId).get(3);
        return us.deleteReceiveAddress(ra);
    }



}
