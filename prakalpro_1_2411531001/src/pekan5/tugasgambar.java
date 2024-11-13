package pekan5;

public class tugasgambar {
    public static void main(String[] args) {
        String[] pattern = {
            "        <><>         ",
            "     <>  . .  <>     ",
            "   <> . . . . . <>   ",
            " <> . . . . . . . <> ",
            "<> . . . . . . . . <>",
            "<> . . . . . . . . <>",
            " <> . . . . . . . <> ",
            "   <> . . . . . <>   ",
            "     <>  . .  <>     ",
            "        <><>         "
        };

        // Print the top border
        System.out.println("#" + "=".repeat(21) + "#");

        // Print the pattern
        for (String line : pattern) {
            System.out.println("|" + line + "|");
        }

        // Print the bottom border
        System.out.println("#" + "=".repeat(21) + "#");
    }
}
