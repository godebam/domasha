import java.util.Scanner;

public class zadachann8 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = 0;
        System.out.println("vvodi chislo ot +1 do lubogo bratishka!");
            for(int a=1; a<= x; a++ ) {
                p = p + a;
            }
            System.out.println(p);

    }
}
