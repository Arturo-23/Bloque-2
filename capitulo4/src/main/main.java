/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import capitulo4.Billing;
import capitulo4.BirdSighting;
import capitulo4.BloodType;
import capitulo4.Bread;
import capitulo4.FormLetterWriter;
import capitulo4.MathTest;
import capitulo4.NextMonth;
import javafx.scene.shape.Circle;

/**
 *
 * @author Arturo
 */
public class main {
    public static void main(String[] args){
        
    
System.out.println("\nEjercicio1");
FormLetterWriter fw = new FormLetterWriter();
        System.out.println(fw.displaySalutation("Sosa"));
        System.out.println(fw.displaySalutation("Sosa","Miguel"));

System.out.println("\nEjercicio 2");
        Billing b=new Billing();
        System.out.println(b.computeBill(10));
        System.out.println(b.computeBill(10,2));
        System.out.println(b.computeBill(10,2,3));

System.out.println("\nEjercicio3");
BirdSighting bird = new BirdSighting("Patos",4,6);
        BirdSighting2 bird2 = new BirdSighting2("Palomas",1,6);
        System.out.println(bird.imprimir());
        System.out.println(bird2.imprimir());

System.out.println("\nEjercicio 4");
        Paciente p=new Paciente(333,19, BloodType.A, Factor.POSITIVO);
        System.out.println(p.toString());

System.out.println("\nEjercicio5");
Bread bre1 = new Bread("Maiz",23.5f);
        Bread bre2 = new Bread("trigo",13.5f);
        Bread bre3 = new Bread("centeno",(43.5f);
        System.out.println(bre1);
        System.out.println(bre2);
        System.out.println(bre3);
Sandwich sandw1 = new Sandwich(bre1,sand); 
        Sandwich sandw2 = new Sandwich(bre2,sand2);
        Sandwich sandw3 = new Sandwich(bre3,sand3);
        System.out.println(sandw1.values());
        System.out.println(sandw2.values());
        System.out.println(sandw3.values());

System.out.println("\nEjercicio 6");
        Circle c=new Circle();
        System.out.println(c.Area());
        System.out.println(c.Diametro());

System.out.println("\nEjercicio7");
MathTest mat = new MathTest();
        System.out.println("Inciso a)");
        System.out.println(mat.a((double)37));
        System.out.println("Inciso b)");
        System.out.println(mat.b((double)300));
        System.out.println("Inciso c)");
        System.out.println(mat.cy((double)22.8));
        System.out.println("Inciso d)");
        System.out.println(mat.d('D', 71));
        System.out.println("Inciso e)");
        System.out.println(mat.e());

System.out.println("\nEjercicio 8");
        NextMonth nm=new NextMonth(10,9);
        nm.GregorianCalendar();

System.out.println("\nEjercicio9");
GregorianCalendar calen=new GregorianCalendar(13,"febrero",2019);

System.out.println("\nEjercicio 10");
        CertificateOfDeposit co=new CertificateOfDeposit(4523,"Ruiz", 1233,167197);
        System.out.println(co.TestCertificateOfDeposit());

System.out.println("\nEjercicio11");
State estado = new State("Oaxaca",424234,"Oaxaca",45673,"Istmo",74563);
        System.out.println(estado);
    
}
}

