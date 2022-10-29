import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a description of class gameBoard here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class kotakPermainan
{
    // instance variables - replace the example below with your own
    private int jumlahKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private Kotak[] boardGame;
    public int[] acakKoin;
    public int[] acakMonster; 

    /**
     * Constructor for objects of class gameBoard
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

    private void generateAcak()
    {
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahMonster];
        // ArrayList<Integer> coinList = new ArrayList<Integer>();
        // for (int i = 0; i < 250; i++) 
        // {
        //     coinList.add(i);
        // }
        // int[] acakKoin = new int[coinList.size()];
        // Collections.shuffle(coinList);
        // for (int i = 0; i < 250; i++) 
        // {
        //     acakKoin[i] = coinList.get(i);
        // }

        // ArrayList<Integer> monsterList = new ArrayList<Integer>();
        // for (int i = 0; i < 100; i++) 
        // {
        //     monsterList.add(i);
        // }
        // int[] acakMonster = new int[monsterList.size()];
        // for (int i = 0; i < 100; i++) {
        //     acakMonster[i] = monsterList.get(i);
        // }
 
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

    public int contain(int posisi)
    {
        int identifier;
        // if (boardGame[posisi].isThereKoin()) 
        // {
        //     identifier = 1;
        // }else if (boardGame[posisi].isThereMonster())
        // {
        //     identifier = -1;
        // // }else if (boardGame[posisi].isThereKoin() && boardGame[posisi].isThereMonster()){
        // //     identifier = 2;
        // }else {
        //     identifier = 0;
        // }
        // return identifier;
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

    public int getJumKotak()
    {
        return jumlahKotak;
    }
}
