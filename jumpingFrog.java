import java.util.Random;
import java.util.Scanner;

/**
 * class untuk game katak melompat
 */
public class jumpingFrog{
    /**
     * deklarasi semua variabel yang akan dipakai
     */
    private static int[] board = new int[500];
    private static int difficulty;
    private static int frogPosition;
    private static int coinPosition;
    private static int coinValue = 20;
    private static int monsterPosition;
    private static int monsterDamage = 8;
    private static int step;
    private static int point = 100;
    private static String rating;
    
    /**
     * variabel untuk mendapatkan nilai acak
     */
    static Random rand = new Random();
    /**
     * Method katak saat melompat
     * mengubah posisi katak sesuai step yang dipilih
     * @param step
     */
    public static void jump(int step){
            if (step == 2) {
                frogPosition+=2;
            } else if (step == 1) {
                frogPosition++;
            } else if (step == 0) {
                System.out.println("katak harus bergerak");
            } else if (step == -1) {
                frogPosition--;
            } else if (step == -2) {
                frogPosition-=2;
            } else {
                System.out.println("katak tidak bisa melompat sejauh itu!");
            }
    }

    /**
     * menyebarkan coin dalam array board dengan cara acak
     * @param difficulty
     */
    public static void putCoin(int difficulty) {
        //jumlah maksimal koin
        int maxCoin;
        switch (difficulty) {
            //untuk kasus dengan kesulitan mudah (1)
            case 1:
                maxCoin = 300;
                for (int i = 0; i < maxCoin; i++) {
                    coinPosition = (int)rand.nextInt(board.length);
                    while (board[coinPosition] != 0) {
                            if (coinPosition == (board.length-1)) {
                                coinPosition = 1;
                                continue;
                            }
                        coinPosition++;
                    }
                    //2 adalah identifier untuk coin
                    board[coinPosition] = 2;
                }
                break;
            //untuk kasus dengan kesulitan sedang (2)
            case 2:
                maxCoin = 200;
                for (int i = 0; i < maxCoin; i++) {
                    coinPosition = (int)rand.nextInt(board.length);
                    while (board[coinPosition] != 0){
                            if (coinPosition == (board.length-1)) {
                                coinPosition = 1;
                                continue;
                            }
                        coinPosition++;
                    }
                    //2 adalah identifier untuk coin
                    board[coinPosition] = 2;
                }
                break;
            //untuk kasus dengan kesulitan susah (3)
            case 3:
                maxCoin = 150;
                for (int i = 0; i < maxCoin; i++) {
                    coinPosition = (int)rand.nextInt(board.length);
                    while (board[coinPosition] != 0){
                            if (coinPosition == (board.length-1)) {
                                coinPosition = 1;
                                continue;
                            }
                        coinPosition++;
                    }
                    //2 adalah identifier untuk coin
                    board[coinPosition] = 2;
                }
                break;
            default:
                System.out.println("input salah");
                break;
        }
    }

    /**
     * menyebarkan monster dalam array board dengan acak
     * @param difficulty
     */
    public static void putMonster(int difficulty){
        //jumlah maksimal monster
        int maxMonster;
        switch (difficulty) {
            //untuk kasus dengan kesusahan game mudah (1)
            case 1:
                maxMonster = 100;
                for (int i = 0; i < maxMonster; i++) {
                    monsterPosition = (int)rand.nextInt(board.length);
                    while (board[monsterPosition] != 0){
                            if (monsterPosition == (board.length-1)) {
                                monsterPosition = 1;
                                continue;
                            }
                        monsterPosition++;
                    }
                    //4 adalah identifier untuk monster
                    board[monsterPosition] = 4;
                }
                break;
            //untuk kasus dengan kesusahan game sedang (2)
            case 2:
                maxMonster = 150;
                for (int i = 0; i < maxMonster; i++) {
                    monsterPosition = (int)rand.nextInt(board.length);
                    while (board[monsterPosition] != 0){
                            if (monsterPosition == (board.length-1)) {
                                monsterPosition = 1;
                                continue;
                            }
                        monsterPosition++;
                    }
                    //4 adalah identifier untuk monster
                    board[monsterPosition] = 4;
                }
                break;
            //untuk kasus dengan kesusahan game susah (3)
            case 3:
                maxMonster = 250;
                for (int i = 0; i < maxMonster; i++) {
                    monsterPosition = (int)rand.nextInt(board.length);
                    while (board[monsterPosition] != 0){
                        {
                            if (monsterPosition == (board.length-1)) {
                                monsterPosition = 1;
                            }
                        }
                        monsterPosition++;
                    }
                    //4 adalah identifier untuk monster
                    board[monsterPosition] = 4;
                }
                break;
            default:
                System.out.println("input salah");
                break;
        }
    }

    /**
     * method untuk debugging game
     * dan memastikan board array sudah benar
     */
    public static void printBoard(){
        int counter = 0;
        for (int i = 0; i < (board.length/20); i++) {
            for (int j = 0; j < (board.length/25); j++) {
                System.out.print(board[counter]+"\t");
                counter++;
            }
            System.out.println("\n");
        }
    }

    /**
     * memberikan penilaian dengan poin
     * yang didapatkan oleh user
     * @param point
     * @return rating
     */
    public static String giveRating(int point){
        if (point > 1500) {
            return rating = "excellent";
        } else if (point >= 500 && point <= 1500){
            return rating = "good";
        } else {
            return rating = "bad";
        }
    }

    /**
     * untuk menampilkan menu pilihan kesusahan game
     */
    public static void diffMenu(){
        System.out.println("pilih kesusahan game: ");
        System.out.println("1 untuk mudah");
        System.out.println("2 untuk sedang");
        System.out.println("3 untuk susah");
        System.out.print("apa pilihan anda? ");
    }

    /**
     * untuk menampilkan menu saat katak melompat
     */
    public static void jumpMenu(){
        System.out.println("\n"+"ingin lompat berapa kali?");
    }

    /**
     * method main untuk menjalankan seluruh program game
     * @param args
     */
    public static void main(String[] args) {
        //deklarasi scanner untuk membaca input dari user
        Scanner in = new Scanner(System.in);
        diffMenu();
        difficulty = in.nextInt();
        //menaruh coin dan monster di dalam array board
        putCoin(difficulty);
        putMonster(difficulty);
        /*print array board untuk memastikan arraynya
        tidak kosong dan untuk debugging*/
        printBoard();
        while (frogPosition < board.length) {
            jumpMenu();
            step = in.nextInt();
            jump(step);
            if (frogPosition == 499 || frogPosition == 498) {
                break;
            }
            //untuk menghitung poin yang didapatkan saat bermain
            if (board[frogPosition] == 2) {
                point+=coinValue;
            } else if (board[frogPosition] == 4){
                point-=monsterDamage;
            }
            System.out.println("posisi sekarang: "+ frogPosition);
            System.out.println("point sekarang: "+point);
        }
        giveRating(point);
        System.out.println("\n"+ "your rating is: "+ rating);
        in.close();
    }
}
