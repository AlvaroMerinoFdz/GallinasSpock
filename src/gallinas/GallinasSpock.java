package gallinas;

/**
 *
 * @author Alvaro Merino
 */
public class GallinasSpock {
    public static void main(String[] args)thows InterruptedException {
        Casilla corral[][] = new Casilla[3][3];
        
        Gallina gal1=new Gallina("gallina1",corral);
        Gallina gal2=new Gallina("gallina2",corral);
        Gallina gal3=new Gallina("gallina3",corral);
        Gallina gal4=new Gallina("gallina4",corral);
        
        gal1.run();gal2.run();gal3.run();gal4.run();
        CuentaHuevos c = new CuentaHuevos(corral);
        c.run();
    }
    
}
