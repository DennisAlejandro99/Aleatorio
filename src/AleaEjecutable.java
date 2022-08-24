
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class AleaEjecutable {

    static Scanner linea= new Scanner(System.in);
    public static void main(String[] args) {
        int  a=0,i;
        Aleatorio ob= new  Aleatorio();
        Random aleatorio= new Random();
        do {
            System.out.println("::Aleatorio::");
            System.out.println("::[1] numeros aleatorios ");
            System.out.println("::[2] numeros aleatorios sin repetir ");
            System.out.println("::[3] numeros aleatorios ingresados sin repetir");
            System.out.println("::[4]");
            a= linea.nextInt();
            switch(a){
                case 1:   ob.aleatorio(); break;
                case 2:   ob.noRepetir(); break;
                case 3:                   break;
                case 0:                   break;
            }
        } while (a!=0);

        
        
        //if (a==3) a=4; a=5; // el if guarda una sola operacion luego de su resultado.
//         int sexo= aleatorio.nextInt(1-0+1)+0;
//         System.out.println("sexo: "+sexo);
           
       
//        for ( i = 0; i < 10; i++) if(a==0) 
//            System.out.println("aqui el a: "+(a+1)); a=3;
//            
//        
//        
//        System.out.println("imprime a : "+a);
//        System.out.println("imprime i : "+i);
        
        
        /*int s=0;
        do{
        Scanner r = new Scanner(System.in);
        Random aleatorio = new Random();
        int alea= aleatorio.nextInt(1-0+1)+0;
        System.out.println(" ingresa valor para a: "+alea);
        s=  r.nextInt();
    } while(  s==2); */
    }
   public static String  regresar(int c){
       if (c>0) {
           return  "sale de todo y te manda esto";
       }
   return "";
   }
}
