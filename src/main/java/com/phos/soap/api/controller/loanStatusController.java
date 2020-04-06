package com.phos.soap.api.controller;

import com.phos.soap.api.client.CustomerSoapClient;
import com.phos.soap.api.wsdl.CustomerRequest;
import com.phos.soap.api.wsdl.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loanStatusController {

    @Autowired
    private CustomerSoapClient customerSoapClient;

    @RequestMapping("/getLoanStatus")
    public CustomerResponse invokeGetLoanStatus(@RequestBody CustomerRequest request){
        return customerSoapClient.getLoanStatus(request);
    }
}
