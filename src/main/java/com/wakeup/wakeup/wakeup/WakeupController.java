package com.wakeup.wakeup.wakeup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WakeupController {

    @Autowired
    private WakeupService wakeUpService;

    @GetMapping("/wakeup")
    public String wakeUp() {
        return wakeUpService.wakeUp();
    }

}
