//Laboratorio 1: Clases
//Marinés García 23391

public class Dado {
    public int valor;
    int dado;

    public int Die() {
        valor = (int) (Math.random() * 6) + 1;
        return valor;
    }

    // Getters
    public int getValor() {
        return this.valor;
    }

    public int getDie(){
        return this.dado;
    }

    // Setters
    public void setValor(int valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Valor cara: " + this.valor;
    }
}
