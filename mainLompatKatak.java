// import package yang dipakai disini
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@ClassPreamble(
    author = "Rendy",
    date = "18/11/2022",
    currentRevision = "3",
    lastModified = "30/10/2022",
    lastModifiedBy = "Rendy",
    reviewers = "Rendy"
)
public class mainLompatKatak
{
    // deklarasi atribut
    static private boolean play;
    // deklarasi scanner untuk input
    static Scanner input = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static Scanner Enter = new Scanner(System.in);
    // deklarasi objek
    static Pemain player;
    static Katak frog;

    /**
     * Constructor untuk objek dari mainLompatKatak
     */
    public mainLompatKatak()
    {
        // variable initial
        play = true;
    }

    /**
     * method untuk memulai game dengan mengubah atribut play
     */
    public void mainkan()
    {
        frog = new Katak();
        player = new Pemain(null);
        String jawab = input.nextLine();
        try 
        {
            if ("y".equalsIgnoreCase(jawab)) 
            {
                play = true;
            } else if ("n".equalsIgnoreCase(jawab))
            {
                play = false;
                System.exit(0);
            } else 
            {
                System.out.println("masukkan input sesuai pilihan\n");
            } 
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("input tidak valid.");
        }
    }

    /**
     * method untuk jika ingin melompat dan memberikan skor nya
     */
    public void lompat()
    {
        kotakPermainan board = new kotakPermainan(250, 400, 80);

        try {
            while (frog.getPosisi() <= board.getJumKotak()) {
                System.out.println("Posisi katak sekarang: " + frog.getPosisi() + '.');
                System.out.println("Skor sekarang : " + frog.getSkor());
                System.out.println("1. Loncat satu langkah\n2. Loncat dua langkah");
                System.out.println("Mau loncat sejauh? \n");
                int ans = input.nextInt();
                if (ans == 1) 
                {
                    frog.loncatDekat();    
                    System.out.println(" ");
                } 
                else if (ans == 2)
                {
                    frog.loncatJauh();
                    System.out.println(" ");
                }
                else
                {
                    System.out.println("tolong masukkan input yang sesuai.\n");
                    continue;
                }
                
                if (frog.getPosisi() == board.getJumKotak()) {
                    break;
                }
                
                if (board.contain(frog.getPosisi()) == 1) 
                {
                    frog.setSkor(frog.getSkor() + 25);    
                } else if (board.contain(frog.getPosisi()) == -1) 
                {
                    frog.setSkor(frog.getSkor() - 10);
                }

                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }  
        } catch (InputMismatchException e) {
            System.err.println("input tidak valid.");
        }
    }
    
    /**
     * function untuk clear screen saat game berjalan
     */
    static void clearScreen()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) 
            {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();    
            }else
            {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("ndak bisa clear screen :( ");
        }
    }
    
    /**
     * function untuk menerima karakter enter saat game berjalan
     */
    static void Enter()
    {
        Enter.nextLine();
    }

    /**
     * method main untuk menjalankan gamenya
     * @param args
     */
    public static void main(String args[])
    {
        mainLompatKatak jumpFrog = new mainLompatKatak();
        while (play)
        {
            System.out.println("======Ayo Katak, Lompat!======\n");
            System.out.println("mari bantu katak untuk menyelesaikan permainan ini");
            System.out.print("apakah anda ingin bermain? (Y/N)\n");
            jumpFrog.mainkan();
            clearScreen();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("masukkan nama anda untuk main game : ");
            String nama = input.nextLine();
            player.setNama(nama);
            System.out.println("\n" + player.getNama()+", mari mulai permainan!");
            
            System.out.println("\n\n\nPRESS ENTER");
            Enter();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            clearScreen();
            System.out.println("PRESS ENTER");
            Enter();

            jumpFrog.lompat();

            int skorAkhir = frog.getSkor();
            player.setNilai(skorAkhir);
            System.out.println("Selamat kamu telah menyelesaikan gamenya " + player.getNama() + ", poin yang kamu dapatkan sebesar " + player.getNilai());
            
            try {
                System.out.println("mau main lagi ga?(y/n)");
                String answer = in.nextLine();
                if ("y".equalsIgnoreCase(answer)) 
                {
                    play = true;    
                }
                else if ("n".equalsIgnoreCase(answer))
                {
                    System.exit(0);
                }
                else
                {
                    System.out.println("masukkan input sesuai pilihan");
                }
            } catch (InputMismatchException e) {
                System.out.println("input tidak valid.");
            }
        } 
        Enter.close();
    }

}
