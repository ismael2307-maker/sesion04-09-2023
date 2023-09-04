import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);

        int n;

          System.out.println("¿Hasta que tabla de mutiplicar desea saber?");
          n=s.nextInt();
         do{
             System.out.println("Valor demasiado alto");
             System.out.println("¿Hasta que tabla de mutiplicar desea saber?");
             n=s.nextInt();
         }while(n<=0 || n>=50);

        for(int num1=1;num1<=n;num1++){
            for(int i=1;i<=10;i++){
                System.out.println(num1+ " x " + i + " = " +num1*i);
            }
            System.out.println("  ");
        }
        s.close();
    }
}
