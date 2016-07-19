package com.model;

public class Modelcls {
	
	private String user;
	private String pass;
	public Modelcls(String user, String pass) {
		
		this.user = user;
		this.pass = pass;
		}
public int checkData()
{
	if(user.equals("saibaba")&&pass.equals("1234"))
	{
		return 0;
		}
	else
	{
		return 1;
	}


}

}
