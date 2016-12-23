package com.abdulrahman.springDemoTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by abdulrahman on 12/23/16.
 */
public class HelloDemoApp
{

    public static void main(String[] args) {


        //load configuration spring file .
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean form spring container
        TrackCoach theCoach = context.getBean("myCoach",TrackCoach.class);

        //print out result
            System.out.println(theCoach.getDailyWork());
//            System.out.println(theCoach.getDailyFortune());
//            System.out.println(theCoach.getUserName());
//            System.out.println(theCoach.getEmailAddress());



        //close the context .
            context.close();
    }
}
