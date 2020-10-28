package cr.ac.ucenfotec.bl.logica;

import cr.ac.ucenfotec.bl.entidades.*;
import java.util.ArrayList;

public class Gestor {

    private final ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private final ArrayList<Motor> motores = new ArrayList<>();

    public Gestor() {
        
    }

    public void registrarVehiculo(String serie, String marca, Motor motor) {
        if (getVehiculos().contains(new Vehiculo(serie, marca, motor))) {

            System.out.println("\nRegistro fallido. El vehiculo ya existe!");
        } else {
            getVehiculos().add(new Vehiculo(serie, marca,motor));
            System.out.println("\nEl vehículo serie " + serie + " ha sido registrado con éxito");
        }
    }
    
    public void registrarVehiculo(String serie, String marca) {
        if (getVehiculos().contains(new Vehiculo(serie, marca))) {

            System.out.println("\nRegistro fallido. El vehiculo ya existe!");
        } else {
            getVehiculos().add(new Vehiculo(serie, marca));
            System.out.println("\nEl vehículo serie " + serie + " ha sido registrado con éxito");
        }
    }

    public void registrarMotor(String serie, String cilindros) {
        if (getMotores().contains(new Motor(serie, cilindros))) {

            System.out.println("\nRegistro fallido. El motor  ya existe!");
        } else {
            getMotores().add(new Motor(serie, cilindros));
            System.out.println("\nEl motor serie " + serie + " ha sido registrado con éxito");
        }
    }

    public void listarVehiculos() {
        int contador = 1;
        System.out.println("Lista de vehiculos:\n");
        for (Vehiculo vehiculo : getVehiculos()) {
            System.out.println(contador + "-" + vehiculo.toString());
            contador++;
        }
    }

    public void listarMotores() {
        int contador = 1;
        System.out.println("Lista de vehiculos:\n");
        for (Motor motor : getMotores()) {
            System.out.println(contador + "-" + motor.toString());
            contador++;
        }
    }

    /**
     * @return the vehiculos
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public static void asignarMotor(Motor motor, Vehiculo vehiculo){
        vehiculo.setMotor(motor);
    }

    /**
     * @return the motores
     */
    public ArrayList<Motor> getMotores() {
        return motores;
    }

}
