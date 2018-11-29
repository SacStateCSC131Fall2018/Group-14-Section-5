// CSC 131 Group #14 Section-5
// Pirex Frame

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PirexLayoutFrame extends JFrame implements ActionListener{
	Container contentPane; //
	JMenuBar mb; // menu bar
	JMenu menu1, menu2; // drop down menu
	JMenuItem item1, item2, item3, item4; // items to be added to drop down menu
	JTabbedPane tabbedPane;
	
	public PirexLayoutFrame() {
		contentPane = getContentPane();
		setTitle("Pirex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane.setLayout(new BorderLayout());
		
		// Menu Bar components, north
		mb = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Help");
		mb.add(menu1);
		mb.add(menu2);
		item1 = new JMenuItem("Open");
		item2 = new JMenuItem("Export");
		item3 = new JMenuItem("About");
		item4 = new JMenuItem("Exit");
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item4);
		menu2.add(item3);
		contentPane.add(mb, BorderLayout.NORTH);
		
		item3.addActionListener(this); // about
		item4.addActionListener(this); // exit
		
		// tabbed pane, center
		tabbedPane = new JTabbedPane();
		tabbedPane.add("Search for Documents", null); 
		tabbedPane.add("Load Documents", null);
		tabbedPane.add("Summarize Documents", null);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if(event.equals("Exit")){
			System.exit(NORMAL);
		}
		if(event.equals("About")) {
			JFrame frame = new JFrame("Info");
			JOptionPane.showMessageDialog(frame, "Helper");
		}
	}
	
	// create the panels for the [3] tabs
}
