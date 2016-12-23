package com.abdulrahman.springDemoTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by abdulrahman on 12/23/16.
 */
public class MainForAnnoation {


    public static void main(String[] args) {


        //read spring config  file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanCompnentApplicationContext.xml");
        //get the bean from spring container
        //First arg for the id , inside TennisCoach.class .
        CoachTwo theCoach = context.getBean("ThaiSillyCoach", CoachTwo.class);
        //call method on the bean .
        System.out.println(theCoach.getDialyWorkOut());
        //close the context .
        context.close();
    }
}
