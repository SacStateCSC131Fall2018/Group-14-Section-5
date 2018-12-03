import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoadDocsPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 2L;
	public JLabel textFile;
	public JLabel textFileType;
	public JLabel title;
	public JLabel author;
	public JTextField textFileField;
	public JTextField titleField;
	public JTextField authorField;
	public JTextArea summary;
	public JButton browse;
	public JButton process;
	public JComboBox<String> typeBox;
	public JPanel browsePanel;
	public JPanel typePanel;
	public JPanel titleAuthPanel;
	public JPanel titlePanel;
	public JPanel authPanel;
	public JPanel processPanel;
	public JPanel topPanel;
	public JPanel bottomPanel;
	
	public LoadDocsPanel() {
		
		//Labels 
		textFile = new JLabel("Text File:");
		textFileType = new JLabel("Text File Type:");
		title = new JLabel("Title:");
		author = new JLabel("Author:");
		//buttons
		process = new JButton("Process");
		browse = new JButton("Browse");
		process.setEnabled(false);
		//
		String[] fileTypes = {"Project Gutenberg File", 
							  "Txt"	
		};
		typeBox = new JComboBox<>(fileTypes);
		
		
		//textfields 
		textFileField = new JTextField(30);
		titleField = new JTextField(30);
		authorField = new JTextField(30);
		summary = new JTextArea();
		
		browsePanel = new JPanel(new BorderLayout(5,0));
		typePanel = new JPanel(new BorderLayout(5,0));
		titlePanel = new JPanel(new BorderLayout(5,0));
		authPanel = new JPanel(new BorderLayout(5,0));
		titleAuthPanel = new JPanel(new GridLayout(1,2,5,0));
		topPanel = new JPanel(new GridLayout(3,1,0,10));
		processPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		bottomPanel = new JPanel(new BorderLayout(0,1));
		this.setLayout(new BorderLayout());
		
		//browsePanel
		browsePanel.add(textFile, BorderLayout.WEST);
		browsePanel.add(textFileField, BorderLayout.CENTER);
		browsePanel.add(browse, BorderLayout.EAST);
		//panel that holds components text File type
		typePanel.add(textFileType, BorderLayout.WEST);
		typePanel.add(typeBox, BorderLayout.CENTER);
		
		titlePanel.add(title, BorderLayout.WEST);
		titlePanel.add(titleField, BorderLayout.CENTER);
		
		authPanel.add(author, BorderLayout.WEST);
		authPanel.add(authorField, BorderLayout.CENTER);
		
		titleAuthPanel.add(titlePanel);
		titleAuthPanel.add(authPanel);
		
		topPanel.add(browsePanel);
		topPanel.add(typePanel);
		topPanel.add(titleAuthPanel);
		
		processPanel.add(process);
		bottomPanel.add(processPanel, BorderLayout.NORTH);
		//bottomPanel.add(process, BorderLayout.NORTH);
		bottomPanel.add(summary, BorderLayout.CENTER);
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
		Border bottomInside = BorderFactory.createEmptyBorder(5,5,5,5);
		Border bottomOutside = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		Border bottom = BorderFactory.createCompoundBorder(bottomOutside, bottomInside);
		Border top = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		topPanel.setBorder(BorderFactory.createCompoundBorder(top, bottom));
		
		this.add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel, BorderLayout.CENTER);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//String event = e.getActionCommand();
		//if(event.equals("Browse"))
			//JFrame
		
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		LoadDocsPanel panel = new LoadDocsPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
	
	}


}
