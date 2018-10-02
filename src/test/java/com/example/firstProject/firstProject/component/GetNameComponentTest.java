package com.example.firstProject.firstProject.component;

import com.example.firstProject.firstProject.bean.InformationRequest;
import com.example.firstProject.firstProject.bean.InformationResponse;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.Assert.*;

public class GetNameComponentTest {

    @Test
    public void createSuccess() {
        //given
        GetNameComponent component = new GetNameComponent();

        //when
        InformationRequest request = new InformationRequest();
        request.setFirstName("Chayawat");
        request.setLastName("Suntornrak");

        InformationResponse response = component.apiTest(request);

        //then
        assertThat(response).isNotNull();

    }

    @Test
    public void createFail() {
        //given
        GetNameComponent component = new GetNameComponent();

        //when
        InformationRequest request = new InformationRequest();
//        request.setFirstName("Chayawat");
//        request.setLastName("Suntornrak");

        InformationResponse response = component.apiTest(request);

        //then
        assertThat(response).isNull();
    }
}