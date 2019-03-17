package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		int score = 0;
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "A sound will play, and you have to guess what the sound is of.");
		// 5. Use the playSound method to play your song.
		playSound("stone.wav");
		// 6. Make a pop-up for the player to type their answer.
		String sound1 = JOptionPane.showInputDialog("What is the sound?");
		// 7. If they answered correctly, tell them that they were right.
		if (sound1.equalsIgnoreCase("a dropped stone")) {
			JOptionPane.showMessageDialog(null, "Correct! +5 points");
			score = score + 5;
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! The answer was a dropped stone. -1 points");
			score = score - 1;
		}
		// 9. Record another sound and repeat steps 5-8.
		playSound("bells.wav.crdownload");
		String sound2 = JOptionPane.showInputDialog("What is the sound?");
		if(sound2.equalsIgnoreCase("church bells")) {
			JOptionPane.showMessageDialog(null, "Correct! +5 points");
			score = score + 5;
		}
		else if (sound2.equalsIgnoreCase("bells")) {
			JOptionPane.showMessageDialog(null, "Correct! +5 points");
			score = score + 5;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! The answer was (church) bells. -1 points");
			score = score - 1;
		}
		// 10. [optional] Add a points variable that will calculate their final score.
		JOptionPane.showMessageDialog(null, "Your final score is " +score); 
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


