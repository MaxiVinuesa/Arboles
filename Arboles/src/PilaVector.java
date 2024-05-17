import java.util.Vector;

public class PilaVector {
    private static final int Inicial = 19;
    private int cima;
    private Vector listaPila;



    public PilaVector(){
        cima = -1;
        listaPila = new Vector(Inicial);
    }

    public boolean isPVacia(){
        return cima == -1;
    }

    public void insertar(Object elemento) throws Exception{
        cima++;
        listaPila.addElement(elemento);
    }

    public Object quitar() throws Exception{
        Object aux;
        if (isPVacia()){
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }
}
