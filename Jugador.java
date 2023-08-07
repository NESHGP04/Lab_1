//Laboratorio 1: Clases
//Marinés García 23391

public class Jugador {
    int reinicia;
    int suma; 
    int pts;
    
    public Jugador(int reinicia, int suma){
        this.reinicia = reinicia; 
        this.suma = suma;
        this.pts = 0;
    }
    
    public int pts(){
        this.pts++;
        return this.pts;
    }

    public int suma(){
        this.suma += pts;
        return this.suma;
    }

    public int puntaje(){ //score()
        return this.pts;
    }   
    
    public void reinicia(){
        this.pts = 0;
    }
     
    //Getters 
    public int getReinicia(){
        return this.reinicia;
    }

    public int getSuma(){
        return this.suma;
    }

    //Setters 
    public int setReinicia(int reinicia){
        return this.reinicia; //++
    }

    public int setSuma(int suma){
        return this.suma;
    }
    
    public String toString(){
        return "Puntaje: " + this.suma;
    } 

    public static int toInt(Object obj){
        int x = Integer.parseInt(obj.toString());
        return x;
    }
}
