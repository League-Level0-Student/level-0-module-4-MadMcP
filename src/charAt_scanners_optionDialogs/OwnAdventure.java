package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		String name;
		JOptionPane.showMessageDialog(null, "This is an uncomplete version. Some paths will be showed, but locked.");
		name = JOptionPane.showInputDialog("What is your character's name?");
		JOptionPane.showMessageDialog(null, "You and two of your friends, Jane and Matt, have just entered the local woods. There's nothing exciting about it, but your parents forced you three into going outside, so you decided to explore.");
		JOptionPane.showMessageDialog(null, "After a while of mindless walking, you stumble upon an abandoned cabin near a small lake. The cabin, while messy, is in relatively good shape.");
		int choice1 = JOptionPane.showOptionDialog(null, "What do you do?", "Forest", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Keep Walking", "Swim", "Enter The Cabin (locked)" }, null);
		if (choice1==0){
			JOptionPane.showMessageDialog(null, "You continue walking through the forest.");
			JOptionPane.showMessageDialog(null, "Nothing much happens besides a few spottings of birds, mostly chickadees. You return home in a few hours and spend the rest of the day in your room.");
			JOptionPane.showOptionDialog(null, "You've reached the end of this story line. Feel free to play again!", "THE END", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "THE END" }, null);
		}
		else if (choice1==1) {
			JOptionPane.showMessageDialog(null, "Both Matt and Jane seem into the idea of swimming in the pond and coincidentally, you all decided to bring your swimsuits.");
			JOptionPane.showMessageDialog(null, "You splash Matt, starting a fight between the two of you. You start splashing each other to see who can get the other more.");
			JOptionPane.showMessageDialog(null, "Suddenly you hear Jane yell. '" +name+ "! Matt! Help!'");
			JOptionPane.showMessageDialog(null, "When you look where she just was, you see nothing but ripples in the water and her hairclip, just below the surface of the water sinking into the water's depths.");
			JOptionPane.showMessageDialog(null, "You hear an eerie voice inside your head demanding you swim down into the lake and copperate or you won't ever see your friend alive again.");
			int choice2 = JOptionPane.showOptionDialog(null, "What do you do?", "Lake", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Search Underwater", "Get Help" }, null);
			if (choice2==0) {
				JOptionPane.showMessageDialog(null, "You tell Matt to follow you. Squinting, you see something that may be a cave on the lake's floor. You and Matt dive down to chase after Jane.");
				JOptionPane.showMessageDialog(null, "You miscalculated how far under the surface the rock form is. Still swimming downward, you can't stop yourself. You breath in the water.");
				JOptionPane.showMessageDialog(null, "Suprisingly, you don't get a mouthful of water, but a lungful of air. You signal to Matt to breath normally. He looks at you quizically, but does so. A look of suprise shows on his face.");
				JOptionPane.showMessageDialog(null, "Some sort of magic seems to be allowing you to breath normally, even underwater.");
				JOptionPane.showMessageDialog(null, "Suddenly, you see Matt's eyes widden and feel a hand on your shoulder. You quickly spin around to find a sort of fishman, who's holding a spear, staring down at you. He isn't a merman, that's for sure, but he seem to be part fish, part man.");
				int choice3 = JOptionPane.showOptionDialog(null, "He guesters for you to follow. What do you do?", "Underwater", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Keep Swimming", "Follow Him" }, null);
			}
			else if (choice2==1) {
				JOptionPane.showMessageDialog(null, "You and Matt run out of the forest and drag your parents back into the forest. When you return to the lake you see a figure lying on the opposite sand bank. You rush over and find that its Jane.");
				JOptionPane.showMessageDialog(null, "She isn't breathing. It appears that in the time it took you to fetch your parents, she drowned and then washed ashore.");
				JOptionPane.showMessageDialog(null, "You return home knowing you will never go back into that forest and knowing nothing will ever be the same.");
			}
		}
	}
}
