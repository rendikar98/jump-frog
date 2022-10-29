
/**
 * Write a description of class Monster here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class Monster
{
    // instance variables - replace the example below with your own
    private int nilai;
    private String nama;

    /**
     * Constructor for objects of class Monster
     */
    public Monster()
    {
        // initialise instance variables
        nama = "A";
        nilai = -25;
    }

    public Monster(int nilai, String nama){
        this.nama = nama;
        this.nilai=nilai;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNilai()
    {
        // put your code here
        return nilai;
    }

    public void setNilai(int nilai)
    {
        this.nilai = nilai;
    }

    public String getNama()
    {
        return nama;
    }
}
