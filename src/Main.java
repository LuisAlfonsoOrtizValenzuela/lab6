//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
        RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();

        departamentoMarketing.registrarArtista("Dua lipa");
        departamentoMarketing.registrarArtista("The Wekend");

        departamentoProduccion.registrarArtista("Rosalia");

        departamentoProduccion.mostrarArtistas();

        boolean ess = (departamentoMarketing == departamentoProduccion);

        System.out.println(" ");
        System.out.println("¿Apuntan al mismo espacio de memoria?");
        System.out.println(ess);




    }
}