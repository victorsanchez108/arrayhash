import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            for (int i = 1; i < 14; i++) {
                System.out.println(i + ".ejercicio --> " + i);
            }
            System.out.println("0.Salir");
            System.out.print(": ");
            menu = sc.nextInt();


            switch (menu) {
                case 1 -> {

                    ejercicios.ejercicio1(sc);
                }
                case 2 -> {
                    sc.nextLine();
                    ejercicios.ejercicio2(sc);
                }
                case 3 -> {
                    sc.nextLine();
                    ejercicios.ejercicio3(sc);
                }
                case 4 -> {
                    sc.nextLine();
                    ejercicios.ejercicio4(sc);
                }
                case 5 -> {
                    sc.nextLine();
                    ejercicios.ejercicio5(sc);
                }
                case 6 -> {
                    sc.nextLine();
                    ejercicios.ejercicio6(sc);
                }
            }

        } while (menu != 0);
    }
}