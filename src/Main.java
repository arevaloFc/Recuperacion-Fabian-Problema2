import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LibroGasto librito = new LibroGasto("Lol");

        boolean salir = false;

        Scanner sc = new Scanner(System.in);
        String opcionUsuario = "";

        while (!salir) {
            System.out.println("1.Añadir un gasto.");
            System.out.println("2.Ver lista de gastos");
            System.out.println("3.Calcular gasto total.");
            System.out.println("Q- Salir");

            opcionUsuario = sc.nextLine();

            switch (opcionUsuario) {
                case "1":
                    System.out.println("motivo del gasto");
                    String motivo = sc.nextLine();
                    System.out.println("coste del gasto");
                    int coste = sc.nextInt();
                    librito.addGastos(motivo,coste);
                    break;
                case "2":
                    librito.mostrar();
                    break;
                case "3":
                    librito.eliminarGastos();
                    break;
                case "Q":
                    System.out.println("Saliendo de la aplicación...");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        }
    }
}
