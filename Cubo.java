public class Cubo {
    public static void main(String[] args) 
    {
        Piezas cubo = new Piezas();
        cubo.iniciaPiezas();
        cubo.imprimePiezas();
        cubo.movHorizontal('U',0);
        cubo.movHorizontal('D',0);
        cubo.imprimePiezas();

        
    }
    
}
