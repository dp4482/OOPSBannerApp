/**
 * OOPSBannerApp UC3 – Banner using String.join()
 *
 * This version refactors UC2 by using String.join()
 * instead of string concatenation.
 *
 * @author Dinesh Panda
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "));

        System.out.println(String.join(" ",
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "));

        System.out.println(String.join(" ",
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "));

        System.out.println(String.join(" ",
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "));
    }
}