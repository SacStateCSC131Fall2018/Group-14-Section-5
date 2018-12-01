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
		textArea.setText("Opus 0: get smoked");
		
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
