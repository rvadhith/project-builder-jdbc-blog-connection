package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		Connection con = null;
		con = ConnectionManager.getConnection();
		
		System.out.println("I am here");
		
		if(con != null) {
			System.out.println("Connection Established.");
		}
		else {
			System.out.println("Check your Connection.");
		}
	}
}
