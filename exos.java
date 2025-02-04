import java.lang.Math;
import java.util.Random;


/*
public class exos {
    public static void main (String[] args){
        for (int i = 1; i < 20; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
*/



/*
public class exos {
    public static void main (String[] args){
        System.out.println("Lancement!");
        for (int i = 10; i > 0; --i) {
                System.out.println(i);
        }
    }
}
*/

public class exos {
    public static void main (String[] args){
        float moyenne = 0;
        int mediane;
        Random random = new Random();
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(20);
            System.out.println(tab[i] + " ");
            moyenne += tab[i];
        }

        /** MEDIANE **/
        moyenne /= tab.length;
        System.out.println("La moyenne est de "+ moyenne);



        /** MEDIANE **/
        int[] tab2 = tab;// histoire de preserver l ordre du tableau originel

        for (int i = 0; i < tab2.length; i++) {
            for (int j = i + 1; j < tab2.length; j++) {
                if (tab2[i] > tab2[j]) {
                    int temp = tab2[i];
                    tab2[i] = tab2[j];
                    tab2[j] = temp;
                }
            }
        }

        mediane=tab2[2];
        System.out.println("La mediane est de "+ mediane);



        /** ECART-TYPE **/
        float ecarttype = 0;
        int[] tab3 = new int[5];// stockage des ecarts a la moyenne
        for (int i = 0; i < tab.length; i++) {
            tab3[i] = (int) Math.pow(tab[i] - moyenne, 2);
            ecarttype += tab3[i];//somme des carres des ecarts a la moyenne
        }
        ecarttype /= tab.length;
        ecarttype = (float) Math.sqrt(ecarttype);

        System.out.println("L'ecart-type est de "+ ecarttype);


    }
}
