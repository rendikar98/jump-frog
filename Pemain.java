
@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class Pemain
{
    //deklarasi atribut
    private int nilai;
    private String nama;

    /**
     * Constructor untuk objek dari class Player
     */
    public Pemain(String nama)
    {
        // variable initial saat dibuat objek pemain
        this.nama = nama;
        this.nilai = 100;
    }

    /**
     * method accessor untuk nama dari pemain
     * @return nama dari pemain
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * method mutator untuk nama dari pemain
     * saat pemain ingin memulai permainan
     * @param namaBaru nama baru dari pemain
     */
    public void setNama(String namaBaru)
    {
        this.nama = namaBaru;
    }

    /**
     * method accessor untuk nilai dari pemain
     * @return nilai dari pemain
     */
    public int getNilai()
    {
        return nilai;
    }

    /**
     * method mutator untuk nilai dari pemain saat permainan
     * @param nilaiBaru nilai dari pemain yang baru
     */
    public void setNilai(int nilaiBaru)
    {
        this.nilai = nilaiBaru;
    }
}
