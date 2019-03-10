package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		String name;
		name = JOptionPane.showInputDialog("What is your character's name?");
		JOptionPane.showMessageDialog(null, "You and two of your friends, Jane and Matt, have just entered the local woods. There's nothing exciting about it, but your parents forced you three into going outside, so you decided to explore.");
		JOptionPane.showMessageDialog(null, "After a while of mindless walking, you stumble upon an abandoned cabin near a small lake. The cabin, while messy, is in relatively good shape.");
		int choice1 = JOptionPane.showOptionDialog(null, "What do you do?", "Forest", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Keep Walking", "Swim", "Enter The Cabin" }, null);
		if (choice1==0){
			JOptionPane.showMessageDialog(null, "You continue walking through the forest.");
			JOptionPane.showMessageDialog(null, "Nothing much happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room.");
			JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "THE END" }, null);
		}
		else if (choice1==2) {
			JOptionPane.showMessageDialog(null, "You enter the cabin to see a figure standing there. It seems to be nothing more than a shadow.");
			JOptionPane.showMessageDialog(null, "The shadow doesn't move, but you hear a voice: 'Hello, do you wish to hear a tale?'");
			int Choice2 = JOptionPane.showOptionDialog(null, "Do you wish to hear the tale?", "Cabin", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes", "No" }, null);
			if (Choice2==0) {
				JOptionPane.showMessageDialog(null, "'I once lived in the lake as a lone soul. After many years of peace, another species came and forced me out of my home.'");
				JOptionPane.showMessageDialog(null, "'For many years, I've been trying to get my home back, but my power has reduced, being on land all this time and I'm powerless to free myself from those creatures.'");
				int Choice3 = JOptionPane.showOptionDialog(null, "'Will you help me?'", "Cabin", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Yes", "No" }, null);
				if (Choice3==0) {
					JOptionPane.showMessageDialog(null, "Your pity for the creature causes you the decide to help the creature. He gives you a vial with something inside. 'I cannot leave this cabin, please, pour the contents into the lake.'");
					JOptionPane.showMessageDialog(null, "You are informed of how it will cause the creatures in the lake to have a change of heart. The creature will handle the rest.");
					JOptionPane.showMessageDialog(null, "You do as you are asked and continue on your way.");
					JOptionPane.showMessageDialog(null, "You continue walking through the forest, happy to have been of some help to the creature.");
					JOptionPane.showMessageDialog(null, "Nothing much else happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room."); 
					JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "THE END" }, null);
				}
				else if (Choice3==1) {
				JOptionPane.showMessageDialog(null, "Not wanting any part in this war between the creatures, you refuse to help and leave the cabin.");
				JOptionPane.showMessageDialog(null, "Instead, you continue walking through the forest.");
				JOptionPane.showMessageDialog(null, "Nothing much happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room."); 
				JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "THE END" }, null);
				}
			}
			else if (Choice2==1) {
				JOptionPane.showMessageDialog(null, "Wary of the creature, you choose to deny his offer and leave the cabin.");
				JOptionPane.showMessageDialog(null, "Instead, you continue walking through the forest.");
				JOptionPane.showMessageDialog(null, "Nothing much happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room."); 
				JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "THE END" }, null);
			}
		}
		else if (choice1==1) {
			JOptionPane.showMessageDialog(null, "Both Matt and Jane seem into the idea of swimming in the pond and coincidentally, you all decided to bring your swimsuits.");
			JOptionPane.showMessageDialog(null, "You splash Matt, starting a fight between the two of you. You start splashing each other to see who can get the other more.");
			JOptionPane.showMessageDialog(null, "Suddenly you hear Jane yell. '" +name+ "! Matt! Help!'");
			JOptionPane.showMessageDialog(null, "When you look where she just was, you see nothing but ripples in the water and her hairclip, just below the surface of the water sinking into the water's depths.");
			JOptionPane.showMessageDialog(null, "You hear an eerie voice inside your head demanding you swim down into the lake and copperate.");
				JOptionPane.showMessageDialog(null, "You tell Matt to follow you. Squinting, you see something that may be a cave on the lake's floor. You and Matt dive down to chase after Jane.");
				JOptionPane.showMessageDialog(null, "You miscalculated how far under the surface the rock form is. Still swimming downward, you can't stop yourself. You breath in the water.");
				JOptionPane.showMessageDialog(null, "Suprisingly, you don't get a mouthful of water, but a lungful of air. You signal to Matt to breath normally. He looks at you quizically, but does so. A look of suprise shows on his face.");
				JOptionPane.showMessageDialog(null, "Some sort of magic seems to be allowing you to breath normally, even underwater.");
				JOptionPane.showMessageDialog(null, "Suddenly, you see Matt's eyes widden and feel a hand on your shoulder. You quickly spin around to find a sort of fishman, who's holding a spear, staring down at you. He isn't a merman, that's for sure, but he seem to be part fish, part man.");
				int choice3 = JOptionPane.showOptionDialog(null, "He guesters for you to follow. What do you do?", "Underwater", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Keep Swimming", "Follow Him" }, null);
				if (choice3==1) {
					JOptionPane.showMessageDialog(null, "You are lead to a cave-like room at the lake floor. A moment later, another fishman brings in Jane.");
					JOptionPane.showMessageDialog(null, "'It seems I owe you all an explaination.'");
				}
				if (choice3==0) {
					JOptionPane.showMessageDialog(null, "You keep swimming towards the cave and Matt follows.");
					JOptionPane.showMessageDialog(null, "As you are swimming, you hear a sound a lot like a someone at a watch tower may sound to warn of a danger.");
					JOptionPane.showMessageDialog(null, "You keep swimming, faster now, determined to get to the bottom of the lake floor. Something's telling you Jane is there.");
					JOptionPane.showMessageDialog(null, "You hear a yell behind you, like a war cry. Then you hear Matt yell out in suprise.");
					JOptionPane.showMessageDialog(null, "You see an army of the speices behind you, two of them restraining our friend. One of them grabs you, and suddenly, all you see is blackness.");
					JOptionPane.showMessageDialog(null, "When you come to, you find yourself to be in a makeshift jail cell. Both Jane and Matt are there as well.");
					JOptionPane.showMessageDialog(null, "The fishman you originally saw came. He brings you to a cozy room and explains everything.");
				}
					JOptionPane.showMessageDialog(null, "He tells you the story of their species, whom were called Deftens. For centuries, they lived in this lake and have the ability to transform into humans and walk on land.");
					JOptionPane.showMessageDialog(null, "But one day, Deftens started disapearing. The king forbade anyone from traveling to the surface, once they discovered a shadow lurking around, living in the cabin. It was kidnapping them, one by one. No one knows why it was doing so.");
					JOptionPane.showMessageDialog(null, "The shadow didn't seem to mind you. We hoped you would aid us in our quest to rid ourselves of the shadow. If you do not wish to, we understand. We will wipe your memories of this encounter and you can return to your day.");
					int choice4 = JOptionPane.showOptionDialog(null, "'So, what do you say?'", "Underwater", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Help", "Don't Help" }, null);
					if (choice4==0) {
						JOptionPane.showMessageDialog(null, "You tell the Deften you're willing to help. He gives you a dagger and explains how it had been enchanted to fight off the shadow and had been used for that purpose in the past. 'It can also be used to tell if someone's telling the truth.");
						JOptionPane.showMessageDialog(null, "Ability unlocked! When given the choice, you can use the ability to determine if someone is being truthful. But be careful, someone may tell you the truth, but not the full story.");
						JOptionPane.showMessageDialog(null, "'We never hit the shadow directly, but we believe if we do, we will rid ourselves of the shadow. Go the the cabin and carry out the duty.'");
						int abilityChoice1 = JOptionPane.showOptionDialog(null, "Do you wish to use your truth ability on the Deften?", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Yes", "No" }, null);
						if (abilityChoice1==0) {
							JOptionPane.showMessageDialog(null, "The Deften is telling the truth.");
						}
						else if (abilityChoice1==1) {
							JOptionPane.showMessageDialog(null, "You choose to trust the Deften.");
						}
						JOptionPane.showMessageDialog(null, "You swim to the surface and enter the cabin.");
						JOptionPane.showMessageDialog(null, "When you enter the cabin, you see a figure standing there. It turns around and says 'Hello, I presume you were sent by the creatures in the lake?'");
						JOptionPane.showMessageDialog(null, "I'm not too fond of those monsters, but I don't think you understand the full story, do you?");
						JOptionPane.showMessageDialog(null, "You brandish the dagger and tell him what you know. 'Like I thought. That isn't a lie, but it's not the full story either. Do you wish to hear me out?");
						int moralChoice1 = JOptionPane.showOptionDialog(null, "Do you wish to hear the figure out?", "Cabin", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Yes", "No" }, null);
						if (moralChoice1==1) {
							JOptionPane.showMessageDialog(null, "Instead of listening to the figures story, you charge the creature, and use the dagger");
							JOptionPane.showMessageDialog(null, "As soon as the blade touches him, he disapears. You drop the dagger into the lake.");
							JOptionPane.showMessageDialog(null, "Your mind is wipped blank of the whole experience and wonder why you are standing at the lake's edge. You soon return home in a few hours and spend the rest of the day in your room."); 
							JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
									new String[] { "THE END" }, null);
						}
						else if (moralChoice1==0) {
							if (moralChoice1==0) {
								JOptionPane.showMessageDialog(null, "'I once lived in the lake as a lone soul. After many years of peace, another species came and forced me out of my home.'");
								JOptionPane.showMessageDialog(null, "'For many years, I've been trying to get my home back, but my power has reduced, being on land all this time and I'm powerless to free myself from those creatures.'");
									int abilityChoice2 = JOptionPane.showOptionDialog(null, "Will you use your truth ability?", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
										new String[] {"Yes", "No" }, null);	
									if (abilityChoice2==0) {
										JOptionPane.showMessageDialog(null, "The creature is telling the truth");
									}
									if (abilityChoice2==1) {
										JOptionPane.showMessageDialog(null, "You choose to judge the creature yourself.");
									}
								else {
									JOptionPane.showMessageDialog(null, "You have no ability to use here.");
								}
								 int Choice5 = JOptionPane.showOptionDialog(null, "'Will you help me?'", "Cabin", 0, JOptionPane.INFORMATION_MESSAGE, null,
										new String[] {"Yes", "No" }, null);
								if (Choice5==0) {
									JOptionPane.showMessageDialog(null, "You trust the creature and you the decide to help the creature. He gives you a vial with something inside. 'I cannot leave this cabin, please, pour the contents into the lake.'");
									JOptionPane.showMessageDialog(null, "You are informed of how it will cause the creatures in the lake to have a change of heart. The creature will handle the rest.");
									JOptionPane.showMessageDialog(null, "You do as you are asked and continue on your way.");
									JOptionPane.showMessageDialog(null, "You continue walking through the forest, happy to have been of some help to the creature.");
									JOptionPane.showMessageDialog(null, "Nothing much else happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room."); 
									JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
											new String[] { "THE END" }, null);
								}
								else if (Choice5==1) {
								JOptionPane.showMessageDialog(null, "Not believing this creature's story, you use your dagger on the creature.");
								JOptionPane.showMessageDialog(null, "As soon as the blade touches him, he disapears. You drop the dagger into the lake.");
								JOptionPane.showMessageDialog(null, "Your mind is wipped blank of the whole experience and wonder why you are standing at the lake's edge. You soon return home in a few hours and spend the rest of the day in your room."); 
								JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
										new String[] { "THE END" }, null);
								}
							}

						}
					}
					else if (choice4==1) {
						JOptionPane.showMessageDialog(null, "You are in the lake, dodging Matt's splashes and trying to get him. For the next hour, this continues on with Jane swimming laps around the lake.");
						JOptionPane.showMessageDialog(null, "When it starts getting dark, you all head home, exhausted from you day in the woods.");
						JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "THE END" }, null);
				}
			}
		}
	}
