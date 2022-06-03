public class Gasto {
    private String Concepto;
    private int Importe;

    public Gasto(String Concepto, int Importe) {
        this.Concepto = Concepto;
        this.Importe = Importe;
    }

    public static Gasto generateGasto(String nombre, int Importe) {
        return new Gasto(nombre, Importe);
    }

    @Override
    public String toString() {
        return "gasto{" +
                "motivo='" + Concepto + '\'' +
                ", coste=" + Importe +
                '}';
    }

}
