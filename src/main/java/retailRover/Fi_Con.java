package retailRover;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fi_Con {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}