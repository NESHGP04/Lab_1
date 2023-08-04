public class Main {

    public static void main(String[] args){
        Jugador jugador1, jugador2;
        Dado valor1, valor2; //CAMBIAR


        jugador1 = new Jugador(0 , "Continuar?", 100);
        jugador2 = new Jugador(0 , "Continuar?", 100);

        // System.out.print("Es el turno de: " + jugador1);
        // System.out.print("Es el turno de: " + jugador2);

        public int Valor(){ //CAMBIAR
            int num = (int)(Math.random()*6)+1;
            System.out.println("El número es " + num);
        }

        boolean continuar=true;
        do{
            jugador1.Valor();
            jugador2.Valor();
            suma += valor1+valor2;
            if ((suma == 100)) {
                System.out.println("Ganaste!");
                break;
            } else if ((suma = 1)) {
                System.out.println("Perdiste!");
                break;}
            }while(continuar!=false);
                System.exit(0);
            }


}

        // public int Valor(){ //CAMBIAR
        //     int num = (int)(Math.random()*6)+1;
        //     System.out.println("El número es " + num);
        //     // if((num==1)){
        //     //     System.out.print("Haz sacado 1, se reinician tus puntos");
        //     // }else {System.out.print ("Continua jugando");
        //     //     }
        // }
