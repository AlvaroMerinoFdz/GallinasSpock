package gallinas;

/**
 *
 * @author Alvaro Merino
 */
public class CuentaHuevos extends Thread {
    Casilla corral[][];
    public CuentaHuevos(Casilla[][]corral){
        this.corral = corral;
    }
    @Override 
    public void run(){
        for(int i=0;i<this.corral.length;i++){
            for(int j=0;j<this.corral[i].length;j++){
                System.out.println(corral[j][i].getHuevo()+" huevos encontrados en la posición ["+j+"]["+i+"]");
            }
        }
    }
    
    
    
}
