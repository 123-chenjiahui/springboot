package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.mapper.addressMapper;
import com.itheima.pojo.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class addressService {
    @Autowired
    private addressMapper addressMapper;


    public Address queryById(int id) {

        Address address = addressMapper.selectByPrimaryKey(id);
        System.out.println(address.getLoc());
        return address;
    }


    public void saveAddress(Address address) {
        addressMapper.insert(address);
    }

    @Transactional
    public void deleteAddress(Integer id) {
        addressMapper.deleteByPrimaryKey(id);
    }
}
