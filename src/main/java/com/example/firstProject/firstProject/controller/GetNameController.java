package com.example.firstProject.firstProject.controller;

import com.example.firstProject.firstProject.bean.InformationResponse;
import com.example.firstProject.firstProject.bean.InformationRequest;
import com.example.firstProject.firstProject.component.GetNameComponent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetNameController {

    private GetNameComponent getNameComponent = new GetNameComponent();

    @PostMapping("/create")
    public InformationResponse informationApi(@RequestBody InformationRequest request) {
        return getNameComponent.apiTest(request);
    }
}
