import java.util.*;

public class RegistroDisquera {

    private static RegistroDisquera instancia;

    private List<String> artistas;

    private RegistroDisquera() {
        artistas = new ArrayList<>();
    }

    public static RegistroDisquera getInstance() {
        if (instancia == null) {
            instancia = new RegistroDisquera();
        }
        return instancia;
    }

    public void registrarArtista(String artista){
        artistas.add(artista);
    }

    public void mostrarArtistas(){
        System.out.println("Artistas: ");
        System.out.println(" ");
        for (String artista : artistas){

            System.out.println("- " + artista);
        }
    }


}