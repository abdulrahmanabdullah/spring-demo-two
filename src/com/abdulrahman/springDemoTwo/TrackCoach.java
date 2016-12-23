package com.abdulrahman.springDemoTwo;

/**
 * Created by abdulrahman on 12/23/16.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService ;

    private String userName ;
    private String emailAddress  ;


    //Create empty constructor .
//    public TrackCoach(){
//       System.out.println("empty constructor inside TrackCoach.class ... ");
//
//    }


    //setter method ..
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(fortuneService);
        this.fortuneService = fortuneService;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    //Getter method :


    public String getUserName() {
        return userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    @Override
    public String getDailyWork() {
        return "This Project for understode spring works ";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do'it  : " + fortuneService.getFortune();
    }

    //add any init method ...
    public void doMystartupStuff(){

        System.out.println("this method for startup call method on applicationContext.xml and " +
                "init-method-> tag");
    }

    //add any destroy method ...
    public void doMycleanStuff(){
        System.out.println("this method for cleaner OR PowerOf func , call method on applicationContext.xml and " +
                "destroy-method-> tag");
    }
}
