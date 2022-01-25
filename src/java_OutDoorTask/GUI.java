package java_OutDoorTask;

import javax.swing.*;
import java.awt.*;

public class GUI {
		//creating fonts we gonna use
		Font  title_font  = new Font(Font.SANS_SERIF,  Font.BOLD, 26);
		Font  subTitle_font  = new Font(Font.SANS_SERIF,  Font.BOLD, 16);
		//creating GUI elements :-
		//creating stage(container of scenes) :-
		public JFrame frame=new JFrame("AIR-LINE-RESERVATION");
		
		//creating scene(container of elements) elements :-
		public JPanel panel=new JPanel();
		
		//creating some icons
		Icon skipRight_icon =new ImageIcon("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\skip-right.png");
		Icon nextRight_icon = new ImageIcon("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\next.png");
		Icon skipLeft_icon = new ImageIcon("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\skip-left.png");
		Icon nextLeft_icon = new ImageIcon("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\prev.png");
		
		
		//creating Labels for text_fields
		public JLabel reservDate=new JLabel("RESERV. DATE :-");
		public JLabel pnrNo=new JLabel("PNR NO. :");
		public JLabel flightDate=new JLabel("FLIGHT DATE :");
		public JLabel flightNo=new JLabel("FLIGHT NO. :");
		public JLabel originDest=new JLabel("ORIGIN DEST :");
		public JLabel _class=new JLabel("CLASS :");
		public JLabel passengerDetails=new JLabel("PASSENGER DETAILS");
		public JLabel passengerName=new JLabel("PASSENGER NAME :");
		public JLabel passsengerAddress=new JLabel("PASSENGER ADDRESS :");
		public JLabel passportNo=new JLabel("POASSPORT NO. :");
		public JLabel passengerStatus=new JLabel("PASSENGER STATUS :");
		public JLabel branchCode=new JLabel("BRANCH CODE :");
		public JLabel ticketFare=new JLabel("TICKET FARE :");
		public JLabel serviceCode=new JLabel("SERVICE CODE :");
		public JLabel flightType=new JLabel("FLIGHT TYPE :");
		public JLabel reserevationDetails=new JLabel("RESERVATION DETAILS");
		public JLabel airLineReservationSystem=new JLabel("AIRLINE RESERVATION SYSTEM");
		public JLabel reservationForm=new JLabel("RESERVATION FORM");
		public JLabel totalFare=new JLabel("TOTAL FARE :");
		
		
		//creating text_fields
		public JTextField reservDate_tf=new JTextField("");
		public JTextField pnrNo_tf=new JTextField("");
		public JTextField flightDate_tf=new JTextField("");
		public JTextField flightNo_tf=new JTextField("");
		public JTextField originDest_tf=new JTextField("");
		public JTextField passengerName_tf=new JTextField("");
		public JTextField passsengerAddress_tf=new JTextField("");
		public JTextField passportNo_tf=new JTextField("");
		public JTextField ticketFare_tf=new JTextField("");
		public JTextField serviceCode_tf=new JTextField("");
		public JTextField totalFare_tf=new JTextField("");
		
		
		//creating combo_boxes
		public String []_class_arr= {"","A class","B class","C class"};
		public JComboBox _class_cb=new JComboBox(_class_arr);
		public String []passengerStatus_arr= {"","Temp","Permanent"};
		public JComboBox passengerStatus_cb=new JComboBox(passengerStatus_arr);
		public String []branchCode_arr= {"","1","2","3"};
		public JComboBox branchCode_cb=new JComboBox(branchCode_arr);
		public String []flightType_arr= {"","Economic","VIP"};
		public JComboBox flightType_cb=new JComboBox(flightType_arr);
		
		
		//creating buttons
		public JButton add_btn=new JButton("ADD");
		public JButton save_btn=new JButton("SAVE");
		public JButton edit_btn=new JButton("EDIT");
		public JButton delete_btn=new JButton("DELETE");
		public JButton cancel_btn=new JButton("CANCEL");
		public JButton print_btn=new JButton("PRINT");
		public JButton first_btn=new JButton("FIRST");
		public JButton next_btn=new JButton("NEXT");
		public JButton prev_btn=new JButton("PREVIUS");
		public JButton last_btn=new JButton("LAST");
		public JButton find_btn=new JButton("FIND");
		public JButton exit_btn=new JButton("EXIT");
		//creating right bottom buttons 
		//creating next\previous buttons
		public JButton next_btn0=new JButton(skipLeft_icon);
		public JButton next_btn1=new JButton(nextLeft_icon);
		public JButton next_btn2=new JButton(skipLeft_icon);
		public JButton next_btn3=new JButton(nextLeft_icon);
		public JButton next_btn4=new JButton(skipLeft_icon);
		public JButton next_btn5=new JButton(nextLeft_icon);
		public JButton next_btn6=new JButton(skipLeft_icon);
		public JButton next_btn7=new JButton(nextLeft_icon);
		public JButton next_btn8=new JButton(skipLeft_icon);
		public JButton next_btn9=new JButton(nextLeft_icon);
		//creating skip buttons
		public JButton skip_btn0=new JButton(skipRight_icon);
		public JButton skip_btn1=new JButton(nextRight_icon);
		public JButton skip_btn2=new JButton(skipRight_icon);
		public JButton skip_btn3=new JButton(nextRight_icon);
		public JButton skip_btn4=new JButton(skipRight_icon);
		public JButton skip_btn5=new JButton(nextRight_icon);
		public JButton skip_btn6=new JButton(skipRight_icon);
		public JButton skip_btn7=new JButton(nextRight_icon);
		public JButton skip_btn8=new JButton(skipRight_icon);
		public JButton skip_btn9=new JButton(nextRight_icon);
		//extra text fields
		public JTextField tf0=new JTextField("               Adodc1");
		public JTextField tf1=new JTextField("               Adodc2");
		public JTextField tf2=new JTextField("               Adodc3");
		public JTextField tf3=new JTextField("               Adodc4");
		public JTextField tf4=new JTextField("               Adodc5");
		
		
		//creating the default constructor
		GUI(){
			Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\1.jpg");  
			frame.setIconImage(icon);
			//creating and dragging image or logo
			JLabel imageLabel = new JLabel();
			imageLabel.setIcon(new ImageIcon("C:\\Users\\Kalid\\eclipse-workspace\\java_OutDoorTask\\2.jpg"));
			imageLabel.setBounds(20,20,100,100);
			//setting elements dimensions
			//title and subtitles
			airLineReservationSystem.setBounds(330,20,450,25);
			airLineReservationSystem.setFont(title_font);
			reservationForm.setBounds(425,45,400,25);
			reservationForm.setFont(subTitle_font);
			//first half of window elements
			reserevationDetails.setBounds(20,140,150,25);
			reservDate.setBounds(40,180,150,25);
			pnrNo.setBounds(40,220,150,25);
			flightDate.setBounds(40,260,150,25);
			flightNo.setBounds(40,300,150,25);
			originDest.setBounds(40,340,150,25);
			_class.setBounds(40,380,150,25);
			passengerDetails.setBounds(20,420,150,25);
			passengerName.setBounds(40,460,150,25);
			passsengerAddress.setBounds(40,500,150,25);
			passportNo.setBounds(40,540,150,25);
			passengerStatus.setBounds(40,580,150,25);
			//setting bounds of first half text_fields
			reservDate_tf.setBounds(200,180,250,30);
			pnrNo_tf.setBounds(200,220,250,30);
			flightDate_tf.setBounds(200,260,250,30);
			flightNo_tf.setBounds(200,300,250,30);
			originDest_tf.setBounds(200,340,250,30);
			passengerName_tf.setBounds(200,460,400,30);
			passsengerAddress_tf.setBounds(200,500,400,30);
			passportNo_tf.setBounds(200,540,400,30);
			//setting combo_boxs bounds
			_class_cb.setBounds(200,380,250,30);
			passengerStatus_cb.setBounds(200,580,250,30);
			
			
			
			//second half of the window elements
			totalFare.setBounds(500,180,125,25);
			branchCode.setBounds(500,220,125,25);
			ticketFare.setBounds(500,260,125,25);
			serviceCode.setBounds(500,300,125,25);
			flightType.setBounds(500,340,125,25);
			//setting bounds of second half text_fields
			ticketFare_tf.setBounds(620,262,250,30);
			serviceCode_tf.setBounds(620,302,250,30);
			totalFare_tf.setBounds(620,182,250,30);
			//setting combo_boxs bounds
			branchCode_cb.setBounds(620,220,250,30);
			flightType_cb.setBounds(620,340,250,30);
			
			
			
			//setting bounds of the btns in bottom of the window
			add_btn.setBounds(80,640,120,40);
			save_btn.setBounds(220,640,120,40);
			edit_btn.setBounds(360,640,120,40);
			delete_btn.setBounds(500,640,120,40);
			cancel_btn.setBounds(640,640,120,40);
			print_btn.setBounds(780,640,120,40);
			//the second btns 
			first_btn.setBounds(80,700,120,40);
			next_btn.setBounds(220,700,120,40);
			prev_btn.setBounds(360,700,120,40);
			last_btn.setBounds(500,700,120,40);
			find_btn.setBounds(640,700,120,40);
			exit_btn.setBounds(780,700,120,40);
			//setting bounds of the bottom right buttons
			next_btn0.setBounds(620,460,25,25);
			skip_btn0.setBounds(845,460,25,25);
			next_btn1.setBounds(645,460,25,25);
			skip_btn1.setBounds(820,460,25,25);
			
			next_btn2.setBounds(620,490,25,25);
			skip_btn2.setBounds(845,490,25,25);
			next_btn3.setBounds(645,490,25,25);
			skip_btn3.setBounds(820,490,25,25);
			
			next_btn4.setBounds(620,520,25,25);
			skip_btn4.setBounds(845,520,25,25);
			next_btn5.setBounds(645,520,25,25);
			skip_btn5.setBounds(820,520,25,25);
			
			next_btn6.setBounds(620,550,25,25);
			skip_btn6.setBounds(845,550,25,25);
			next_btn7.setBounds(645,550,25,25);
			skip_btn7.setBounds(820,550,25,25);
			
			next_btn8.setBounds(620,580,25,25);
			skip_btn8.setBounds(845,580,25,25);
			next_btn9.setBounds(645,580,25,25);
			skip_btn9.setBounds(820,580,25,25);
			
			
			//setting bounds for some additional text fields
			tf0.setBounds(670,460,150,25);
			tf1.setBounds(670,490,150,25);
			tf2.setBounds(670,520,150,25);
			tf3.setBounds(670,550,150,25);
			tf4.setBounds(670,580,150,25);
			tf0.setEditable(false);
			tf1.setEditable(false);
			tf2.setEditable(false);
			tf3.setEditable(false);
			tf4.setEditable(false);
			
			
			//adding elements into the frame
			frame.add(reservDate);
			frame.add(pnrNo);
			frame.add(flightDate);
			frame.add(flightNo);
			frame.add(originDest);
			frame.add(_class);
			frame.add(passengerDetails);
			frame.add(passengerName);
			frame.add(passsengerAddress);
			frame.add(passportNo);
			frame.add(passengerStatus);
			frame.add(branchCode);
			frame.add(ticketFare);
			frame.add(serviceCode);
			frame.add(flightType);
			frame.add(reserevationDetails);
			frame.add(airLineReservationSystem);
			frame.add(reservationForm);
			frame.add(totalFare);
			//adding text_fields
			frame.add(reservDate_tf);
			frame.add(pnrNo_tf);
			frame.add(flightDate_tf);
			frame.add(flightNo_tf);
			frame.add(originDest_tf);
			frame.add(passengerName_tf);
			frame.add(passsengerAddress_tf);
			frame.add(passportNo_tf);
			frame.add(ticketFare_tf);
			frame.add(serviceCode_tf);
			frame.add(totalFare_tf);
			//adding combo_boxs into frame
			frame.add(_class_cb);
			frame.add(passengerStatus_cb);
			frame.add(branchCode_cb);
			frame.add(flightType_cb);
			//adding image
			frame.add(imageLabel);
			//adding btns into frame
			frame.add(add_btn);
			frame.add(save_btn);
			frame.add(edit_btn);
			frame.add(delete_btn);
			frame.add(cancel_btn);
			frame.add(print_btn);
			frame.add(first_btn);
			frame.add(next_btn);
			frame.add(prev_btn);
			frame.add(last_btn);
			frame.add(find_btn);
			frame.add(exit_btn);
			//adding right bottom buttons
			frame.add(next_btn0);
			frame.add(next_btn1);
			frame.add(next_btn2);
			frame.add(next_btn3);
			frame.add(next_btn4);
			frame.add(next_btn5);
			frame.add(next_btn6);
			frame.add(next_btn7);
			frame.add(next_btn8);
			frame.add(next_btn9);
			//skipping buttons
			frame.add(skip_btn0);
			frame.add(skip_btn1);
			frame.add(skip_btn2);
			frame.add(skip_btn3);
			frame.add(skip_btn4);
			frame.add(skip_btn5);
			frame.add(skip_btn6);
			frame.add(skip_btn7);
			frame.add(skip_btn8);
			frame.add(skip_btn9);
			//adding extra text fields
			frame.add(tf0);
			frame.add(tf1);
			frame.add(tf2);
			frame.add(tf3);
			frame.add(tf4);
			
			
			
			//setting size of the frame
			frame.setSize(1000,820);
			//no ability to be re_sizable
			frame.setResizable(false);
			//the default close event
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//no layout manager is used
			frame.setLayout(null); 
			//setting the frame visible or displaying it
			frame.setVisible(true);
		}
	
}
