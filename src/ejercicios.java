import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class ejercicios {

    public static void ejercicio1(Scanner sc) {
        ArrayList<String> al = new ArrayList<String>();

        //b) llama al método muestraColores e impleméntalo.
        // Este método imprimirá el contenido del array que se le pase por parámetro, si no tiene ningún elemento, indicaá con un mensaje que
        //está vacío
        muestraColores(al);
        // c) Añade elementos al ArrayList
        //Los colores a añadir serán: amarillo, rojo, verde, azul y blanco.
        al.add("amarillo");
        al.add("rojo");
        al.add("verde");
        al.add("azul");
        al.add("blanco");
        //d) vuelve a mostrar los colores
        System.out.println("d-->");
        muestraColores(al);
        //e) Mostrar el primer elemento
        System.out.println("E-->" + al.get(0));
        //f) Mostrar el útlimo elemento
        System.out.println("F-->" + al.get(al.size()-1));
        // g) encontrar un elemento y borrarlo, por ejemplo el rojo
        System.out.println("Elemento rojo eliminado");
        al.remove("rojo");
        //implementar un método eliminarElemento
        // si no está, mostrar un mensaje "Color no encontrado"
        //si está, mostrar un mensaje diciendo en que posición del array está
       eliminarElemento(al,sc);

    }

    private static void eliminarElemento(ArrayList<String> al,Scanner sc) {
        System.out.println("Dame un color a eliminar");
        String color2;
        color2 = sc.nextLine();
        int cont  = 0;

        for(int i = 0;i<al.size();i++){
            if(!al.get(i).equals(color2)){
                cont++;
            }
        }
        if(cont == al.size()){
            System.out.println("Color no encontrado");

        }else {
            System.out.println("Color encontrado");
        }
        al.remove(color2);
        //e) Mostrar el arrayList
        System.out.println("Arraylist--> ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ", ");
        }


    }

    private static void muestraColores(ArrayList<String> array) {

        System.out.println("Arraylist--> ");
        for(int i = 0;i<array.size();i++){
            System.out.print(array.get(i) + ", ");
        }
    }

    public static void ejercicio2(Scanner sc) {
      ArrayList<Integer> ej2 = new ArrayList<Integer>();
        System.out.println("A)");
      int n = 0;
        do {
            System.out.println("Dame un numero | 0.-> Exit");
            n = sc.nextInt();
            if(n > 0){
                ej2.add(n);
            }

        }while (n!=0);
        System.out.println("B)");
        Iterator it = ej2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("C)");
        System.out.println(ej2);
        System.out.println("D)");
        int ari = 0;
        for (int i = 0; i < ej2.size(); i++) {
            ari = ari + ej2.get(i);
        }
        System.out.println("E)");
        System.out.println("La media aritmetica es --> "  + ari/ej2.size());
        System.out.println("F)");
        Collections.sort(ej2);
        System.out.println(ej2);
        System.out.println("G)");
        for (int i = 0; i < ej2.size(); i++) {
            if(ej2.get(i).equals(10)){
                System.out.println("Esta en la posicion " + i + " del array");
            }
        }
        System.out.println(ej2.indexOf(10));
        System.out.println("H)");
        Collections.reverse(ej2);
        System.out.println(ej2);
        System.out.println("I)");
        System.out.println(Collections.min(ej2));
        System.out.println(Collections.max(ej2));


        
    }

    public static void ejercicio3(Scanner sc) {
        ArrayList<String> ej3 = new ArrayList<String>();
        System.out.println("A");
        for (int i = 1; i < 11; i++)
        {
            ej3.add("Alumno" + i);

        }
        System.out.println(ej3);

        System.out.println("B");
        ej3.add(2,"Alumno3");
        System.out.println(ej3);
        System.out.println("C");
        Iterator it = ej3.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("D");
        System.out.println(ej3.size());
        System.out.println("E");
        ej3.remove(0);
        System.out.println("F");

        Iterator<String> iterador = ej3.iterator();
        while (iterador.hasNext()){
            String t = iterador.next();
            if(t.equals("Alumno3")){
                iterador.remove();
            }

        }
        System.out.println("G");
        System.out.println(ej3);
        System.out.println("H");
        System.out.println(ej3.size());
        
    }
    public static void ejercicio4(Scanner sc){
        partidoej4 partidos = new partidoej4();




    }








}







