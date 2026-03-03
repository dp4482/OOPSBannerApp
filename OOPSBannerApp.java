/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by storing banner lines
 * in a String array and printing them using a loop.
 *
 * @author Dinesh Panda
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {

            String.join("   ", " ***** ", " ***** ", "****** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "****** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}