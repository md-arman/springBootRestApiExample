package springbootrest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This tells app that 1. it is starting point
//2. create a servlet container
//3. host this application in that servlet container and make it available
@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args)
    {
        //1. sets up default config ()
        //2. starts Spring application context
        //3. perform classpath scan
        //4. starts tomcat server
        SpringApplication.run(CourseApiApp.class, args);
    }
}
