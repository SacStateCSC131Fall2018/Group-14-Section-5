import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchForDocsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField topField;
	private JTextField bottomField;
	private JTextField queryField;
	private JButton clearButton;
	private JLabel query;
	private JPanel queryPanel;
	private JPanel textFieldPanel;
	
	public SearchForDocsPanel() {
		
		topField = new JTextField();
		bottomField = new JTextField();
		queryField = new JTextField();
		clearButton = new JButton("Clear");
		query = new JLabel("Query:");
		queryPanel = new JPanel();
		textFieldPanel = new JPanel();
		
		//setting layouts
		queryPanel.setLayout(new FlowLayout());
		textFieldPanel.setLayout(new GridLayout(2,1,10,30));
		this.setLayout(new GridLayout(2,1, 10, 10));
		
		//components for queryPanel
		queryPanel.add(query);
		queryPanel.add(queryField);
		queryPanel.add(clearButton);
		
		//components for textFieldPanel
		textFieldPanel.add(topField);
		textFieldPanel.add(bottomField);
		
		//components for SearchForDocsPanel
		this.add(queryPanel);
		this.add(textFieldPanel);
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		SearchForDocsPanel panel = new SearchForDocsPanel();
		frame.add(panel);

		
	}
	

}
