//Laboratorio 1: Clases
//Marinés García 23391

public class Dado{
    int valor;


    public Dado(int valor){
        //this.valor=valor;

        valor = (int)(Math.random()*6)+1;
        System.out.println("El número es " + valor);
        if((valor==1)){ //REVISAR SI ACA O EN OTRO
            System.out.print("Haz sacado 1, se reinician tus puntos");
         }else {System.out.print ("Continua jugando");
        }
    }


    //Getters
    public int getValor(){
        return this.valor;
    }

    //Setters
    public void setValor(int valor){
        this.valor=valor;
    }

    public String toString(){
        return "Valor cara" + this.valor;
    }
}