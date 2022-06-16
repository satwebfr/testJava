/*
 * ja01 : création de variables en Java
 */
package ja01;

import java.util.Scanner;

/**
 *
 * @author jef
 */
public class Ja01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String nom;
    String prenom;

    Scanner clavier = new Scanner(System.in);

    // Saisie des variables
    System.out.println("Nom ?");
    nom = clavier.nextLine();
    System.out.println("Prénom ?");
    prenom = clavier.nextLine();
    // Affichage
    System.out.println("Bonjour, je m'appelle "+prenom+" "+nom+" et j'aime Java");
  }

}
