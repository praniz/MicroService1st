package com.javacode.example;

import com.javacode.example.registration.EurekaServer;
import com.javacode.example.rest.micro1.Micro1Server;

public class Main {
	public static void main(String[] args) {

		String serverName = "";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			serverName = args[0].toLowerCase();
			break;

		default:
			return;
		}

		if (serverName.equals("eureka")) {
			EurekaServer.main(args);
		} else if (serverName.equals("micro1")) {
			Micro1Server.main(args);
		} else if (serverName.equals("micro2")) {
			Micro1Server.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
		}
	}
}
