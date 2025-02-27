
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SignoZodiacalYHoroscopo {

	public static void main(String[] args) throws IOException {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
                int dia, mes;
                System.out.print("Ingresa el valor de dia: ");
                dia = Integer.parseInt(in.readLine());
                System.out.print("Ingresa el valor de mes: ");
                mes = Integer.parseInt(in.readLine());
                if((dia>=21&&mes==3)||(dia<=20&&mes==4))
                {
                    System.out.println("Signo: Aries");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=24&&mes==9)||(dia<=23&&mes==10))
                {
                    System.out.println("Signo: Libra");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=21&&mes==4)||(dia<=21&&mes==5))
                {
                    System.out.println("Signo: Tauro");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=24&&mes==10)||(dia<=22&&mes==11))
                {
                    System.out.println("Signo: Escorpio");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=22&&mes==5)||(dia<=21&&mes==6))
                {
                    System.out.println("Signo: Geminis");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=23&&mes==11)||(dia<=21&&mes==12))
                {
                    System.out.println("Signo: Sagitario");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=21&&mes==6)||(dia<=23&&mes==7))
                {
                    System.out.println("Signo: Cancer");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=22&&mes==12)||(dia<=20&&mes==1))
                {
                    System.out.println("Signo: Capricornio");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=24&&mes==7)||(dia<=23&&mes==8))
                {
                    System.out.println("Signo: Leo");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=21&&mes==1)||(dia<=19&&mes==2))
                {
                    System.out.println("Signo: Acuario");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=24&&mes==8)||(dia<=23&&mes==9))
                {
                    System.out.println("Signo: Virgo");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
                if((dia>=20&&mes==2)||(dia<=20&&mes==3))
                {
                    System.out.println("Signo: Piscis");
                    System.out.println("Hor\u00F3scopo: Escribe el hor\u00F3scopo aqu\u00ED.");
                }
            }
	}

}
