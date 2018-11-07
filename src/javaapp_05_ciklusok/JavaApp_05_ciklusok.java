/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_05_ciklusok;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_05_ciklusok {

   
    public static void main(String[] args) {
      //9es feladat
      //0-1000 közöt 5 és 3al egyaránt oszthatóak
      /*  haromalESOttelOszthatoTSzamok(1000);
        bonyolultfeladat();*/
      //  poitivParatlanSzamokOszege(234);
        int penz =45621;
        System.out.println(penz+"Ft\n\n");
            penzFelosztas(45621);
        
      
    }
    public static void haromalESOttelOszthatoTSzamok(int szam){
    
        for (int i = 0; i <= szam; i++) {
            if (i % 3 ==0&& i%5==0) {
                System.out.println(i +",");
            }
        }
    }
    public static void bonyolultfeladat(){
        Scanner sc = new Scanner(System.in);
        
        int parosDb = 0;
        int paratlanDb = 0;
        int a,b;
        
        int osszeg=0;
        int szam;
        do {
            System.out.println("Kérem adjon meg egy számot: "); 
            szam= sc.nextInt();
            osszeg +=szam;
            if(szam % 2==0){
            parosDb++;
            }else{
            paratlanDb++;
            }
        }while(osszeg<100);
        System.out.println("Páros számok: "+parosDb+" db");
        System.out.println("Páratlan számok: "+paratlanDb+" db");
        System.out.println("Összeg: "+osszeg+" db");
}
    public static void poitivParatlanSzamokOszege(int n){
       int osszeg=0;
       int i =1;
        do {
            System.out.println(osszeg);
            osszeg+=i;
            i+=2;
        } while (osszeg<n);
        
    } 
    public static void penzFelosztas(int penz){
    int[] feszkoz= {20000,10000,5000,2000,1000,500,200,100,50,20,10,5};
    
    int kerekitoErtek = (int)(Math.round(penz/5.0)*5);
        System.out.println(kerekitoErtek);
        int i=0;
        do {
            int db =kerekitoErtek/feszkoz[i];
            if (db >0) {
                System.out.println(feszkoz[i]+"Ft: "+db+" db");
            }
            kerekitoErtek%=feszkoz[i];
            i++;
        } while (kerekitoErtek>0);
        
    }
    
    
}

