package com.codename1.demos.grub;
import java.sql.*;

public class ConectorBBDD {
	
	public ConectorBBDD() {
		
		try {
			
			 conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servify", "Tomy", "tomy");
			
			 
			
		}catch(Exception e) {
			
			System.out.println("Imposible acceder a la BBDD");
			
		}
	}

	private Connection conexion;

}

