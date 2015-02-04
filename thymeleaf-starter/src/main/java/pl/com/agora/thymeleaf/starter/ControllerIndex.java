package pl.com.agora.thymeleaf.starter;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {

    @RequestMapping("/")
    public String getIndex(Map<String, Object> model) throws InterruptedException, ExecutionException {

        model.put("articles", Collections.EMPTY_LIST);
        return "index";
    }

}
