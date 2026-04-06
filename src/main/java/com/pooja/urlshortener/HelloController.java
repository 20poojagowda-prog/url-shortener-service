@RestController
public class HelloController {

    @GetMapping("/test")
    public String hello() {
        return "Hello";
    }
}