package com.abdulrahman.springDemoTwo;

import org.springframework.stereotype.Component;

/**
 * Created by abdulrahman on 12/23/16.
 */
@Component("ThaiSillyCoach")
public class TennisCoach implements CoachTwo {
    @Override
    public String getDialyWorkOut() {
        return "Create a new InterFace call CoachTwo and new class call TeinnsCoach ";
    }
}
