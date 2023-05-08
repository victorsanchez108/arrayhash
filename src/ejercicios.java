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
        Iterator<Integer> it = ej2.iterator();
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
    public static void ejercicio4(Scanner sc) {
        ArrayList<partidoej4> partidos = new ArrayList<>();

        partidoej4 partido1 = new partidoej4("Guadalcacín F.S.", "Leganés FSF", 1, 7);
        partidos.add(partido1);
        partidoej4 partido2 = new partidoej4("Jimbee Roldán F.S.F.", "F.S.F. Mostoles", 2, 2);
        partidos.add(partido2);
        partidoej4 partido3 = new partidoej4("Burela F.S.", " A.D. Sala Zaragoza F.S.", 2, 0);
        partidos.add(partido3);
        partidoej4 partido4 = new partidoej4("A.E. Penya Esplugues", "Viaxes Amarelle F.S.", 1, 0);
        partidos.add(partido4);
        partidoej4 partido5 = new partidoej4("Femisport Palau Club ", "Poio Pescamar F.S.", 2, 2);
        partidos.add(partido5);
        partidoej4 partido6 = new partidoej4("Majadahonda F.S.F.", " C.D. Universidad De Alicante", 1, 6);
        partidos.add(partido6);
        partidoej4 partido7 = new partidoej4("C.D. Futsi Atletico Feminas", " UCAM El Pozo Murcia FS", 8, 0);
        partidos.add(partido7);
        partidoej4 partido8 = new partidoej4("A. D. Alcorcón F.S.", " Ourense Envialia C.F.", 3, 4);
        partidos.add(partido8);


        Iterator<partidoej4> it = partidos.iterator();
        int viclocal = 0, vicvis = 0, emp = 0, mayorg = 0, eqgo = 0, max = Integer.MIN_VALUE;
        while (it.hasNext()) {
            partidoej4 partido = it.next();
            if (partido.getGoleslocal() > max) {
                max = partido.getGoleslocal();
                if (partido.getGolesvisitante() > max) {
                    max = partido.getGolesvisitante();
                }
            }


            System.out.println(partido.getEquipolocal() + " " + partido.getGoleslocal() + "-" + partido.getGolesvisitante() + " " + partido.getEquipovisitante());
            if (partido.getGolesvisitante() > partido.getGoleslocal()) {
                vicvis++;
            } else if (partido.getGoleslocal() > partido.getGolesvisitante()) {
                viclocal++;
            } else {
                emp++;
            }

        }
        System.out.println("------------------------------------");
        System.out.println("Partidos victora local " + viclocal);
        System.out.println("Partidos victora visitante " + vicvis);
        System.out.println("Partidos empate " + emp);
        Iterator<partidoej4> it2 = partidos.iterator();
        while (it2.hasNext()) {
            partidoej4 partidods = it2.next();
            if (partidods.getGolesvisitante() == max) {
                System.out.println(partidods.getEquipolocal() + "  " + partidods.getGoleslocal() + "-" + partidods.getGolesvisitante() + " " + partidods.getEquipovisitante());
                System.out.println(partidods.getEquipolocal());
            } else if (partidods.getGoleslocal() == max) {
                System.out.println(partidods.getEquipolocal() + "  " + partidods.getGoleslocal() + "-" + partidods.getGolesvisitante() + " " + partidods.getEquipovisitante());
                System.out.println(partidods.getEquipolocal());
            }


        }


    }

    public static void ejercicio5(Scanner sc){
        ArrayList<personaej5> personas = new ArrayList<>();
        personaej5 persona1 = new personaej5("Lola1" , 241);
        personas.add(persona1);
        personaej5 persona2 = new personaej5("Lola2" , 242);
        personas.add(persona2);
        personaej5 persona3 = new personaej5("Lola3" , 243);
        personas.add(persona3);
        personaej5 persona4 = new personaej5("Lola4" , 244);
        personas.add(persona4);
        personaej5 persona5 = new personaej5("Lola5" , 245);
        personas.add(persona5);
        personaej5 persona6 = new personaej5("Lola6" , 246);
        personas.add(persona6);
        personaej5 persona7 = new personaej5("Lola7" , 247);
        personas.add(persona7);
        personaej5 persona8 = new personaej5("Victor" , 21);
        personas.add(persona8);

        System.out.println(personas);

        Collections.sort(personas , new Comparator<personaej5>() {
            @Override
            public int compare(personaej5 p1, personaej5 p2) {
                return  Integer.compare(p1.getEdad(),p2.getEdad());
            }
        });
        System.out.println("Ordenado 1");
        System.out.println(personas);
        Collections.sort(personas , new Comparator<personaej5>() {
            @Override
            public int compare(personaej5 p1, personaej5 p2) {
                return  Integer.compare(p2.getEdad(),p1.getEdad());
            }
        });
        System.out.println("Ordenado 2 ");
        System.out.println(personas);




        System.out.println("\n");



    }
    public static void ejercicio6(Scanner sc){
        int menu2;
        agendaej6 pre = new agendaej6();
        contactoej6 hola = new contactoej6();

        do {
            System.out.println("1- Añadir contacto");
            System.out.println("2- Eliminar contacto");
            System.out.println("3- Buscar contacto con telefono");
            System.out.println("4 -Busca contacto con nombre y apellido");
            System.out.println("5- Mostrar agenda");
            System.out.println("0- Salir");
            menu2 = sc.nextInt();
            sc.nextLine();

            switch (menu2){
                case 1:
                    System.out.println("Dame el nombre");
                    hola.setNombre(sc.nextLine());
                    System.out.println("Dame el apellido");
                    hola.setApellidos(sc.nextLine());
                    System.out.println("Dame el numero de telefono");
                    hola.setTelefono(sc.nextLine());
                    pre.nuevocontacto(hola);
                    break;
                case 2:
                    String nombre,apellidoss;
                    System.out.println("Para eliminar un contacto dame el nombre y el apellido");
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellidoss = sc.nextLine();
                   if(pre.eliminarcontacto(nombre,apellidoss)){
                       pre.eliminarcontacto(nombre,apellidoss);
                       System.out.println("Se ha eliminado correctamente");
                   }else {
                       System.out.println("No existe el contacto");
                   }

                    break;
                case 3:
                    String telfbus;
                    System.out.println("Dame el telefono");
                    telfbus = sc.nextLine();
                    if(hola.getTelefono().equals(telfbus)){
                        System.out.println("Nombre: "+ hola.getNombre() + " apellido " + hola.getApellidos());

                    }
                    break;
                case 4:
                    String nombre2,apellidoss2;
                    System.out.println("Nombre: ");
                    nombre2 = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellidoss2 = sc.nextLine();
                    if(hola.getNombre().equals(nombre2) && hola.getApellidos().equals(apellidoss2)){
                        System.out.println("El telefono es: "+ hola.getTelefono());
                    }
                    break;
                case 5:
                    pre.mostrarAgenda();
                    break;



            }



        }while (menu2!=0);


    }







}







