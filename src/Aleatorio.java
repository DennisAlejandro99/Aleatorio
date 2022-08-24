
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEJANDRO
 */
class Aleatorio {
    private Scanner linea= new Scanner(System.in);
    public Aleatorio(){}
    
    public void aleatorio(){
        int a;
        do {
            int alea= (int)Math.floor(Math.random()*(2-0)+0);// max-min+min al invertir sale lo mismo  y si pones del 10 al 5 , te va ha salir x<10 y x>=5
            System.out.println("el numero es: "+alea+"\npresione 1 para continuar");
             a= linea.nextInt();
        } while (a==1); 
        
    }
    public void noRepetir(){////3 4 5 / 6 
                int [] numeros= new int[5];
                numeros[0]=4;
                for (int i = 1; i < 5; i++) {//aqui la cantidad tiene que se menor o igual al random
                     numeros[i]=(int)Math.floor(Math.random()*(10-2)+2);
                    for (int j = 0; j < i; j++)if (numeros[i]==numeros[j]) i--;
        }
                for (int i = 0; i < 5; i++) System.out.println("["+(i+1)+"] --> "+numeros[i]);
    }
    public void noRepetirIngresado(){
                
               for (int i = 0; i < 10; i++) {
                   
            
        }
    
    
    
    }
    
    }

