package pl.daniels.simple.client;

import java.util.Date;

public class ComplicatedExample {

	private int value;
	private String name;
	private Date date;
	
	public ComplicatedExample(){
		
	}
	
	public ComplicatedExample(int value, String name, Date date){
		this.value = value;
		this.name = name;
		this.date = date;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
