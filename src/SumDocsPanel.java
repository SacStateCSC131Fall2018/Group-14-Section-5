import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class SumDocsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private JPanel textAreaPanel;
	
	public SumDocsPanel() {
		textArea = new JTextArea();
		textAreaPanel = new JPanel();
		
		// layout
		textAreaPanel.setLayout(new GridLayout());
		this.setLayout(new BorderLayout(0, 10));
		
		// text area
		textArea.setLineWrap(true);
		textArea.setText("Opus 0: Charles Dickens  Bleak House  7312 documents\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/bleakhouse.txt\n");
		textArea.append("Opus 1: Thomas Hardy  Far from the Madding Crowd  3538 documents\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/farFromTheMaddingCrowd.txt\n");
		textArea.append("Opus 2: Thomas Hardy  Jude the Obscure  3650\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/judeTheObscure.txt\n");
		textArea.append("Opus 3: Daniel Defoe  The Fortunes and Misfortunes of the Famous Moll Flanders &c  1283 documents\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/mollFlanders.txt\n");
		textArea.append("Opus 4: Charles Dickens  Great Expectations  3848 documents\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/greatExpectations.txt\n");
		textArea.append("Opus 5: Charles Dickens  A Tale of Two Cities  3329 documents\n");
		textArea.append("               /Users/christopherfox/Programs/java/ir/data/taleOfTwoCities.txt\n");
		textArea.append("\n\nIndex Terms: 26447\nPostings:     226412");
		
		// scroll bar
		textAreaPanel.add(new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));

		//components
		this.add(textAreaPanel, BorderLayout.CENTER);
		this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		SumDocsPanel panel = new SumDocsPanel();
		frame.add(panel);
	}
}
