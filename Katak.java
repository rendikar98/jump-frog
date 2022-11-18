
@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class Katak
{
    //deklarasi atribut
    private int posisi;
    private int skor;

    /**
     * Constructor untuk objek dari class Frog
     */
    public Katak()
    {
        // variable initial saat buat objek katak
        this.posisi= 0;
        this.skor= 100;
    }

    /**
     * method accessor untuk posisi katak dari objek katak
     * @return posisi dari katak in current condition
     */
    public int getPosisi() 
    {
        // put your code here
        return posisi;
    }

    /**
     * method mutator untuk mengupdate posisi katak saat melompat
     * @param posisiBaru posisi katak setelah melompat
     */
    public void setPosisi(int posisiBaru) 
    {
        this.posisi = posisiBaru;
    }

    /**
     * method accessor untuk skor dari katak setelah melompat
     * @return skor dari katak
     */
    public int getSkor() 
    {
        return skor;
    }

    /**
     * method mutator untuk skor dari katak setelah melompat
     * @param skorBaru skor baru katak
     */
    public void setSkor(int skorBaru)
    {
        this.skor = skorBaru;
    }

    /**
     * method untuk katak melompat dekat (1 langkah)
     */
    public void loncatDekat()
    {
        posisi = this.getPosisi();
        posisi++;
    }

    /**
     * method untuk katak melompat jauh (2 langkah)
     */
    public void loncatJauh()
    {
        posisi = this.getPosisi();
        posisi+=2;
    }
}
