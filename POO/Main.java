package POO;

public class Main{
    public static void main(String[] args){
        Voiture voiture = new Voiture();
        /*voiture.marque = "Toyota";
        voiture.modele = "corolla";
        voiture.couleur = "rouge";*/
        System.out.println("Choisir la marque de la voiture");
        voiture.marque = System.console().readLine();
        System.out.println("Choisir le modele de la voiture");
        voiture.modele = System.console().readLine();


        System.out.print("Choisir la couleur de la voiture entre rouge, vert et bleu: ");
        String couleur = System.console().readLine();
        boolean found=false;
        for (String color: voiture.couleurs_autorisees){
            if (couleur.equals(color)){
                voiture.couleur=couleur;
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("La couleur n'est pas autorisée");
            System.exit(1);

        }

    }



}