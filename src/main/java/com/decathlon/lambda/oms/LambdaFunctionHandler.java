package com.ge.lambda.taxonomy;

import com.ge.lambda.taxonomy.config.AbstractHandler;
import com.ge.lambda.taxonomy.config.SpringConfig;
import com.ge.lambda.taxonomy.model.MyModel;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ge.lambda.taxonomy.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;

/*
author : 212709017
 */
public class LambdaFunctionHandler extends AbstractHandler<SpringConfig> implements RequestHandler<MyModel, String> {

    /*
        this is the handler for lambda to invoke : mention the fully qualified path of class and method in AWS Lambda configuration
     */
    public String myFirstHandler(MyModel myModel, Context context){
        System.out.println(myModel.toString());
        return handleRequest(myModel,context);
    }

    /*
        this is the overridden method of RequestHandler
     */
    @Override
    public String handleRequest(MyModel input, Context context) {
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        MyService myService=getApplicationContext().getBean(MyService.class);  // this is to load the spring context to create beans for Dependency injection
        return myService.myService(input);
    }

}
