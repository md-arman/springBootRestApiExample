package springbootrest.demo.hello;

//web after springframework means SPRING MVC ANNOTATION
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //ReqMapping maps to HTTP GET by default.
    // (For others like POST, PUT, DELETE mention explicitly in annotation)
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hi";
    }
    
}
