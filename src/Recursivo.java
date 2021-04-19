
/**
 *
 * @author Sterb
 */
public class Recursivo {
    
   public static int Nautilus(int x, int y)
{
 if (y==0)
     return 1;
 else
     return x*(Nautilus(x,y-1));
}
}
