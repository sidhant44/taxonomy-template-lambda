package com.ge.lambda.taxonomy.service;

import com.ge.lambda.taxonomy.model.MyModel;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String myService(MyModel myModel){
        return "Hi!  "+ myModel.getMessage();
    }
}
