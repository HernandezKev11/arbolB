package estructuras.datos.tl;

import estructuras.datos.bl.ArbolB;

public class ArbolBController {

    private int t = 2;
    private ArbolB arb_ = new ArbolB(t);

    public void insertar(int dato){
        try {
            arb_.insertar(dato);
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

    }

    public void observarArbol(){
        try {
            arb_.showBTree();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

    }
}
