public class Actions {

    protected int lines;
    protected int colums;

    public Actions() {

    }

    public Actions(int lines, int colums) {
        this.lines = lines;
        this.colums = colums;
    }

    public void verify(int myLine, int myColum) {
        if ((myLine < 1 || myLine > this.lines)
                || (myColum < 1 || myColum > this.colums)) {
            System.out.println("Acces impossible");
            System.exit(1);
        }
    }

    public void add(int addPosX, int addPosY, String[][] array) {
        System.out.println();
        System.out.println();

        // 1ere ligne avec le nombre de colonnes
        for (int i = 0; i <= this.colums + 1; i++) {
            System.err.print(" * ");
        }

        System.out.println();

        for (String[] a : array) {
            for (int i = -1; i <= a.length; i++) {
                if (i == -1 || i == a.length) {
                    System.out.print(" * ");
                } else if (i != a.length && a[i] == "+") {
                    System.out.print(" + ");
                } else {
                    System.out.print("   ");
                }
            }

            /* Autre possibilite */
            // for (int i = 0; i < array.length; i++) {
            // for (int j = 0; j <= this.colums + 1; j++) {
            // if (j == 0 || j == this.colums + 1) {
            // System.out.print(" * ");
            // } else if (j != this.colums && array[i][j] == "+") {
            // System.out.print(" + ");
            // } else {
            // System.out.print(" ");
            // }
            // }
            System.out.println();
        }

        for (int index = 0; index <= this.colums + 1; index++) {
            System.out.print(" * ");
        }

    }

    public void delete(int delPosX, int delPosY) {
        System.out.println();
        System.out.println();

        // 1ere ligne avec le nombre de colonnes
        for (int i = 0; i <= this.colums + 1; i++) {
            System.err.print(" * ");
        }

        System.out.println();

        for (int line = 1; line <= this.lines; line++) {
            for (int colum = -1; colum <= this.colums; colum++) {
                if (colum == -1 || colum == this.colums) {
                    System.out.print(" * ");
                } else if (delPosX == line && delPosY == colum) {
                    System.out.print("   ");
                } else {
                    System.err.print("   ");
                }

            }
            System.out.println();
        }

        // ligne avec le nombre de colonnes

        for (int index = 0; index <= this.colums + 1; index++) {
            System.out.print(" * ");
        }
    }

    public void clear(String[][] array) {
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
    }
}
