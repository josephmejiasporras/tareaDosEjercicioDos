
package cr.ac.ucenfotec.bl.iu;

import java.util.Scanner;

public class IU {
    
    private static final Scanner input = new Scanner(System.in);
    
    public static int showMenu() {
        
            System.out.println("\n***Menu***\n"
                    + "Eliga 1 para registrar un motor\n"
                    + "Eliga 2 para listar los motores\n"
                    + "Eliga 3 para registrar un vehiculo\n"
                    + "Eliga 4 para listar los vehiculos\n"
                    + "Eliga 5 para salir\n");
            try{
                return Integer.parseInt(readString());
            }catch(NumberFormatException ex){
                return 4;
            }
            
    }
    
    public static void print (String toPrint){
        System.out.println(toPrint);
    }
    
    public static String readString(){
        return input.nextLine();
    }
    
    public static int readInt(){
        try{
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex){
            return -1;
        }
    }
    
    public void imprimir(String toPrint){
        System.out.println(toPrint);
    }
    
}
