package com.abdulrahman.springDemoTwo;

import org.springframework.stereotype.Component;

/**
 * Created by abdulrahman on 12/23/16.
 */
@Component
public class HappyFortuneService implements FortuneService
{

    @Override
    public String getFortune() {
        return "this part inside HappyFortuneService implements FortuneService ...";
    }


}
