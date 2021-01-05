package gallinas;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Alvaro Merino
 */
public class Casilla {
    private int huevos;
    private Semaphore sem;
   
    
    public Casilla(){
        this.huevos=0;
        sem = new Semaphore(1);
    }
    public int getHuevo(){
        return huevos;
    }

    void ponerHuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
