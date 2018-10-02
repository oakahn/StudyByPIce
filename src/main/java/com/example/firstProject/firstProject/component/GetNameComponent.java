package com.example.firstProject.firstProject.component;

import com.example.firstProject.firstProject.bean.InformationRequest;
import com.example.firstProject.firstProject.bean.InformationResponse;
import org.springframework.stereotype.Service;

@Service
public class GetNameComponent {

    public InformationResponse apiTest(InformationRequest request) {
        if (request.getFirstName() == null && request.getLastName() == null) return  null;
        InformationResponse response = new InformationResponse();
        response.setFullName(request.getFirstName() + " " + request.getLastName());
        return response;
    }
}
