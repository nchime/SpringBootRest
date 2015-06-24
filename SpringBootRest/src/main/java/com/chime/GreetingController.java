package com.chime;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/chime")
	String chime() {
		
		Date d = new Date();
		String dateStr = d.toString();
		return "Current Time : " + dateStr;
	}
	
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    
    @RequestMapping("/probboard")
    public ProbBoarding probboard(@RequestParam(value="name", defaultValue="홍길동") String name) {
    	
		Date d = new Date();
		String dateStr = d.toString();
		
		Greeting greeting = new Greeting(100, "Sub Content"); 
		
        return new ProbBoarding(dateStr, "title_test", "content_test", name, greeting);
    }
    
    @RequestMapping("/probboard2")
    public ProbBoarding[] probboard2(@RequestParam(value="name", defaultValue="홍길동") String name) {
    	
		Date d = new Date();
		String dateStr = d.toString();
		String titileStr = "";
		String contentStr = "";
		String writerStr = ""; 
		
		int[] test = new int[5]; 
		
		ProbBoarding[] arrayProb = new ProbBoarding[5];
		Greeting greeting[] = new Greeting[5]; 

		for (int i = 0; i < arrayProb.length; i++) {
			greeting[i] = new Greeting(100+i, "Sub Content" + Integer.toString(i)); 
			
			arrayProb[i] = new ProbBoarding(dateStr, titileStr + Integer.toString(i), contentStr + Integer.toString(i), writerStr + Integer.toString(i), greeting[i]);
		}
		
		
        return arrayProb;
    }
	

}
