import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        
        //ciclo for
        //En este caso, siempre se conoce la cantidad de iteraciones o repeticiones.
        //1.Variable de control;expresion logica; actualizacion
        
        int n;
        do{
        System.out.println("Que tabal de multiplicar desea ver?");
        n=s.nextInt();
        }while(n<=0);

        for(int i=1;i<=10;i++){
            System.out.println(n+ " x " + i + " = " +n*i);
        }
        
     s.close();
    }
}
