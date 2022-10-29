
/**
 * Write a description of class Player here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class Pemain
{
    // instance variables
    private int nilai;
    private String nama;

    /**
     * Constructor for objects of class Player
     */
    public Pemain(String nama)
    {
        // initialise instance variables
        this.nama = nama;
        this.nilai = 100;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String namaBaru)
    {
        this.nama = namaBaru;
    }

    public int getNilai()
    {
        return nilai;
    }

    public void setNilai(int nilaiBaru)
    {
        this.nilai = nilaiBaru;
    }
}
