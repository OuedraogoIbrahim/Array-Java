/**
 * Initialisation
 */
public class Initialisation {

    public static final int MAX_LINES = 8;
    public static final int MAX_COLUMS = 8;
    private String[][] array; // * *********** */

    protected int lines;
    protected int colums;

    public void lines(int lines) {
        if (lines <= 1 || lines > MAX_LINES) {
            System.out.println("Nombres de lignes doit etre compris entre 2 et 8");
            System.exit(1);
        }
        this.lines = lines;
    }

    public void colums(int colums) {
        if (colums <= 1 || colums > MAX_COLUMS) {
            System.out.println("Nombres de colonnes doit etre compris entre 2 et 8");
            System.exit(1);
        }
        this.colums = colums;
    }

    public String[][] initialArray() {
        array = new String[this.lines][this.colums];

        for (int index = 0; index <= this.colums + 1; index++) {
            System.out.print(" * ");
        }

        System.out.println();

        for (String[] a : array) {
            for (int i = 0; i <= a.length + 1; i++) {
                if (i == 0 || i == a.length + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int index = 0; index <= this.colums + 1; index++) {
            System.out.print(" * ");
        }

        // for (int index = 0; index <= this.colums + 1; index++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // for (int i = 0; i < this.lines; i++) {
        // for (int j = 0; j <= this.colums + 1; j++) {
        // if (j == 0 || j == this.colums + 1) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int k = 0; k <= this.colums + 1; k++) {
        // System.out.print(" * ");
        // }

        return array;
    }

    // Getters

    public int getLines() {
        return this.lines;
    }

    public int getColums() {
        return this.colums;
    }

}