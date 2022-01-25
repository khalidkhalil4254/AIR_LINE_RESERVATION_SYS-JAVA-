package java_OutDoorTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.sql.*;


public class Events extends GUI{
	String table1="create table psngr(passenger_name varchar(50) not null,passenget_address text,passpot_no varchar(24),passenger_status varchar(20),primary key(passpot_no));";
	String table2="create table resrv(passpot_no varchar(24),resrvation_date varchar(10),pnr_No varchar(24),flight_no varchar(24),origin_distenation text,class varchar(15),branch_code varchar(10),ticket_fare varchar(10),service_code varchar(10),flight_type varchar(10),total_fare varchar(10),flight_date varchar(10),primary key(flight_no),foreign key(passpot_no) references psngr(passpot_no));";
	String user="khalid";
	String pass="khalid";
	String database="outDoor";
	DB db;
	
	
	Events(){
		//Event to exiting the main Form.
		exit_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}  
			});
		
		
		
		//Event to clear data in the main Form.
		cancel_btn.addActionListener(new ActionListener(){  
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//clearing data in texFields
						reservDate_tf.setText("");
						pnrNo_tf.setText("");
						flightDate_tf.setText("");
						flightNo_tf.setText("");
						originDest_tf.setText("");
						passengerName_tf.setText("");
						passsengerAddress_tf.setText("");
						passportNo_tf.setText("");
						ticketFare_tf.setText("");
						serviceCode_tf.setText("");
						totalFare_tf.setText("");
						
						//clearing data in comboBoxs
						_class_cb.setSelectedIndex(0);
						passengerStatus_cb.setSelectedIndex(0);
						branchCode_cb.setSelectedIndex(0);
						flightType_cb.setSelectedIndex(0);
						
						//clearing data in the extra textFields
						tf0.setText("");
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
					}  
					});
		
		
				
		
		add_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				db=new DB(user,pass,database);
				try {
					db.createTables(table1,table2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String reservDate=reservDate_tf.getText();
				String pnrNo=pnrNo_tf.getText();
				String flightDate=flightDate_tf.getText();
				String flightNo=flightNo_tf.getText();
				String originDest=originDest_tf.getText();
				String passengerName=passengerName_tf.getText();
				String passsengerAddress=passsengerAddress_tf.getText();
 				String passportNo=passportNo_tf.getText();
				String ticketFare=ticketFare_tf.getText();
				String serviceCode=serviceCode_tf.getText();
				String totalFare=totalFare_tf.getText();
				String _class=_class_cb.getSelectedItem().toString();
				String passengerStatus=passengerStatus_cb.getSelectedItem().toString();
				String branchCode =branchCode_cb.getSelectedItem().toString();
				String flightType=flightType_cb.getSelectedItem().toString();
				
				
				
				
				String q0="insert into psngr(passenger_name,passenget_address,passpot_no,passenger_status) values('"+passengerName+"','"+passsengerAddress+"','"+passportNo+"','"+passengerStatus+"')";
				String q1="insert into resrv(resrvation_date,pnr_No,flight_no,origin_distenation,class,branch_code,ticket_fare,service_code,flight_type,total_fare,flight_date) values('"+reservDate+"','"+pnrNo+"','"+flightNo+"','"+originDest+"','"+_class+"','"+branchCode+"','"+ticketFare+"','"+serviceCode+"','"+flightType+"','"+totalFare+"','"+flightDate+"')";
				//calling method that adds data into database(located in DB class)
				db.sqlAdd(q0,q1);	
				
				reservDate_tf.setText("");
				pnrNo_tf.setText("");
				flightDate_tf.setText("");
				flightNo_tf.setText("");
				originDest_tf.setText("");
				passengerName_tf.setText("");
				passsengerAddress_tf.setText("");
 				passportNo_tf.setText("");
				ticketFare_tf.setText("");
				serviceCode_tf.setText("");
				totalFare_tf.setText("");
				_class_cb.setSelectedIndex(0);
				passengerStatus_cb.setSelectedIndex(0);
				branchCode_cb.setSelectedIndex(0);
				flightType_cb.setSelectedIndex(0);
				
			}  
			});
		
		
		
		delete_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				db=new DB(user,pass,database);
				try {
					db.createTables(table1,table2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String passportNo=passportNo_tf.getText();
				String flightNo=flightNo_tf.getText();			
				String q0="delete from psngr where passpot_no='"+passportNo+"'";
				String q1="delete from resrv where flight_no='"+flightNo+"'";
	
				db.sqlDelete(q0,q1);	
				passportNo_tf.setText("");
				flightNo_tf.setText("");
			}  
			});
		
				
				
		
		find_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				db=new DB(user,pass,database);
				try {
					db.createTables(table1,table2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String passportNo=passportNo_tf.getText();
				String flightNo=flightNo_tf.getText();
				
				try {
					String s0="select * from psngr where passpot_no='"+passportNo+"'";
					String s1="select * from resrv where flight_no='"+flightNo+"'";
					ResultSet rs0=db.sqlFind(s0);
					ResultSet rs1=db.sqlFind(s1);
					
					rs0.next();
					rs1.next();
					reservDate_tf.setText(rs1.getString("resrvation_date"));
					pnrNo_tf.setText(rs1.getString("pnr_No"));
					flightDate_tf.setText(rs1.getString("flight_date"));
					originDest_tf.setText(rs1.getString("origin_distenation"));
					passengerName_tf.setText(rs0.getString("passenger_name"));
					passsengerAddress_tf.setText(rs0.getString("passenget_address"));
					ticketFare_tf.setText(rs1.getString("ticket_fare"));
					serviceCode_tf.setText(rs1.getString("service_code"));
					totalFare_tf.setText(rs1.getString("total_fare"));
					
					
					
					_class_cb.setSelectedItem(rs1.getString("class"));
					passengerStatus_cb.setSelectedItem(rs0.getString("passenger_status"));
					branchCode_cb.setSelectedItem(rs1.getString("branch_code"));
					flightType_cb.setSelectedItem(rs1.getString("flight_type"));
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1);
				}  
				 
			}  
			});
		
		
		
		
		
		edit_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				db=new DB(user,pass,database);
				try {
					db.createTables(table1,table2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String reservDate=reservDate_tf.getText();
				String pnrNo=pnrNo_tf.getText();
				String flightDate=flightDate_tf.getText();
				String flightNo=flightNo_tf.getText();
				String originDest=originDest_tf.getText();
				String passengerName=passengerName_tf.getText();
				String passsengerAddress=passsengerAddress_tf.getText();
 				String passportNo=passportNo_tf.getText();
				String ticketFare=ticketFare_tf.getText();
				String serviceCode=serviceCode_tf.getText();
				String totalFare=totalFare_tf.getText();
				String _class=_class_cb.getSelectedItem().toString();
				String passengerStatus=passengerStatus_cb.getSelectedItem().toString();
				String branchCode =branchCode_cb.getSelectedItem().toString();
				String flightType=flightType_cb.getSelectedItem().toString();
				
				
				
				
				String q0="UPDATE psngr SET passenger_name='"+passengerName+"',passenget_address='"+passsengerAddress+"',passpot_no='"+passportNo+"',passenger_status='"+passengerStatus+"' WHERE passpot_no='"+passportNo+"'";
				String q1="UPDATE resrv SET resrvation_date='"+reservDate+"',pnr_No='"+pnrNo+"',flight_no='"+flightNo+"',origin_distenation='"+originDest+"',class='"+_class+"',branch_code='"+branchCode+"',ticket_fare='"+ticketFare+"',service_code='"+serviceCode+"',flight_type='"+flightType+"',total_fare='"+totalFare+"',flight_date='"+flightDate+"' WHERE flight_no='"+flightNo+"'";
				//calling method that adds data into database(located in DB class)
				db.sqlAdd(q0,q1);	
				
				reservDate_tf.setText("");
				pnrNo_tf.setText("");
				flightDate_tf.setText("");
				flightNo_tf.setText("");
				originDest_tf.setText("");
				passengerName_tf.setText("");
				passsengerAddress_tf.setText("");
 				passportNo_tf.setText("");
				ticketFare_tf.setText("");
				serviceCode_tf.setText("");
				totalFare_tf.setText("");
				_class_cb.setSelectedIndex(0);
				passengerStatus_cb.setSelectedIndex(0);
				branchCode_cb.setSelectedIndex(0);
				flightType_cb.setSelectedIndex(0);
			}  
			});
		
		
		
		
		
		print_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					
					String reservDate=reservDate_tf.getText();
					String pnrNo=pnrNo_tf.getText();
					String flightDate=flightDate_tf.getText();
					String flightNo=flightNo_tf.getText();
					String originDest=originDest_tf.getText();
					String passengerName=passengerName_tf.getText();
					String passsengerAddress=passsengerAddress_tf.getText();
	 				String passportNo=passportNo_tf.getText();
					String ticketFare=ticketFare_tf.getText();
					String serviceCode=serviceCode_tf.getText();
					String totalFare=totalFare_tf.getText();
					String _class=_class_cb.getSelectedItem().toString();
					String passengerStatus=passengerStatus_cb.getSelectedItem().toString();
					String branchCode =branchCode_cb.getSelectedItem().toString();
					String flightType=flightType_cb.getSelectedItem().toString();
					
					String all=reservDate+"\n"+pnrNo+"\n"+flightDate+"\n"+flightNo+"\n"+originDest+"\n"+passengerName+"\n"+passsengerAddress+"\n"+passportNo+"\n"+ticketFare+"\n"+serviceCode+"\n"+totalFare+"\n"+_class+"\n"+passengerStatus+"\n"+branchCode+"\n"+flightType;
					
					JTextField x=new JTextField(all);
					
					x.print();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("Error:"+e1);
				}
				
			}  
			});
		
		
		
		
		save_btn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String reservDate=reservDate_tf.getText();
				String pnrNo=pnrNo_tf.getText();
				String flightDate=flightDate_tf.getText();
				String flightNo=flightNo_tf.getText();
				String originDest=originDest_tf.getText();
				String passengerName=passengerName_tf.getText();
				String passsengerAddress=passsengerAddress_tf.getText();
 				String passportNo=passportNo_tf.getText();
				String ticketFare=ticketFare_tf.getText();
				String serviceCode=serviceCode_tf.getText();
				String totalFare=totalFare_tf.getText();
				String _class=_class_cb.getSelectedItem().toString();
				String passengerStatus=passengerStatus_cb.getSelectedItem().toString();
				String branchCode =branchCode_cb.getSelectedItem().toString();
				String flightType=flightType_cb.getSelectedItem().toString();
				
				String all="reservDate : "+reservDate+"\n\n"+"pnrNo : "+pnrNo+"\n\n"+"flightDate : "+flightDate+"\n\n"+"flightNo : "+flightNo+"\n\n"+"originDest : "+originDest+"\n\n"+"passengerName : "+passengerName+"\n\n"+"passsengerAddress : "+passsengerAddress+"\n\n"+"passportNo : "+passportNo+"\n\n"+"ticketFare : "+ticketFare+"\n\n"+"serviceCode : "+serviceCode+"\n\n"+"totalFare : "+totalFare+"\n\n"+"_class : "+_class+"\n\n"+"passengerStatus : "+passengerStatus+"\n\n"+"branchCode : "+branchCode+"\n\n"+"flightType : "+flightType;
				
				
				try {
					db.fileCreating("out", all);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				reservDate_tf.setText("");
				pnrNo_tf.setText("");
				flightDate_tf.setText("");
				flightNo_tf.setText("");
				originDest_tf.setText("");
				passengerName_tf.setText("");
				passsengerAddress_tf.setText("");
 				passportNo_tf.setText("");
				ticketFare_tf.setText("");
				serviceCode_tf.setText("");
				totalFare_tf.setText("");
				_class_cb.setSelectedIndex(0);
				passengerStatus_cb.setSelectedIndex(0);
				branchCode_cb.setSelectedIndex(0);
				flightType_cb.setSelectedIndex(0);
				
			}  
			});
								
	}	
	
}
