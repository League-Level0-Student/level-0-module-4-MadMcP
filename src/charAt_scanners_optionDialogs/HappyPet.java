package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String name;
		String pet;
		pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		name = JOptionPane.showInputDialog("What are you going to name your " +pet+ "?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10000000; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make " +name+ " happy?", "Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Walk", "Groom", "Give Water", "Pet", "Play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task==0) {
				cuddle();
			}
			else if (task==1) {
				feed();
			}
			else if (task==2) {
				walk();
			}
			else if (task==3) {
				groom();
			}
			else if (task==4) {
				water();
			}
			else if (task==5) {
				pet();
			}
			else if (task==6) {
				play();
			}
			if (happinessLevel==100) {
				JOptionPane.showMessageDialog(null, "You sure love " +name+ "!");
				break;
			}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void water() {
		JOptionPane.showMessageDialog(null, "Your pet drinks the water", "Water", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet eats the food", "Food", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet cuddles with you", "Cuddle", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void pet() {
		JOptionPane.showMessageDialog(null, "Your pet starts to cuddle with you", "Pet", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void groom() {
		JOptionPane.showMessageDialog(null, "Your pet struts the red carpet (with style)", "Groom", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void play() {
		JOptionPane.showMessageDialog(null, "Your pet destroys the toy", "Play", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
	public static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet drags you along", "Walk", JOptionPane.INFORMATION_MESSAGE);
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pets happiness level is " +happinessLevel);
	}
}