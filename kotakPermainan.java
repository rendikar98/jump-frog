//import package yang akan dipakai disini
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class kotakPermainan
{
    //deklarasi atribut
    private int jumlahKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    //deklarasi array yang dipakai
    private Kotak[] boardGame;
    public int[] acakKoin;
    public int[] acakMonster; 

    /**
     * Constructor untuk objek dari class gameBoard
     */
    public kotakPermainan(int jumKoin, int jumKotak, int jumMonster)
    {
        // initialise instance variables
        jumlahKotak = jumKotak;
        jumlahKoin = jumKoin;
        jumlahMonster = jumMonster;
        generateAcak();
        inisialisasiKotak();
    }

    /**
     * method untuk menghasilkan index acak untuk posisi koin dan monster
     * yang akan dipakai nanti
     */
    private void generateAcak()
    {
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahMonster];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < jumlahKotak; i++) 
        {
            list.add(i);
                
        }
        Collections.shuffle(list);
        for (int i = 0; i < jumlahKoin; i++) 
        {
            acakKoin[i] = list.get(i);
        }
        Arrays.sort(acakKoin);
        for (int i = jumlahKoin; i < jumlahMonster+jumlahKoin; i++) 
        {
            acakMonster[i-jumlahKoin] = list.get(i);
        }
        Arrays.sort(acakMonster);
    }

    /**
     * method untuk inisialisasi membuat kotak permainan
     */
    private void inisialisasiKotak()
    {
        Koin coin = new Koin(25);
        Monster monsta = new Monster(-10, "buzzzzr");
        boardGame = new Kotak[jumlahKotak];
        for (int i = 0; i < jumlahKotak; i++) {
            boardGame[i] = new Kotak();
        }
       
        for (int i = 0; i < jumlahKoin; i++)
        {
            boardGame[acakKoin[i]].addKoin(coin);
        }

        for (int i = 0; i < jumlahMonster; i++) 
        {
            boardGame[acakMonster[i]].addMonster(monsta);    
        }
    }

    /**
     * method untuk mengecek isi di dalam kotak yang ada dalam kotak permainan
     * @param posisi posisi dari katak
     * @return identifier atau pengenal dari objek di dalam kotak (koin dan monster)
     */
    public int contain(int posisi)
    {
        int identifier;
        if (boardGame[posisi].isThereKoin()) 
        {
            boardGame[posisi].getKoin().getNilai();
            identifier = 1;    
        } 
        else if (boardGame[posisi].isThereMonster())
        {
            boardGame[posisi].getMonster().getNilai();
            identifier = -1;
        }
        else
        {
            return 0;
        }
        return identifier;
    }

    /**
     * method untuk mengembalikan jumlah kotak dalam kotak permainan
     * @return jumlah kotak
     */
    public int getJumKotak()
    {
        return jumlahKotak;
    }
}
