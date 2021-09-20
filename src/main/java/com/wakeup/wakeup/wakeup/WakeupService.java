package com.wakeup.wakeup.wakeup;

import com.wakeup.wakeup.resume.Resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WakeupService {

    @Autowired
    public WakeupService() {
    }

    public void wakeMeup() {
        RestTemplate restTemplate = new RestTemplate();
        Resume resume = restTemplate.getForObject("http://localhost:9050/peb/resumes/1", Resume.class);
        // Resume resume =
        // restTemplate.getForObject("https://pebback.herokuapp.com/peb/resumes/1",
        // Resume.class);
        System.out.println("Resume vaut:= " + resume.getResumeId());
    }
}
