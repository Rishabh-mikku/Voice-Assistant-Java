package VAssistant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VAssistantGui2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAssistantGui2 frame = new VAssistantGui2();
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
	public VAssistantGui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180 , 620, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(552, 10, 58, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SPEAK");
		
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(196, 410, 217, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(".");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rishabh Deo Singh\\Desktop\\Java Project\\voicebackground4.png"));
		lblNewLabel_1.setBounds(0, 0, 620, 550);
		contentPane.add(lblNewLabel_1);
		
Configuration config = new Configuration();
		
		config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		config.setDictionaryPath("src\\3108.dic");                  //using sphinx knowledge base generator
		config.setLanguageModelPath("src\\3108.lm");
		
		try {
			LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
			speech.startRecognition(true);
			
			SpeechResult speechResult = null;
			while((speechResult = speech.getResult()) != null) {
				String voiceCommand = speechResult.getHypothesis();
				System.out.println("Voice Command is "+voiceCommand);
				
				if(voiceCommand.equalsIgnoreCase("Open Chrome")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.google.com");
					}
				else if(voiceCommand.equalsIgnoreCase("Close Chrome")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open YouTube")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close YouTube")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Amazon")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.amazon.in");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Amazon")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Facebook")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.facebook.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Facebook")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Wikipedia")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.wikipedia.org");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Wikipedia")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Netflix")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.netflix.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Netflix")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Shopify")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.shopify.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Shopify")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open LinkedIn")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.linkedin.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close LinkedIn")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Hackerrank")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.hackerrank.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Hackerrank")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open GeeksForGeeks")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.geeksforgeeks.org");
				}
				else if(voiceCommand.equalsIgnoreCase("Close GeeksForGeeks")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open w3schools")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.w3schools.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close w3schools")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open javatpoint")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.javatpoint.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close javatpoint")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Codechef")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.codechef.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Codechef")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Leetcode")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.leetcode.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Leetcode")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open Codeforces")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.codeforces.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close Codeforces")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open chess.com")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome www.chess.com");
				}
				else if(voiceCommand.equalsIgnoreCase("Close chess.com")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Open lpu ums")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome ums.lpu.in");
				}
				else if(voiceCommand.equalsIgnoreCase("Close lpu ums")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}
				else if(voiceCommand.equalsIgnoreCase("Shutdown")) {
					Runtime.getRuntime().exec("cmd.exe /c start Shutdown /s");
				}
				else if(voiceCommand.equalsIgnoreCase("Restart")) {
					Runtime.getRuntime().exec("cmd.exe /c start Shutdown /r");
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
