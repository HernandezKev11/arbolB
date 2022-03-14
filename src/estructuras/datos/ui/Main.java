package estructuras.datos.ui;

import estructuras.datos.tl.ArbolBController;

import javax.swing.*;
import java.beans.XMLEncoder;
import java.util.Hashtable;

public class Main {

    private static ArbolBController gestor = new ArbolBController();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("");
        System.out.println("MENU");
        System.out.println("[1]- AGREGAR DATO");
        System.out.println("[2]- OBSERVAR ARBOL");
        int opc = Integer.parseInt(JOptionPane.showInputDialog("opcion"));
        procesarOpc(opc);

    }

    public static void procesarOpc(int opc){
        switch (opc){
            case 1:
                int dato = Integer.parseInt(JOptionPane.showInputDialog("DATO"));
                gestor.insertar(dato);
                break;
            case 2:
                System.out.println("**********************");
                System.out.println("**********************");
                gestor.observarArbol();

                break;
        }
        menu();
    }
}
