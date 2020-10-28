
package cr.ac.ucenfotec.bl.controlador;

import cr.ac.ucenfotec.bl.entidades.*;
import cr.ac.ucenfotec.bl.iu.IU;
import cr.ac.ucenfotec.bl.logica.Gestor;
import java.util.ArrayList;

public class Controlador {
    
    private final Gestor gestor = new Gestor();

    public void ejecutar() {
        boolean ward = true;
        while(ward){
            switch(IU.showMenu()){
                case 1:
                    IU.print("Ingrese la serie del motor");
                    String inputSerieMotor = IU.readString();
                    IU.print("Ingrese el numero de cilindros del motor");
                    String inputNumCilindros = IU.readString();
                    gestor.registrarMotor(inputSerieMotor, inputNumCilindros);
                    break;
                case 2:
                    gestor.listarMotores();
                    break;
                case 3:
                    IU.print("Ingrese la serie del vehiculo");
                    String inputSerieVehiculo = IU.readString();
                    IU.print("Ingrese la marca del vehiculo");
                    String inputMarca = IU.readString();

                    if (!gestor.getMotores().isEmpty()) {

                        
                        
                        IU.print("\nSi desea asociar un motor al vehiculo digite 1\n"
                                + "De lo contrario digite cualquier otra cosa.");
                        
                        if (IU.readInt() == 1) {
                            gestor.listarMotores();
                            IU.print("\nDigite el numero del motor:");
                            ArrayList<Motor> lista = gestor.getMotores();
                            int opcion = IU.readInt();
                            if (opcion > lista.size() || opcion <= 0) {
                                IU.print("Esa no es una opción válida.");
                            } else {
                                int choice = opcion -1;
                                gestor.registrarVehiculo(inputSerieVehiculo, inputMarca, lista.get(choice));
                            }
                        }
                        
                    } else{
                            gestor.registrarVehiculo(inputSerieVehiculo, inputMarca);
                        }
                    break;
                    case 4:
                        gestor.listarVehiculos();
                    break;
                default:
                    break;
            }
        }
    }

}
