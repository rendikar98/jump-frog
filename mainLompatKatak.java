import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a description of class mainLompatKatak here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class mainLompatKatak
{
    // instance variables - replace the example below with your own
    static private boolean play;
    static Scanner input = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static Pemain player;
    static Katak frog;

    /**
     * Constructor for objects of class mainLompatKatak
     */
    public mainLompatKatak()
    {
        // initialise instance variables
        play = true;
    }

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

    public void lompat()
    {
        kotakPermainan board = new kotakPermainan(150, 250, 60);

        try {
            while (frog.getPosisi() <= board.getJumKotak()) {
                System.out.println("Posisi katak sekarang: " + frog.getPosisi() + '.');
                System.out.println("1. Loncat satu langkah\n2. Loncat dua langkah");
                System.out.println("Mau loncat sejauh? ");
                int ans = input.nextInt();
                if (ans == 1) 
                {
                    frog.loncatDekat();    
                } 
                else if (ans == 2)
                {
                    frog.loncatJauh();
                }
                else
                {
                    System.out.println("tolong masukkan input yang sesuai.");
                }
                clearScreen();
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
            }  
        } catch (InputMismatchException e) {
            System.out.println("input tidak valid.");
        }

    }
    
    
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
    
    static void Enter()
    {
        Scanner Enter = new Scanner(System.in);
        Enter.nextLine();
    }

    public static void main(String args[])
    {
        mainLompatKatak jumpFrog = new mainLompatKatak();
        while (play)
        {
            System.out.print("apakah anda ingin bermain? (Y/N)");
            jumpFrog.mainkan();
            System.out.println("masukkan nama anda untuk main game : ");
            String nama = input.nextLine();
            player.setNama(nama);
            System.out.println(player.getNama()+", mari mulai permainan!");
            
            Enter();
            clearScreen();
            Enter();

            jumpFrog.lompat();

            int skorAkhir = frog.getSkor();
            player.setNilai(skorAkhir);
            System.out.println("Selamat kamu telah menyelesaikan gamenya " + player.getNama() + ", poinmu sebesar " + player.getNilai());
            
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
    }

}
