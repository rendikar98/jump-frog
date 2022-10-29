
/**
 * Write a description of class Frog here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class Katak
{
    // instance variables - replace the example below with your own
    private int posisi;
    private int skor;

    /**
     * Constructor for objects of class Frog
     */
    public Katak()
    {
        // initialise instance variables
        this.posisi= 0;
        this.skor= 100;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getPosisi() 
    {
        // put your code here
        return posisi;
    }

    public void setPosisi(int posisiBaru) 
    {
        this.posisi = posisiBaru;
    }

    public int getSkor() 
    {
        return skor;
    }

    public void setSkor(int skorBaru)
    {
        this.skor = skorBaru;
    }

    public void loncatDekat()
    {
        posisi = this.getPosisi();
        posisi++;
    }

    public void loncatJauh()
    {
        posisi = this.getPosisi();
        posisi+=2;
    }
}
