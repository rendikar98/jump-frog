

public class test {
    public static void main(String[] args) 
    {
        kotakPermainan test = new kotakPermainan(100, 300, 50);
        // for (int i = 0; i < 50; i++) {
        //     System.out.print(test.acakKoin[i] + " ");
        // }
        // System.err.println("\n\n\n");
        // for (int index = 0; index < 30; index++) {
        //     System.out.print(test.acakMonster[index] + " ");
        // }
        int counter = 0;
        for (int i = 0; i < 300; i++) {
            
            System.out.print(test.contain(i) + " ");
            counter++;
        }
        System.out.println("\n\n");
        System.out.println(counter);

        // Random random = new Random();
        // int rand;

        // for(int i=0; i<10; i++){
        //     rand = random.nextInt(3);
        //     System.out.println(rand);
        // }

    }
    
}
