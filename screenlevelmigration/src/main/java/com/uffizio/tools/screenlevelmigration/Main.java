package com.uffizio.tools.screenlevelmigration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sourceDBHost = "127.0.0.1";
		String sourceDBPort = "3306";
		String sourceDBUsername = "root";
		String sourceDBPassword = "root";
		String sourceDBName = "gps0817";
		String sourceConnectionString = 
				"jdbc:mysql://" 
				+ sourceDBHost + ":" + sourceDBPort 
				+ "/" + sourceDBName 
				+ "?user=" + sourceDBUsername 
				+ "&password=" + sourceDBPassword 
				+ "&autoReconnect=true"
				+ "&characterEncoding=UTF-8"
				+ "&useUnicode=true"
				+ "&useCursorFetch=true";

		String destinationDBHost = "127.0.0.1";
		String destinationDBPort = "3306";
		String destinationDBUsername = "root";
		String destinationDBPassword = "root";
		String destinationDBName = "gps1206";
		String destinationConnectionString =
				"jdbc:mysql://" 
				+ destinationDBHost + ":" + destinationDBPort 
				+ "/" + destinationDBName 
				+ "?user=" + destinationDBUsername 
				+ "&password=" + destinationDBPassword 
				+ "&autoReconnect=true"
				+ "&characterEncoding=UTF-8"
				+ "&useUnicode=true"
				+ "&useCursorFetch=true";

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection sourceConnection = DriverManager.getConnection(sourceConnectionString);
		Connection destinationConnection = DriverManager.getConnection(destinationConnectionString);
		
		ResultSet resultSet;
		Statement statement;
		
		
	}

}
