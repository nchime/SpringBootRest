package com.chime;

public class ProbBoarding {
	
	private final String regiDate;
	private final String title;
	private final String content;
	private final String writer;
	private final Greeting greeting; 
	
	public ProbBoarding(String regiDate, String title, String content, String writer, Greeting greeting) {
		this.regiDate = regiDate;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.greeting = greeting;
	}
	
/*	public ProbBoarding() {
		this.regiDate = ""; 
		this.title = "";
		this.content = "";
		this.writer = "";
	}
	
*/	

	public String getRegiDate() {
		return regiDate;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public Greeting getGreeting() {
		return greeting;
	}
	
	
	
	
	
	
	

	
	

}
