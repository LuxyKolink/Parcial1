/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.upb.parkinglot;

import javax.swing.JOptionPane;
import parcial.upb.classes.Vehicle;
import parcial.upb.classes.Node;
import parcial.upb.classes.ParkingLot;
import parcial.upb.classes.Driver;
import parcial.upb.classes.DoubleCircularListADT;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DoubleCircularListADT list = new DoubleCircularListADT();
        
        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar \n3. Eliminar \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    String licensePlate = JOptionPane.showInputDialog("Digite la placa");
                    String brand = JOptionPane.showInputDialog("Digite la marca del carro");
                    Vehicle vehicle = new Vehicle(licensePlate,brand);
                    
                    //String cc = JOptionPane.showInputDialog("Digite el cilidraje");
                    //Car car = new Car( Integer.parseInt(cc) ,false);
                    
                    Node node = new Node(vehicle);
                    list.add(node);
                    break;
                case 2:
                    break;

                case 3:
                    break;
                case 4:
                    String vehicles = list.print();
                    JOptionPane.showMessageDialog(null, vehicles);
                    break;
            }

        } while (input != 0);
        
    }
    
}
