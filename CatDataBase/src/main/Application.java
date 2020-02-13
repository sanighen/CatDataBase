package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import data.Cat;
import data.FelineInterface;

public class Application {

	final static List<String> catNameList = new ArrayList<>();
	final static ArrayList<FelineInterface> felineInterface = new ArrayList<>();

	public static void main(String[] args) {
		initGUI();
	}

	@SuppressWarnings("deprecation")
	public static void initGUI() {

		JButton saveBtn = new JButton("Save");

		JTextField IdInput = new JTextField();
		JTextField nameInput = new JTextField();
		JTextField raceInput = new JTextField();
		JTextField yearInput = new JTextField();

		JFrame window = new JFrame("Cat Database App");

		window.getContentPane().add(nameInput);
		window.getContentPane().add(raceInput);
		window.getContentPane().add(yearInput);
		window.getContentPane().add(saveBtn);
		window.getContentPane().setLayout(new BoxLayout(window.getContentPane(), BoxLayout.PAGE_AXIS));

		window.setBounds(100, 100, 400, 300);

		window.show();

		saveBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					felineInterface.add(new Cat(Integer.parseInt(IdInput.getText()), nameInput.getText(),
							raceInput.getText(), Integer.parseInt(yearInput.getText())));
				} catch (java.lang.NumberFormatException t) {
					System.err.println("Year can't be a word/symbol");
				}

				printCatList();

				nameInput.setText("");
				raceInput.setText("");
				yearInput.setText("");
			}
		});
	}

	public static void printList() {
		System.out.print("[" + catNameList.size() + "]:");
		System.out.println(String.join(",", catNameList));
	}

	public static void printCatList() {
		System.out.println("In out family " + felineInterface.size() + " cat(s)");
		for (FelineInterface f : felineInterface) {
			System.out.println(f);
		}
		System.out.println();

	}

}