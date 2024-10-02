package com.musab.firstboot;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    private final MyFirstClass myFirstClass;
    private final Environment environment;


    public MainService(MyFirstClass myFirstClass, Environment environment) {
        this.myFirstClass = myFirstClass;
        this.environment = environment;
    }

    public String tellStory() {
        return "Once upon a time " + myFirstClass.sayHello();
    }

    public String getOsName() {
        return environment.getProperty("os.name");
    }
}
