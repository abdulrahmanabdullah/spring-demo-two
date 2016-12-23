package com.abdulrahman.springDemoTwo;

/**
 * Created by abdulrahman on 12/23/16.
 */
public class HappyFortuneService implements FortuneService
{

    @Override
    public String getFortune() {
        return "this part inside HappyFortuneService implements FortuneService ...";
    }
}
