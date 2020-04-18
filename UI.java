import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;

public class UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 642, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnSkunkGame = new JTextPane();
		txtpnSkunkGame.setFont(new Font("Stencil", Font.PLAIN, 32));
		txtpnSkunkGame.setBounds(204, 70, 208, 42);
		txtpnSkunkGame.setText("Skunk Game");
		frame.getContentPane().add(txtpnSkunkGame);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 255, 204));
		textPane.setBounds(254, 241, 126, 26);
		frame.getContentPane().add(textPane);
		
		JLabel lblEnterNumberOf = new JLabel("ENTER NUMBER OF PLAYERS");
		lblEnterNumberOf.setBounds(215, 205, 212, 20);
		frame.getContentPane().add(lblEnterNumberOf);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btnRules = new JButton("RULES");
		menuBar.add(btnRules);
		btnRules.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRules.setForeground(Color.BLACK);
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
