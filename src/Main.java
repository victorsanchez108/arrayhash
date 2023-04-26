import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicios ejercicio = new ejercicios();
        int menu;

        do {
            for (int i = 1; i < 14; i++) {
                System.out.println(i + ".ejercicio --> " + i);
            }
            System.out.println("0.Salir");
            System.out.printf(": ");
            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    sc.nextLine();
                    ejercicio.ejercicio1(sc);
                    break;
                case 2:
                    sc.nextLine();
                    ejercicio.ejercicio2(sc);
                    break;
                case 3:
                    sc.nextLine();
                    ejercicio.ejercicio3(sc);
                    break;
                case 4:
                    sc.nextLine();
                    ejercicio.ejercicio4(sc);
                    break;

            }

        } while (menu != 0);
    }
}