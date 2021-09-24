package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lampe lampe1 =new Lampe("lampe1");
        Lampe lampe2 =new Lampe("lampe2");
        Lampe lampe3 =new Lampe("lampe3");
        Lampe lampe4 =new Lampe("lampe4");
        Lampe lampe5 = new Lampe("lampe5");


        Lampe selected = null;
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);

            System.out.println("\nHvilken lampe skal ændres?");
            int lampenummer = input.nextInt();

            if (lampenummer==1){selected=lampe1;}
            else if (lampenummer == 2) {selected=lampe2;}
            else if (lampenummer == 3) {selected=lampe2;}
            else if (lampenummer == 4) {selected=lampe2;}
            selected.trykPåKontakt();


            }

        }

    }

