import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int ola=0;
        
        while(ola==0){

        System.out.println("Color del semaforo ");
        System.out.println("(1.-r/2.-a/3.-v)");
        char color=s.next().charAt(0);

        switch(color){
            case 'r' -> {
                System.out.println("Ha digitado el color rojo");
            }

             case 'a' -> {
                System.out.println("Ha digitado el color amarillo");
            }

             case 'v' -> {
                System.out.println("Ha digitado el color verde");
            }
           default ->{
            System.out.println("Se ha digitado una opcion no valida");

            }
           }
           System.out.println(" ");
        }
       s.close(); 
    }
}
