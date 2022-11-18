
@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class Monster implements gameObstacles
{
    // deklarasi atribut koin
    private int nilai;
    private String nama;

    /**
     * Constructor untuk objek yang dibuat class Monster
     */
    public Monster()
    {
        // variabel initial dari koin saat dibuat objek monster
        nama = "A";
        nilai = -25;
    }
    //constructor yang ini akan dipanggil saat membuat objek monster
    //dengan mengisi parameter nilai dan nama
    public Monster(int nilai, String nama){
        this.nama = nama;
        this.nilai = nilai;
    }

    /**
     * method accessor untuk nilai dari class monster
     * @return nilai dari monster
     */
    @Override
    public int getNilai()
    {
        return nilai;
    }

    /**
     * method  mutator untuk mengubah nilai dari monster
     * @param nilai nilai baru dari monster
     */
    @Override
    public void setNilai(int nilaiBaru)
    {
        this.nilai = nilaiBaru;
    }

    /**
     * method accessor untuk nama dari class monster
     * @return nama dari monster
     */
    public String getNama()
    {
        return nama;
    }
}
