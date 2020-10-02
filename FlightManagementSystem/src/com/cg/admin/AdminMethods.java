package com.cg.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.JdbcUtility.JdbcUtility;

public class AdminMethods{
	static Connection con = null;
 
public static int addFlights(String flightNumber,String flightModel,String carrierName,String seatCapacity,String cost) {
		
		int rows =0;
		
		try {
			con = JdbcUtility.connect();

		String query = "insert into flight values(?,?,?,?,?);";
		PreparedStatement ps;
			ps = con.prepareStatement(query);
			ps.setString(1, flightNumber);
			ps.setString(2, flightModel);
			ps.setString(3, carrierName);
			ps.setString(4, seatCapacity);
			ps.setString(5, cost);
			
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
public static ResultSet availableFlights() {
	ResultSet rs = null;
try {
	con = JdbcUtility.connect();
	String query = "select flightnumber,flightmodel,carriername from flight;";
	PreparedStatement ps = con.prepareStatement(query);
	rs = ps.executeQuery();
	
	
}
catch(Exception e) {
	
}
return rs;

}
public static int viewScheduleFlights(String flightNumber,String availableSeats,String ticketCost,String sourceAirport,String destinationAirport,String departuredt,String arrivaldt,String flightStatus) throws ClassNotFoundException, SQLException {
	int rows = 0;
	try {
	con = JdbcUtility.connect();
	
	String query = "insert into scheduleflight values(?,?,?,?,?,?,?,?);";
	PreparedStatement ps;
	ps = con.prepareStatement(query);
	ps.setString(1, flightNumber);
	ps.setString(2, availableSeats);
	ps.setString(3, ticketCost);
	ps.setString(4, sourceAirport);
	ps.setString(5, destinationAirport);
	ps.setString(6, departuredt);
	ps.setString(7, arrivaldt);
	ps.setString(8, flightStatus);
	
	
	rows = ps.executeUpdate();
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

return rows;
}
public static void modifyLocation(String flightNumber,String sourceAirport,String destinationAirport) {
	int rows=0;
	PreparedStatement ps=null;

	try {
		con = JdbcUtility.connect();
		String query = "update scheduleflight set sourceairport =?,destinationairport=?where flightnumber =?";;
		
ps = con.prepareStatement(query);
ps.setString(1, sourceAirport);
ps.setString(2, destinationAirport);
ps.setString(3, flightNumber);
rows = ps.executeUpdate();
if(rows != 0) {
	System.out.println("updated");
} else {
	System.out.println("not updated");
}

}
catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} 
		
}
public static void modifyTimings(String flightNumber,String departuredt,String arrivaldt) {
	int rows =0;
	PreparedStatement ps=null;
	try {
		con = JdbcUtility.connect();
		String query = "update scheduleflight set departuredatetime =?,arrivaldatetime=? where flightNumber =?";;
		
		ps = con.prepareStatement(query);
		ps.setString(1, departuredt);
		ps.setString(2, arrivaldt);
		ps.setString(3, flightNumber);
		rows =ps.executeUpdate();
	
		
		
}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
public static void cancelFlight(String flightNumber){
	int rows =0;
	try {
		con = JdbcUtility.connect();	
		String query = "delete  from scheduleflight where flightnumber ="+flightNumber;
		PreparedStatement ps;
		ps = con.prepareStatement(query);
		rows = ps.executeUpdate();
	
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}
public static ResultSet searchFlight(String flightNumber) {
	Statement st =  null;
	ResultSet rs = null;
	try {
		con = JdbcUtility.connect();
		st = con.createStatement();
		String query = "select * from scheduleflight;";
		rs = st.executeQuery(query);
		
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	return rs;
}
}

