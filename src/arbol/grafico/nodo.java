/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.grafico;

/**
 *
 * @author Bloque K
 */
class nodo {
    
    
     int dato;
    nodo lLink, rLink;
    
    
     nodo(int Elem) {
        dato = Elem;
         lLink=null; rLink = null;
    }
     
     nodo() {
         lLink=null; rLink = null;
    }
     
       public void insertar(int Elem) {
        if (Elem < dato) {
            if (lLink == null) {
                lLink = new nodo(Elem);
            } else {
                lLink.insertar(Elem);
            }
        } else {
            if (Elem > dato) {
                if (rLink == null) {
                    rLink = new nodo(Elem);
                } else {
                    rLink.insertar(Elem);
                }
            } else {
                System.out.print("Nodo ya existe ");
            }
        }
    }
}
