package org.shravan.controller;

import org.shravan.dao.Mobile_Os_Dao;
import org.shravan.dto.Mobile;
import org.shravan.dto.Os;

public class Mobile_Os_Controller 
{
	
	public static void main(String[] args)
	{
		
		Mobile mobile=new Mobile();
		mobile.setId(102);
		mobile.setName("poco");
		mobile.setColor("black");
		mobile.setPrice(12699);
		
		Os os=new Os();
		os.setId(102);
		
		os.setBit("11");
		os.setName("android");
		
		//
		mobile.setOs(os);
		
		Mobile_Os_Dao dao=new Mobile_Os_Dao();
		 dao.saveMobile(mobile);
		 dao.saveOs(os);
		
	}
	

}