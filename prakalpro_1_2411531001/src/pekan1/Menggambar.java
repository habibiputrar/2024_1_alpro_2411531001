package pekan1;

public class Menggambar {

	public static void main(String[] args) {
		egg ();
		teacup ();
		stopSign ();
		hat ();
	}
    // Draws the top half of an an egg figure.
	public static void eggTop() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	// Draws the bottom half of an egg figure.
	public static void eggBottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	// Draws acomplete egg figure.
	public static void egg() {
		eggTop();
		eggBottom();
		System.out.println();
	}
	// Draws a teacup figure.
	public static void teacup() {
		eggBottom();
		line();
		System.out.println();
	}
	// Draws a stop sign figure.
	public static void stopSign() {
		eggTop();
		System.out.println("|  STOP  |");
		eggBottom ();
		System.out.println();
	}
	// Draws a figure that looks sort of like a hat.
	public static void hat() {
		eggTop();
		line();
	}
	// Draws a line of dasehs.
	public static void line() {
		System.out.println("+--------+");
	}
}