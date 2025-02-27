/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
public class ProyectoSignodelzodiaco {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Ingresa el dia de tu nacimiento (1-31): ");
            int dia = scanner.nextInt();
            
            System.out.print("Ingresa el mes de tu nacimiento (1-12): ");
            int mes = scanner.nextInt();
            
            
            String signo = determinarSignoZodiacal(dia, mes);
            
            
            if (signo != null) {
                System.out.println("Tu signo zodiacal es: " + signo);
            } else {
                System.out.println("Fecha no válida.");
            }
        }
    }

    public static String determinarSignoZodiacal(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else {
            return null; 
        }
    }
}