
package programa;

import java.util.List;


public class MainRepository {

    public static void main(String[] args) {
        PersonaRepository repository = new PersonaRepository();
        Persona pr4 = new Persona(1004, "JOEL", "DURAN", 21);
        repository.Agregar(pr4);

        List<Persona> List = repository.getPersonas();

        for (Persona persona : List) {
            System.out.println(persona);
        }
        Persona result = repository.getPersona(1009);
        System.out.println(result);

        String filtro = "EL";
        System.out.println("busqueda " + filtro);

        List<Persona> ListFilter = repository.getPorNombre(filtro);
        System.out.println(ListFilter);

        int inicio = 1;
        int fin = 21;

        System.out.println("buscar de rango " + inicio + "-" + fin);
        List<Persona> ListFiltro = repository.getPorRangoEdad(inicio, fin);
        System.out.println(ListFiltro);

    }
}


