package gallinas;

/**
 *
 * @author Alvaro Merino
 */
public class Gallina extends Thread {
    String nombre;
    Casilla[][]corral;
    
    public Gallina(String nombre, Casilla[][]corral){
        this.nombre=nombre;
        this.corral=corral;
    }
    @Override
    public void run(){
        int muerte = 100;
        for(int i=0;i<10;i++){
            while(muerte>2 && i!=10){
                System.out.println(this.nombre+" ha puesto un huevo");
                int x = (int) (Math.random()*((2-0)+1))+0;
                int y = (int) (Math.random()*((2-0)+1))+0;
                muerte = (int) (Math.random()*((10-0)+1))+0;
               corral[x][y].ponerHuevo();
                
                try{
                    Thread.sleep(150);
                }catch( InterruptedException ex){
                    
                }
            }
        }
        if(muerte<=2){
            System.out.println(this.nombre+" ha muerto.");
        }
    }
    

    
}
