import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
	
	
	ArrayList <Concert> Concerts = new ArrayList<Concert>();
	 
	//Container c;
	public static void main(String [] args){
		
		JFrame MainFrame = new JFrame("Menu");
		
		JMenuBar menuBar = new JMenuBar();
		
		Container c = MainFrame.getContentPane();
		
		c.setBackground(Color.WHITE);
		
		
		
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setSize(850,650);
		
		/*http://stackoverflow.com/questions/144892/how-to-center-a-window-in-java  this sets the window to the
		 *center of the screen*/ 
		 	
		
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    	int x = (int) ((dimension.getWidth() - MainFrame.getWidth()) / 2);
    	int y = (int) ((dimension.getHeight() - MainFrame.getHeight()) / 2);
    	MainFrame.setLocation(x, y);
    	
    	
    	JPanel title = new JPanel();
    	JLabel wel = new JLabel("Welcome to RPE");
    	wel.setFont(new Font("Sans Serif", Font.BOLD, 50));
    	wel.setForeground(Color.BLUE);
    	
    	JPanel center = new JPanel(new BorderLayout());
    	JLabel home = new JLabel("The Home of music entertainment");
    	home.setFont(new Font("Sans Serif", Font.PLAIN, 50));
    	home.setForeground(Color.BLUE);
    	
    	
    	MainFrame.add(title);
    	MainFrame.setLayout(new FlowLayout());
    	
    	title.add(wel); 
    	center.add(home, BorderLayout.CENTER);
        //center.setLocation(BorderLayout.CENTER);
  		MainFrame.add(center);
    	JMenu FileMenu = new JMenu("Concert");
    	/*FileMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (inner_frame == null) {
                    inner_frame = new JFrame();
                }
                inner_frame.setLayout(new FlowLayout(FlowLayout.CENTER));
                inner_frame.add(new JButton("inner frame"));
                inner_frame.setVisible(true);
                login.setVisible(false);
                inner_frame.setBounds(10, 10, 300, 300);
            }
        });*/
    	JMenuItem concerts = new JMenuItem("Add Concert");
    	FileMenu.add(concerts);
    	concerts = new JMenuItem("Search Concert");
    	FileMenu.add(concerts);
    	menuBar.add(FileMenu);
        
        
    	//Font intro = new Font("Sans Serif", Font.BOLD, 12);
    	  
    		
    	MainFrame.setJMenuBar(menuBar);
    	
    	
    	MainFrame.setVisible(true);
		//Scanner input = new Scanner(System.in);
		ArrayList Concert = new ArrayList();
	}		
		


}