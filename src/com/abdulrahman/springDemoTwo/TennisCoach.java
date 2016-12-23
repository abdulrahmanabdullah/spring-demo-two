package com.abdulrahman.springDemoTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    //define obj of FortuneService interface and call there methods for write @Autowwired
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    //define setter method for injection
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
*/

    @Override
    public String getDailyWork() {
        return "practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    //add any init method ...
    @PostConstruct
    public void doMystartupStuff() {
        System.out.println("this method for startup call method on applicationContext.xml and " +
                "init-method-> tag");
    }

    //add any destroy method ...
    @PreDestroy
    public void doMycleanStuff() {
        System.out.println("this method for cleaner OR PowerOf func , call method on applicationContext.xml and " +
                "destroy-method-> tag");
    }

}
