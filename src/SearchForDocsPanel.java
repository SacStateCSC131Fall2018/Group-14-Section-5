import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
		queryPanel.setLayout(new BorderLayout());
		textFieldPanel.setLayout(new GridLayout(2,1,0,20));
		this.setLayout(new BorderLayout(0, 10));
		
		//components for queryPanel
		queryPanel.add(query, BorderLayout.WEST);
		queryPanel.add(queryField, BorderLayout.CENTER);
		queryPanel.add(clearButton, BorderLayout.EAST);
		
		//components for textFieldPanel
		textFieldPanel.add(topField);
		textFieldPanel.add(bottomField);
		
		//components for SearchForDocsPanel
		this.add(queryPanel, BorderLayout.NORTH);
		this.add(textFieldPanel, BorderLayout.CENTER);
		this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
				
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
