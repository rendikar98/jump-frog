
/**
 * Write a description of class Coin here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class Koin
{
    // instance variables - replace the example below with your own
    private int nilai;

    /**
     * Constructor for objects of class Coin
     */
    public Koin()
    {
        // initialise instance variables
        nilai = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Koin(int nilai)
    {
        // put your code here
        this.nilai = nilai;
        
    }
    
    public int getNilai()
    {
        return nilai;
    }
    
    public void setNilai (int nilaibaru)
    {
        this.nilai = nilaibaru;    
    }
}
