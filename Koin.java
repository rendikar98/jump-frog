
@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class Koin implements gameObstacles
{
    //deklarasi atribut koin
    private int nilai;

    /**
     * Constructor untuk object dari class Coin
     */
    public Koin()
    {
        // variabel initial dari koin saat dibuat objek koin
        nilai = 0;
    }

    //constructor yang ini akan dipanggil saat membuat objek koin
    //dengan mengisi parameter nilai
    public Koin(int nilai)
    {
        // put your code here
        this.nilai = nilai;
        
    }
    
    /**
     * method accessor untuk nilai dari koin
     * @return nilai dari koin
     */
    @Override
    public int getNilai()
    {
        return nilai;
    }
    
    /**
     * method mutator untuk nilai dari koin
     * @param nilaibaru nilai baru yang di set pada objek koin
     */
    @Override
    public void setNilai (int nilaiBaru)
    {
        this.nilai = nilaiBaru;    
    }

}
