package com.itheima.controller;


import com.itheima.pojo.Address;
import com.itheima.service.addressService;
import org.elasticsearch.cluster.metadata.AliasAction;
import org.elasticsearch.search.fetch.subphase.InnerHitsFetchSubPhase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    private addressService addressService;

/*    @GetMapping("/es/{id}")
    public Address queryById(@PathVariable Integer id) {
        return addressService.queryById(id);
    }*/

    @GetMapping("/es/save")
    public void saveAddress() {
        Address address = new Address();
        address.setLoc("北京");
        address.setUsername("张三");
        address.setId(23);
        addressService.saveAddress(address);
    }

    @GetMapping("/es/{id}")
    public void deleteAddress(@PathVariable  Integer id) {
        addressService.deleteAddress(id);
    }

}

