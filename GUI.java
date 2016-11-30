import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
//import javax.swing.SwingUtilities;

public class GUI extends JFrame{	 
	public GUI(){
		
		super("Menu");		
		JMenuBar menuBar = new JMenuBar();		
		Container c = getContentPane();		
		c.setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850,650);
		setResizable(false);
		
		/*http://stackoverflow.com/questions/144892/how-to-center-a-window-in-java  this sets the window to the
		 *center of the screen*/ 
	
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    	int x = (int) ((dimension.getWidth() - getWidth()) / 2);
    	int y = (int) ((dimension.getHeight() - getHeight()) / 2);
    	setLocation(x, y);
    	   	
    	JPanel title = new JPanel();
    	JLabel wel = new JLabel("Welcome to RPE");
    	title.setBackground(Color.WHITE);
    	wel.setFont(new Font("Sans Serif", Font.BOLD, 50));
    	wel.setForeground(Color.BLUE);
    	
    	JPanel center = new JPanel(new BorderLayout());
    	JLabel home = new JLabel("The Home of music entertainment");
    	center.setBackground(Color.WHITE);
    	home.setFont(new Font("Sans Serif", Font.PLAIN, 50));
    	home.setForeground(Color.BLUE); 	   	
    	add(title);
    	setLayout(new FlowLayout()); 	
    	title.add(wel); 
    	center.add(home, BorderLayout.CENTER);
  		add(center);
    	
 		JMenu FileMenu = new JMenu("Concert");
    	JMenuItem concerts = new JMenuItem("Add Concert");
    	FileMenu.add(concerts);
    	JMenuItem concertsTwo = new JMenuItem("Search Concert");
    	FileMenu.add(concertsTwo);
    	JMenuItem concertsThree = new JMenuItem("Remove Concert");
    	FileMenu.add(concertsThree);
    	concerts.addActionListener(new ActionHandler());
    	concertsTwo.addActionListener(new ActionHandler());
    	concertsThree.addActionListener(new ActionHandler());
    	menuBar.add(FileMenu);    		
    	
      	JMenu Cust = new JMenu("Register");
    	menuBar.add(Cust);
    	JMenuItem Reg = new JMenuItem("Add Customer");
    	Cust.add(Reg);
    	JMenuItem RegTwo = new JMenuItem("Remove Customer");
    	Cust.add(RegTwo);
    	Reg.addActionListener(new ActionHandler());
    	RegTwo.addActionListener(new ActionHandler());
    	
