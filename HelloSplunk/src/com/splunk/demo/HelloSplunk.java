package com.splunk.demo;

import java.util.HashMap;
import java.util.Map;

import com.splunk.Application;
import com.splunk.HttpService;
import com.splunk.SSLSecurityProtocol;
import com.splunk.Service;
import com.splunk.ServiceArgs;

public class HelloSplunk {

	public static void main(String[] args) {
		/*
		 * ServiceArgs connectionArgs = new ServiceArgs();
		 * connectionArgs.setHost("ubuntu-splunk"); connectionArgs.setUsername("admin");
		 * connectionArgs.setPassword("splunk"); connectionArgs.setPort(8089); // will
		 * login and save the session key which gets put in the HTTP Authorization
		 * header Service splunkService = Service.connect(connectionArgs);
		 * System.out.println("Auth Token : " + splunkService.getToken());
		 */
		
		/*
		 * Map<String, Object> connectionArgs = new HashMap<String, Object>();
		 * connectionArgs.put("host", "ubuntu-splunk"); connectionArgs.put("username",
		 * "admin"); connectionArgs.put("password", "splunk");
		 * connectionArgs.put("port", 8089); connectionArgs.put("scheme", "http");
		 * Service splunkService = Service.connect(connectionArgs);
		 * System.out.println(splunkService.getToken());
		 * 
		 * HttpService.setSslSecurityProtocol(SSLSecurityProtocol.TLSv1_2);
		 */
		
		ServiceArgs loginArgs = new ServiceArgs();
        loginArgs.setUsername("admin");
        loginArgs.setPassword("yourpassword");
        loginArgs.setHost("localhost");
        loginArgs.setPort(8089);
        
        Service service = Service.connect(loginArgs);
        
        for (Application app : service.getApplications().values()) {
            System.out.println(app.getName());
		
	}
	}
}
