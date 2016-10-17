package com.connects.model;

import java.util.Date;

public class OutputMessage extends Message {
	public OutputMessage(Message original, Date time) {
        
		
		super(original.getId(), original.getMessage());
       
        
        System.out.println("in output Message class");
        this.time = time;
    }
	
	
	
	
	

private Date time;

public Date getTime() {
	return time;
}

public void setTime(Date time) {
	this.time = time;
}




}
