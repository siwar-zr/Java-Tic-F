import models.CompteBancaire;
import models.Human;
import models.Livre;

import java.util.Scanner;
/*class Mobile{
    String brand;
    int price;
    static String category;

    static {
        category = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }

    public void show(){
        System.out.println(brand + " : "+ price + " : "+ category);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : "+ obj.price + " : "+ category);
    }
}*/
public class Main {
    public static void main(String[] args) {
//        int[][] tab = new int [3][];
//
//        tab[0] = new int[4];
//        tab[1] = new int[3];
//        tab[2] = new int[2];
//
//
//        for (int i =0; i < tab.length ; i++){
//            for (int j = 0; j < tab[i].length ; j++){
//                tab[i][j] = (int) (Math.random()*100);
//                System.out.print(tab[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int [] n : tab){
//            for (int m : n){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//


        /*Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.category = "Smartphone";

        Mobile m2 = new Mobile();

        m1.show();
        m2.show();*/
/*
        Human h1 = new Human();
        h1.setName("Med");
        h1.setAge(25);

        Human h2 = new Human("Sonia",30);


        System.out.println(h1.getAge());
        h2.show();*/

/*

        //Exercice 1:

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le titre du livre : ");
        String titre = sc.next();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = sc.next();
        System.out.print("Entrez la disponibilite du livre : ");
        boolean dispo = sc.nextBoolean();

        Livre livre = new Livre(titre,auteur,dispo);

        System.out.println();
        System.out.println("Premier empreint :");
        livre.emprunter();
        livre.showDetails();
        System.out.println();
        System.out.println("Deuxieme empreint :");
        livre.emprunter();
        livre.showDetails();
        System.out.println();
        System.out.println("Premier retour :");
        livre.retourner();
        livre.showDetails();
        System.out.println();
        System.out.println("Deuxieme retour :");
        livre.retourner();
        livre.showDetails();
*/
        //exercice 2

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le numero du compte : ");
        String numero = sc.next();
        System.out.print("Entrez le solde initial du compte : ");
        double solde = sc.nextDouble();

        CompteBancaire cb = new CompteBancaire(numero,solde);

        System.out.println();
        System.out.println("1er depot");
        cb.deposer(1000);
        System.out.println();
        System.out.println("1er retrait");
        cb.retirer(1000);
        System.out.println();
        System.out.println("2eme retrait");
        cb.retirer(1000);
        System.out.println();
        System.out.println("3eme retrait");
        cb.retirer(100);

    }
}