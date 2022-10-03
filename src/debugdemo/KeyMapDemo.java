package debugdemo;

import java.util.Random;

public class KeyMapDemo {
    public static void printDemo(){
        System.out.println("true = " + true);
    }

    public static void tryDemo(){
        try {
            System.out.println("Hello from developer");
            while (true) {
                if (new Random().nextInt() /2 == 0) {
                    break;
                }
                System.out.println("continue");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            throw new IllegalArgumentException();
        }
    }
}
