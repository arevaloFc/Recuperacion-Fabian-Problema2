import java.util.ArrayList;

public class Stack <T>{
    private final int POSICION_INICIO = 0;

    private ArrayList<T> colletion = new ArrayList<T>(); /*Se crea una coletion*/

    public void push(T element){
        colletion.add(POSICION_INICIO,element);
    }

    public T pop(){
        return colletion.remove(POSICION_INICIO);
    }

    public void mostrar(){
        for (int i = 0; i <colletion.size() ; i++) {
            System.out.println("lista de gastos: " + ( i + 1 ) + " " + colletion.get(i));
        }
    }
    public int getLength() {
        return colletion.size();
    }

    @Override
    public String toString() {
        String out = "Top -> "; /*concatenar recuerdas es esto en java*/
        for (T element: colletion) {
            out += element.toString() + " | ";
        }
        return out;
    }
}