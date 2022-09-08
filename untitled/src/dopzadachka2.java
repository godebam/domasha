import java.util.Scanner;

public class dopzadachka2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner =new Scanner(System.in);
        System.out.println("col-vo mesyacev");
        int o =scanner.nextInt();
        System.out.println("col-vo deneg");
        float z = scanner.nextInt();
        for (int i =1; i<=o; i++){
        z +=z * 0.07;
        System.out.println(z);
        }
    }
}
