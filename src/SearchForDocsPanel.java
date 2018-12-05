import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class SearchForDocsPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JTextField topField;
	private JTextField bottomField;
	private JTextField queryField;
	private JButton clearButton;
	private JLabel numLoaded;
	private JLabel query;
	private JPanel queryPanel;
	private JPanel textFieldPanel;
	private JPanel tfbottomPart;
	private JPanel numLoadedPanel;
	
	public SearchForDocsPanel() {
		
		topField = new JTextField();
		bottomField = new JTextField();
		queryField = new JTextField();
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		query = new JLabel("Query:");
		numLoaded = new JLabel("Number Loaded");
		queryPanel = new JPanel();
		numLoadedPanel = new JPanel();
		textFieldPanel = new JPanel();
		tfbottomPart = new JPanel();
		
		queryField.getDocument().addDocumentListener(new docListener());

		//setting layouts
		queryPanel.setLayout(new BorderLayout());
		numLoadedPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		textFieldPanel.setLayout(new GridLayout(2,1));
		tfbottomPart.setLayout(new BorderLayout());
		this.setLayout(new BorderLayout(0, 10));
		
		numLoaded.setVisible(false);
		topField.setEditable(false);
		bottomField.setEditable(false);
		
		topField.setBackground(Color.white);
		bottomField.setBackground(Color.white);
		
		//components for queryPanel
		queryPanel.add(query, BorderLayout.WEST);
		queryPanel.add(queryField, BorderLayout.CENTER);
		queryPanel.add(clearButton, BorderLayout.EAST);
		
		numLoadedPanel.add(numLoaded);
		tfbottomPart.add(numLoadedPanel, BorderLayout.NORTH);
		tfbottomPart.add(bottomField, BorderLayout.CENTER);
		
		//components for textFieldPanel
		textFieldPanel.add(topField);
		textFieldPanel.add(tfbottomPart);
		
		//components for SearchForDocsPanel
		this.add(queryPanel, BorderLayout.NORTH);
		this.add(textFieldPanel, BorderLayout.CENTER);
		this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if(event.equals("Clear")){
			queryField.setText("");
		}
		
	}
	
	public class docListener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			Document doc = (Document)e.getDocument();
			if(doc.getLength() != 0)
				numLoaded.setVisible(true);
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			Document doc = (Document)e.getDocument();
			if(doc.getLength() == 0)
				numLoaded.setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		SearchForDocsPanel panel = new SearchForDocsPanel();
		frame.add(panel);
		frame.setVisible(true);
		
		
	}
}
