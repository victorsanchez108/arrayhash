import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class agendaej6 {
    private ArrayList<contactoej6> agenda;
    public agendaej6(){
        this.agenda = new ArrayList<contactoej6>();

    }
    public void nuevocontacto(contactoej6 otrocontacto){
        agenda.add(otrocontacto);

    }

    public boolean nuevocontacto(contactoej6 otrocontacto , int posicion){
        agenda.add(posicion,otrocontacto);
        return true;

    }

    public void mostrarAgenda(){
      for (int i = 0;i < agenda.size();i++){
          System.out.println(agenda.get(i) +  ", ");
      }

    }

    public String buscartelefono(String nombre,String apellidos){
        Iterator<contactoej6> it = agenda.iterator();
        String paco = "No existe el telefono para ese nombre";
        while (it.hasNext()){
          contactoej6 c = it.next();
          if(nombre.equals(c.getNombre()) && apellidos.equals(c.getApellidos())){
             return c.getTelefono();
            }

        };
        return paco;

    }

    public String buscarnombre (String telefono){
        Iterator<contactoej6> it2 = agenda.iterator();
        String paco = "No existe el nombre para ese telefono";
        while (it2.hasNext()){
            contactoej6 c = it2.next();
            if(telefono.equals(c.getTelefono())){
                return c.getNombre();
            }

        };
        return paco;



    }

    public boolean eliminarcontacto(String nombre , String apellido){
        Iterator<contactoej6> it3 = agenda.iterator();
        String paco = "No existe el telefono para ese nombre";
        while (it3.hasNext()){
            contactoej6 c = it3.next();
            if(nombre.equals(c.getNombre()) && apellido.equals(c.getApellidos())){
                it3.remove();
                return true;
            }

        };

         return false;


    }




}
