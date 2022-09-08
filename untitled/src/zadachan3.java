import java.util.Scanner;

public class zadachan3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        System.out.println("PROVERIM TVOE CHISLO BRO");
        int z = scanner.nextInt();
        if (z % 2 == 0) {
            System.out.println("chetnoe");
        }else {
            System.out.println("ne chetnoe");
        }

    }
    }
