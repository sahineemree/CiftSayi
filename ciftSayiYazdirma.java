import java.util.Scanner;
public class ciftSayiYazdirma {
    public static void main(String[] args) {
       int number;
        Scanner input = new Scanner (System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        for (int i=0; i <= number ; i++ ) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}