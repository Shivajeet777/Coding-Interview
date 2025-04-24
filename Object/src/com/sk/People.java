package com.sk;

public class People implements Runnable
{
	
	class inner
	{
	    public void innerClass()
	    {
	    	System.out.println("innerClass");
	    }
	}
	
	
    public void outerClass()
    {
    	System.out.println("outerClass");
    }
    
    public void run() {
        System.out.println("Runnable thread running...");
    }
	
	

}
