import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField txtRound;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final JLabel lblNewLabel_1 = new JLabel("SKUNK GAME");
	public static boolean checkedSound = false;
	public static boolean checkedWrite = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setBackground(new Color(204, 51, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setForeground(new Color(0, 51, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 79, 31);
		contentPane.add(menuBar);
		
		JButton btnRules = new JButton("RULES");
		menuBar.add(btnRules);
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(main.this,
						"Every player rolls dice twice per turn."
								+ "\nIf both rolls have the same value, the player scores twice the sum of the two dice rolls."
				    			+ "\nIf both rolls have different values, the player scores the sum of the rolls."
				    			+ "\nFor each player, the result is cummulated after each turn."
				    			+ "\nFirst player to reach or exceed 100 wins!",
						"SKUNK RULES", JOptionPane.PLAIN_MESSAGE);
			
			}
		});
		
		JButton btnRoll = new JButton("ROLL");
		btnRoll.setBounds(24, 313, 115, 29);
		contentPane.add(btnRoll);
		
		JButton btnStop = new JButton("DONE ROLLING");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnStop.setBounds(154, 313, 159, 29);
		contentPane.add(btnStop);
		
		txtRound = new JTextField();
		txtRound.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRound.setText("ROUND: ");
		txtRound.setBounds(258, 0, 146, 31);
		contentPane.add(txtRound);
		txtRound.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(15, 113, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 113, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPlayer = new JLabel("PLAYER 1 NAME");
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer.setBounds(18, 86, 143, 20);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER 2 NAME");
		lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer_1.setBounds(176, 86, 133, 20);
		contentPane.add(lblPlayer_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 155, 345, 142);
		contentPane.add(textArea);
		
 
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(243, 60, 392, 370);
			contentPane.add(lblNewLabel);
			//SKUNK ICON
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Maria Torres\\Pictures\\sk.png"));
			
			//SOUND
			JRadioButtonMenuItem rdbtnmntmSoundOn = new JRadioButtonMenuItem("SOUND ON");
			
			rdbtnmntmSoundOn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkedSound == false) {
						checkedSound = true; 
					} else {
						checkedSound = false;
					}
					
				}
			});
				
			rdbtnmntmSoundOn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkedWrite == false) {
						checkedWrite = true; 
					} else {
						checkedWrite = false;
					}
					
				}
			});
			
			
			
			
			rdbtnmntmSoundOn.setBounds(83, 0, 173, 31);
			contentPane.add(rdbtnmntmSoundOn);
			
			
			
			
			
			JLabel lblFinalScores = new JLabel("FINAL SCORES");
			lblFinalScores.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblFinalScores.setForeground(new Color(0, 0, 0));
			lblFinalScores.setBackground(new Color(255, 255, 255));
			lblFinalScores.setBounds(79, 358, 146, 20);
			contentPane.add(lblFinalScores);
			
			textField_2 = new JTextField();
			textField_2.setBounds(28, 376, 228, 38);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			lblNewLabel_1.setBounds(132, 34, 303, 41);
			contentPane.add(lblNewLabel_1);
			lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 30));
		
	}
}
