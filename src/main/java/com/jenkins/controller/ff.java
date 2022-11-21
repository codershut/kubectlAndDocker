package com.jenkins.controller;

public class ff {
	
	public static void main(String[] args) {
		
		System.err.println(urnValidation("22010000932236392"));
	}
	
	
	public static boolean urnValidation(String urn)
    {
        Boolean t=false;
        if(urn.length()<=20)
            t=urn.matches("^[a-zA-Z0-9]*$");
        
        return t;
        
    }

}
