	
package _99_extra;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class BirthdayReminder {

	public static void main(String[] args) {
		
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 16th, 1978";
		String dadsBirthday = "February 11th, 1968";
		String myBirthday = "June 13th, 2011";

		// 2. Find out which birthday the user wants and and store their response in a variable
	          JOptionPane.showMessageDialog(null,"STARTING UP...");
	          playAsherSound();
	          JOptionPane.showMessageDialog(null,"<html><i>BirthdaySearch Version 1.0</i></html>");
	          String findName = JOptionPane.showInputDialog(null, "Who's birthday would you like to know? (Mom, Dad, me)");
		// 3. Print out what the user typed
		if (findName.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, "PROCESSING...");
			JOptionPane.showMessageDialog(null, "DATE FOUND.");
			JOptionPane.showMessageDialog(null, ""+momsBirthday+"");
		}else if (findName.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, "PROCESSING...");
			JOptionPane.showMessageDialog(null, "DATE FOUND.");
			JOptionPane.showMessageDialog(null, ""+dadsBirthday+"");
		} else if (findName.equalsIgnoreCase("you")) {
			JOptionPane.showMessageDialog(null, "PROCESSING...");
			JOptionPane.showMessageDialog(null, "DATE FOUND.");
			JOptionPane.showMessageDialog(null, ""+myBirthday+"");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	}

	          public static void playAsherSound() {
	      		String path = "src/_99_extra/sound.wav";
	      
	      			File sound = new File(path);
	      			if (sound.exists()) {
	      				try {					
	      					Clip clip= AudioSystem.getClip();
	      					clip.open(AudioSystem.getAudioInputStream(sound));
	      					clip.start();
	      					Thread.sleep(clip.getMicrosecondLength()/1000);
	      				}
	      				catch (Exception e) {
	      					System.out.println("Could not play this sound");
	      				}
	      			}
	      		
	      	}

	} 

//433930_devern_mac-os-startup-sound-alike.wav






































          





