  		JMenu Purch = new JMenu("Tickets");
  		menuBar.add(Purch);
  		JMenuItem get = new JMenuItem("Purchase Ticket");
  		Purch.add(get);
  		JMenuItem getTwo = new JMenuItem("Cancel Ticket");
  		Purch.add(getTwo);
  		get.addActionListener(new ActionHandler());
  		getTwo.addActionListener(new ActionHandler());
  		setJMenuBar(menuBar);	
		
	}
	
	private class ActionHandler extends JFrame implements ActionListener{
			public void actionPerformed(ActionEvent e){
			ArrayList <Concert> Concerts = new ArrayList<Concert>();
			String item = e.getActionCommand();	
			JTextArea text;
				
			if(item.equals("Add Concert")){
				
				JFrame addWindow = new JFrame();
				this.setSize(450, 350);
				setLayout(new FlowLayout());
				this.setVisible(true);
				this.setTitle("Add a concert");
				this.setResizable(false);
				Font font = new Font("Sans Serif", Font.PLAIN, 25);
				
				
				JLabel Conname = new JLabel("Concert name:   ");
				Conname.setFont(font);
				this.add(Conname);
				JTextField Cname = new JTextField(20);
				this.add(Cname);
				JLabel Contype = new JLabel("Concert type:   ");
				JTextField Ctype = new JTextField(20);
				this.add(Contype);
				this.add(Ctype);
				Contype.setFont(font);
				JLabel Convenue = new JLabel("Concert Venue:  ");
				JTextField venue = new JTextField(20);
				this.add(Convenue);
				this.add(venue);
				Convenue.setFont(font);
				JLabel Capacity = new JLabel("Concert Capacity:   ");
				JTextField cap = new JTextField(17);
				this.add(Capacity);
				this.add(cap);	
				Capacity.setFont(font);
				JLabel date = new JLabel("Concert Date:   ");
				JTextField when = new JTextField(20);
				this.add(date);
				this.add(when);	
				date.setFont(font);
				JButton subCon = new JButton("Submit");	
				subCon.setPreferredSize(new Dimension(100, 60));
				this.add(subCon);
				JButton canCon = new JButton("Cancel");	
				canCon.setPreferredSize(new Dimension(100, 60));
				this.add(canCon);		
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
    			setLocation(x, y);
				
				
				} 
				else if(item.equals("Search Concert")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(700, 275);
					setLayout(new FlowLayout());
					this.setVisible(true);
					this.setTitle("Search for customer");
					this.setResizable(false);
					Font font = new Font("Sans Serif", Font.PLAIN, 25);
					JLabel Conname = new JLabel("Please enter the concert name: ");
					JTextField name = new JTextField(20);
					Conname.setFont(font);
					this.add(Conname);
					this.add(name); 
					JLabel Condate = new JLabel("Please enter the concert date: ");
					JTextField date = new JTextField(23);
					Condate.setFont(font);
					this.add(Condate);
					this.add(date);
					JButton subS = new JButton("Submit");	
					subS.setPreferredSize(new Dimension(100, 60));
					this.add(subS);
					JButton canS = new JButton("Cancel");	
					canS.setPreferredSize(new Dimension(100, 60));
					this.add(canS);
					
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);
				}
				
				else if(item.equals("Remove Concert")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(600, 200);
					this.setVisible(true);
					this.setTitle("Remove a concert");
					this.setResizable(false);
					setLayout(new FlowLayout());
					JLabel removeCon = new JLabel("Please enter the concert name: ");
					JTextField remove= new JTextField(20);
					Font font = new Font("Sans Serif", Font.PLAIN, 25);
					removeCon.setFont(font);
					this.add(removeCon);
					this.add(remove);
					JButton removeButton = new JButton("Remove");
					JButton removeCancel = new JButton("Cancel");
					removeButton.setFont(font);
					removeCancel.setFont(font);
					this.add(removeButton);
					this.add(removeCancel);
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);
					
				}	
					
				else if(item.equals("Add Customer")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(700, 250);
					this.setVisible(true);
					this.setTitle("Add a Customer");
					this.setResizable(false);
					setLayout(new FlowLayout());
					JLabel addCust = new JLabel("Customer's name: ");
					JTextField add = new JTextField(20);
					Font font = new Font("Sans Serif", Font.PLAIN, 25);
					this.add(addCust);
					this.add(add);
					addCust.setFont(font);
					add.setFont(font);
					JLabel AddDob = new JLabel("Customer's DOB: ");
					JTextField DOB = new JTextField(20);
					this.add(AddDob);
					this.add(DOB);
					AddDob.setFont(font);
					DOB.setFont(font);
					JLabel Addaddress = new JLabel("Customer's Address: ");
					JTextField Address = new JTextField(17);
					this.add(Addaddress);
					this.add(Address);
					Addaddress.setFont(font);
					Address.setFont(font);
					JButton addButton = new JButton("Register");
					JButton addCancel = new JButton("Cancel");
					addButton.setFont(font);
					addCancel.setFont(font);
					this.add(addButton);
					this.add(addCancel);
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);	
					
				}
				
				else if(item.equals("Remove Customer")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(600, 600);
					this.setVisible(true);
					this.setTitle("Remove a Customer");
					this.setResizable(false);
					//textarea.setText("Enter customer name: ");
					this.setLayout(new BorderLayout());
					
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);	
				}
				
				else if(item.equals("Purchase Ticket")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(600, 600);
					this.setVisible(true);
					this.setTitle("Purchase a Ticket");
					this.setResizable(false);
					//textarea.setText("Enter customer name: ");
					this.setLayout(new BorderLayout());
					
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);
				}
				
				else if(item.equals("Cancel Ticket")){
					
					JFrame searchWindow = new JFrame();	
					this.setSize(600, 600);
					this.setVisible(true);
					this.setTitle("Cancel a Ticket");
					this.setResizable(false);
					//textarea.setText("Enter customer name: ");
					this.setLayout(new BorderLayout());
					
					Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    			int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    			int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    			setLocation(x, y);
				}
			}
		}
	}
		
	
		
