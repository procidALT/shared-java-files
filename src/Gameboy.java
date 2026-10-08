public class Gameboy {
    public static void main(String[] args) {
        final int gameboy_length = 26;
        final int gameboy_screen = 16;
        System.out.print(" ");
        for (int i = 0; i < gameboy_length; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
        //System.out.println(" _________________________ ");
        System.out.print("|OFF+ +ON");
        for (int i = 0; i < gameboy_length - 8; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("| .");
        for (int i = 0; i < gameboy_length - 4; i++) {
            System.out.print("-");
        }
        System.out.println(". |");
        System.out.print("| |  .");
        for (int i = 0; i < gameboy_screen; i++) {
            System.out.print("-");
        }
        System.out.println(".  | |");
        for (int i = 0; i < 7; i++) {
            System.out.print("| |  |");
            for (int j = 0; j < gameboy_screen; j++) {
                System.out.print(" ");
            }
            System.out.println("|  | |");
        }
        System.out.print("| |  '");
        for (int i = 0; i < gameboy_screen; i++) {
            System.out.print("-");
        }
        System.out.println("'  | |");
        System.out.print("| |__GAME BOY");
        for (int i = 0; i < gameboy_length - 14; i++) {
            System.out.print("_");
        }
        System.out.println("/ |");
        System.out.print("|");
        for (int i = 0; i < gameboy_length; i++) {
            if (i >= 10 && i <= 17) {
                System.out.print("_");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("|");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 17; i++) {
            if (i == 4) {
                System.out.print(".");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("(Nintendo)");
        for (int i = 0; i < gameboy_length - 19; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("|  _| |_   ");
        for (int i = 0; i < 8; i++){
            System.out.print("\"");
        }
        System.out.println("   .-.  |");
        System.out.print("|-[_   _]-");
        for (int i = 0; i < 7; i++) {
            System.out.print(" ");
        }
        System.out.println(".-. (   ) |");
        System.out.print("|   |_|");
        for (int i = 0; i < 9; i++) {
            System.out.print(" ");
        }
        System.out.println("(   ) '-'  |");
        System.out.print("|");
        for (int i = 0; i < gameboy_screen; i++) {
            if (i == 4) {
                System.out.print("'");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("'-'   A   |");
        System.out.print("|");
        for (int i = 0; i < gameboy_length; i++) {
            if (i == 17) {
                System.out.print("B");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("|");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 16; i++) {
            System.out.print(" ");
        }
        System.out.print("___   ___");
        for (int i = 0; i < gameboy_length - 19; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 17; i++) {
            System.out.print(" ");
        }
        System.out.println("(___) (___)  ,., |");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 18; i++) {
            System.out.print(" ");
        }
        System.out.println("Select Start ;::; |");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 6; i++) {
            System.out.print(" ");
        }
        System.out.println(",;:;' /");
        System.out.print("|");
        for (int i = 0; i < gameboy_length - 7; i++) {
            System.out.print(" ");
        }
        System.out.println(",:;:'.'");
        System.out.print(" ");
        for (int i = 0; i < gameboy_length - 4; i++) {
            System.out.print("-");
        }
        System.out.print("`");
    }
}
