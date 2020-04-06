package com.phos.soap.api.client;

import com.phos.soap.api.wsdl.CustomerRequest;
import com.phos.soap.api.wsdl.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CustomerSoapClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public CustomerResponse getLoanStatus(CustomerRequest request){
        template = new WebServiceTemplate(marshaller);

        CustomerResponse response = (CustomerResponse) template.marshalSendAndReceive("http://localhost:8080/ws",request);

        return response;
    }
}
