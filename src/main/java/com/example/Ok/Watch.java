package com.example.Ok;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch implements ISimpleWatch {

    public String getTime() {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		System.out.println(format.format(new Date()));
		return format.format(new Date());
	}


}
