import java.util.Scanner;

class MainApp {

  public static void main(String[] args) throws Exception {

    String[][] myArray;

    Scanner sc = new Scanner(System.in);

    // Recuperation du nombre de lignes
    System.out.print("Nombres de lignes du tableau : ");
    while (!sc.hasNextInt()) {
      System.out.print("Entrez un entier : ");
      sc.next();
    }

    int nbLines = sc.nextInt();

    // Recuperation du nombre de colonnes

    System.out.print("Nombres de colonnes du tableau : ");
    while (!sc.hasNextInt()) {
      System.out.print("Entrez un entier : ");
      sc.next();
    }

    int nbColums = sc.nextInt();

    Initialisation init = new Initialisation();
    init.lines(nbLines);
    init.colums(nbColums);
    myArray = init.initialArray();

    System.out.println();

    while (true) {
      System.out.println();
      System.out.println();
      System.out.println("Actions disponibles : add , delete , clear");
      System.out.print(" Entrez une action : ");
      String myAction = sc.next();

      switch (myAction) {
        case "add":
          System.out.print("La ligne : ");
          int lineAdded = sc.nextInt();
          System.out.print("La colonne : ");
          int columAdded = sc.nextInt();

          Actions addActions = new Actions(nbLines, nbColums);
          addActions.verify(lineAdded, columAdded);
          if (myArray[lineAdded - 1][columAdded - 1] == "+") {
            System.out.println("Emplacement deja occupe");
            break;
          }
          myArray[lineAdded - 1][columAdded - 1] = "+";
          addActions.add(lineAdded, columAdded, myArray);
          break;

        case "delete":
          System.out.print("La ligne : ");
          int lineDeleted = sc.nextInt();
          System.out.print("La colonne : ");
          int columDeleted = sc.nextInt();

          Actions deleteAction = new Actions(nbLines, nbColums);
          deleteAction.verify(lineDeleted, columDeleted);
          if (myArray[lineDeleted - 1][columDeleted - 1] != "+") {
            System.out.println("Emplacement deja vide");
            break;
          }
          deleteAction.delete(lineDeleted, columDeleted);
          myArray[lineDeleted - 1][columDeleted - 1] = "";
          break;

        case "clear":
          for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
              myArray[i][j] = "";
            }
          }
          Actions clearAction = new Actions(nbLines, nbColums);
          clearAction.clear(myArray);
          break;

        default:
          System.out.println("Aucune action correspondante ");
          System.exit(1);
      }
    }

  }

}