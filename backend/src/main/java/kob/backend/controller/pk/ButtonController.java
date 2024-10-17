package kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class ButtonController {

    @RequestMapping("/getBotInfo")
    public List<String> getBotInfo() {
        List<String> list = new ArrayList<String>();
        list.add("sword");
        list.add("sword");
        return list;
    }
}
