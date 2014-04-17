/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

import java.util.Scanner;

/**
 *
 * @author tchangou
 */
public class person {
    
    public  person()
    {
        System.out.println("Person wurde erstellt aber noch nicht initialisiert");
    }
    
    public void setUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Name eingeben :");
        this.name = sc.next();
        
        System.out.print("Bitte Alter eingeben :");
        this.alter = sc.nextInt();
        
        System.out.print("Bitte Adresse eingeben :");
        this.adresse = sc.next();
        
        System.out.print("Bitte Groesse eingeben :");
        try
        {
          this.groesse = sc.nextDouble();
        }
         catch(IndexOutOfBoundsException  e) 
         {
                     System.out.println("Fehler aufgetreten");
                     System.out.println("Ursache :"+e.getMessage());
         }
                 
        
        System.out.print("Bitte Raucher Status eingeben (J/N)");
        String eingabe ;
        eingabe = sc.next();
        switch(eingabe)
        {
            case "J":
                   this.raucher = true ;
            break;
                
            case "j":
                   this.raucher = true ;
            break;
            case "N":
                   this.raucher = false ;
            break;
            case "n":
                   this.raucher = false ;
            break;
            
            default:this.raucher = false ;
        }
    }
    
    public void print()
    {
        System.out.println("--------Ausgabe der Informationen ueber----------");
        System.out.println("--------Name : "+this.name);
        System.out.println("--------Alter : "+this.alter);
        System.out.println("--------Adresse :"+this.adresse);
        System.out.println("--------groesse :"+this.groesse);
        System.out.println("--------raucher :"+this.raucher);
        
    }        
    
    private String name ;
    private int alter ;
    private double groesse ;
    private String adresse ;
    private boolean raucher ;

   
    
}
