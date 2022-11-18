
@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class Kotak
{
    //deklarasi atribut
    private Koin coin;
    private Monster monsta;
    //variable untuk saat pengecekkan isi kotak
    private boolean cstate;
    private boolean mstate;

    /**
     * Constructor untuk objek dari class Board
     */
    public Kotak()
    {
        // initialise instance variables
       coin = null;
       monsta = null;
    }

    /**
     * method untuk menambahkan koin ke dalam kotak
     * @param c objek coin
     */
    public void addKoin(Koin c)
    {
        coin = c;
    }

    /**
     * method untuk menambahkan monster ke dalam kotak
     * @param m objek monster
     */
    public void addMonster(Monster m)
    {
        monsta = m;
    }

    /**
     * method accessor koin yang didalam kotak
     * @return objek coin
     */
    public Koin getKoin()
    {
        return coin;
    }

    /**
     * method accessor monster yang ada didalam kotak
     * @return objek monster
     */
    public Monster getMonster()
    {
        return monsta;
    }
    
    /**
     * method untuk cek apakah ada coin di dalam kotak
     * @return cstate yang menyatakan state keberadaan koin di dalam kotak
     */
    public boolean isThereKoin()
    {
        
        if (coin == null) 
        {
            cstate = false;
        } else
        {
            cstate = true;
        }
        return cstate;
    }

    /**
     * method untuk cek apakah ada monster di dalam kotak
     * @return mstate yang menyatakan state keberadaan monster di dalam kotak
     */
    public boolean isThereMonster()
    {
        if (monsta == null)
        {
            mstate = false;
        } else
        {
            mstate = true;
        }
        return mstate;
    }
}
