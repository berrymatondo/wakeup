package com.wakeup.wakeup;

import com.wakeup.wakeup.resume.Resume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WakeupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WakeupApplication.class, args);
	}

	@Scheduled(initialDelay = 2000L, fixedDelayString = "${someJob.delay}")
	void someJob() throws Exception {
		/*
		 * System.out.println("Now is := " + new Date()); Thread.sleep(1000L);
		 */

		RestTemplate restTemplate = new RestTemplate();
		// Resume resume =
		// restTemplate.getForObject("http://localhost:9050/peb/resumes/1",
		// Resume.class);
		Resume resume = restTemplate.getForObject("https://pebback.herokuapp.com/peb/resumes/1", Resume.class);
		System.out.println("Resume vaut:= " + resume.getResumeId());

	}

}

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled", matchIfMissing = true)
class scheduleConfig {
}
