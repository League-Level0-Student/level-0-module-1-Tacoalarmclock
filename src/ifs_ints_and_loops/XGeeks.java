package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {
		String amt = JOptionPane.showInputDialog("who's superpower do you want to see");

		if (amt.equalsIgnoreCase("misha")) {

			JOptionPane.showMessageDialog(null, "selfishness");
		} else {
			JOptionPane.showMessageDialog(null, "Why would you want to know about somebody who isn't misha");
			JOptionPane.showMessageDialog(null, "Misha's is selfishness");
		}

	}
}
