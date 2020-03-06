package in.co.hubapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }
    @GetMapping("/about_us")
    public String about() {
        return "about_us";
    }
    @GetMapping("/contact_us")
    public String contact() {
        return "contact_us";
    }
    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

	/*
	 * @GetMapping("/login") public String login() { return "login"; }
	 */
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }

}