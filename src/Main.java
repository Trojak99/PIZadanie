import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int points = 10000000;
        int inCircle = 0;
        double pi = 0;

        for(int i = 0; i < points; i++) {

            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            double distance = (x * x) + (y * y);

            if(distance <= 1)
                inCircle++;

        }

        pi = (double)inCircle / points * 4;
        System.out.println(pi);
    }
}
