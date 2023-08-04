public class Jugador {
    int reinicia;
    String otraVez="";
    int suma;

    public Jugador(int reinicia, String otraVez, int suma){
        this.reinicia = reinicia;
        this.otraVez = otraVez;
        this.suma = suma;
    }

    //Getters 
    public int getReinicia(){
        return this.reinicia;
    }

    public String getOtraVez(){
        return this.otraVez;
    }

    public int getSuma(){
        return this.suma;
    }

    //Setters 
    public int setReinicia(){
        return this.reinicia; //++
    }

    public String setOtraVez(){
        return this.otraVez; //="No"
    }

    public int setSuma(){
        return this.suma;
    }

    // public void setSuma() throws Exception{
    //     try{
    //         this.suma++;
    //         }catch(Exception e){
    //             throw new Exception()};
    // }
    
    public String toString(){
        return "Puntaje: " + this.suma;
    }

    
}
