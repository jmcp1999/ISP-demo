package com.example.Fail;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartWatch implements IWatch {

    public String getTime() {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		System.out.println(format.format(new Date()));
		return format.format(new Date());
	}

	public String getEmailNotifications() throws Exception {
			return "You have 2 emails";
	}

}
