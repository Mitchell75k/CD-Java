package java_spring._notes_.Url_and_Path_Variables;

//This file is meeant to display how we can send data to our server using the URL and Path Variables
//We will be using the @PathVariable annotation to accomplish this
//@PathVariable is used to extract the values of the template variables and assign them to method parameters
//The @PathVariable annotation can be used to handle template variables in the request URI mapping, and use them as method parameters


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//In this example we will be referencing the following URL: http://login.codingdojo.com/m/59/5436/33349
//The URL above is a URL that we will be using to access a specific lesson in a specific module in a specific course
//each of the numbers in the URL above are template variables, which act as placeholders for the actual values that we want to pass to the server
//so in this example, the courseId is 59, the moduleId is 5436, and the lessonId is 33349. They basically locate the data that we want to access

@RestController
public class Example {
    @RequestMapping("/m/{courseId}/{moduleId}")                                                                         //this is the route that we will be using to access the following method
    public String showLesson(@PathVariable("courseId") String courseId, @PathVariable("moduleId") String moduleId){    //we use the @PathVariable annotation to get the values of the template variables and assign them to the method parameters
        //the @PathVariable annotation is used to handle template variables in the request URI mapping, and use them as method parameters
        //so in this example we are using the @PathVariable annotation to get the values of the courseId and moduleId template variables and assign them to the courseId and moduleId method parameters
    	return "Course: " + courseId + ", Module: " + moduleId;
    }
}
