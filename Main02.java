import java.util.Scanner; 
//import java.util.Random;

public class Main02 {
    static int opcion;

    public static void main(String[] args){

        //Menú de selección
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir) {
            System.out.println("\n1. Jugar contra un amigo\n.");
            System.out.println("2. Jugar solo.\n");
            System.out.println("3. Salir.\n");
            System.out.println("Escribe una de las opciones\n");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
                }   
        
        }
        
        // Crea jugadores
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        //Crea dados en Dado()
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        int dadoUno = dado1.Die();
        int dadoDos = dado2.Die();

        //Opción 1: dos jugadores
        if (opcion == 1){
            int jugadorActual = jugador1.reinicia;
            // int jugadorActual = jugador1.reinicia; 
            Jugador pts;
            //Jugador suma = pts.suma();
            int puntaje;

            while(true){
                sn.nextLine();
                System.out.println("\nLe toca al " + jugadorActual + ". Presiona ENTER para lanzar los dados...");
                sn.nextLine();

                int puntosTiro = dado1.getDie(); //Ver si sirve
                    System.out.println("Resultado: ");
                    // for (int punto: pts){
                    //     System.out.println(punto + " ");
                    // }
                    System.out.println();

                if (dadoUno == 1 && dadoDos == 1){
                    System.out.println("Uno de tus dados obtuvo puntaje de 1. Tus puntos se reinician.");
                    jugadorActual.reinicia();
                    //jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
                } else if(dadoUno <= 24 && dadoDos <= 24){
                    System.out.println("Total: " + puntaje);

                } else{
                    System.out.println("Valor inválido");
                }

            System.out.println();
            }       
        }
        
        //Opción 2: un jugador
        else if(opcion == 2){
            int totalPuntos = 0;
            while(totalPuntos < 100){
            System.out.println("Presiona ENTER para lanzar el dado");
            sn.nextLine();

            int resultadoDado = dado1.Die() + dado2.Die();
            totalPuntos += resultadoDado;
            System.out.println("El total de puntos es: " + resultadoDado);
            System.out.println("Total de puntos acumulados: " + totalPuntos);
            }

            System.out.println("Haz alcanzado los 100 puntos. Felicidades!");

            }

        //Opción 3: salir
        else if(opcion == 3){
            System.err.print("Ha salido del progrma");
            break;
        }
        else{
            System.out.println("Opción inválida, vuelva a intentar. ");
        }
        sn.close();
    }
    
    
}




