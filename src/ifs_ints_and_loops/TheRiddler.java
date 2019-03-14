package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

public static void main(String[] args) {

		// 1. Make a variable to hold the score int
            int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
           String TheRiddler=JOptionPane.showInputDialog("what has four legs but cant walk");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
               if(TheRiddler.equals("chair")) {
            	   JOptionPane.showMessageDialog(null,"you got 2 points");
                  score=score+2;
               }

		// 5. Otherwise, say "wrong" and t	String birthday=JOptionPane.showInputDialog("enter birthday");ell them the answer
                 else {
                	 
                 JOptionPane.showMessageDialog(null,"aww you tried!");
                 }
               
               
              
               
               
               TheRiddler=JOptionPane.showInputDialog("what has four eyes but cant see");	
		if(TheRiddler.equals("mississippi")) {
			JOptionPane.showMessageDialog(null,"you got 2 points");
		     score=score+2;
		}else {
			JOptionPane.showMessageDialog(null,"oh nooo!");
		}
       		 
       		 
       JOptionPane.showMessageDialog(null,"your score is "+score);		 
}		 // 6. Add some more riddles
       			
                 		// 2. Make a pop up to show the score.
		 
}
	

