public class LibroGasto {
    private String name;
    private Stack<Gasto> gastos = new Stack<Gasto>();

    public LibroGasto(String name) {
        this.name = name;
    }

    public void addGastos(String nombre, int importe) {
        gastos.push(Gasto.generateGasto(nombre,importe));
    }

    public void mostrar(){
        gastos.mostrar();
    }

    public void eliminarGastos() {
        int lista = gastos.getLength();

        for (int i = 0; i < lista; i++) {
            gastos.mostrar();
            System.out.println("----------------");
            gastos.pop();
        }
    }

    /*No tuve mas tiempo ._.*/


}
