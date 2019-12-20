/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio1;

/**
 *
 * @author Ingenieria
 */
public class ProyectoEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Uso del constructor vacio
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Solano");
        persona1.setEdad(45);
        persona1.setSexo("M");
        imprimirPersona(persona1);
        
        //uso del constructor con nombre
        Persona persona2 = new Persona("Carlos"); 
        persona2.setApellido("Gonzales");
        persona2.setEdad(22);
        persona2.setSexo("M");
        imprimirPersona(persona2);
        
        //uso del constructor con nombre y apellido
        Persona persona3 = new Persona("Luis","Sanabria" ); 
        persona3.setEdad(35);
        persona3.setSexo("M");
        imprimirPersona(persona3);
        
        //uso del constructor con nombre, apellido y edad
        Persona persona4 = new Persona("Katherine","Chavez", 22); 
        persona4.setSexo("F");
        imprimirPersona(persona4);
        
        //uso del constructor con nombre, apellido, edad y sexo
        Persona persona5 = new Persona("Mauren","Monge", 25, "F"); 
        imprimirPersona(persona5);
    }
    
    public static void imprimirPersona(Persona persona){
            System.out.print("El nombre de la persona es: ");
                    System.out.println(persona.getNombre());
                    System.out.print("El apellido de la persona es: ");
                    System.out.println(persona.getApellido());
                    System.out.print("El Sexo de la persona es: ");
                    System.out.println(persona.getSexo());
                    System.out.print("El edad de la persona es: ");
                    System.out.println(persona.getEdad());
                    System.out.println("***********************************");
    } 
}
