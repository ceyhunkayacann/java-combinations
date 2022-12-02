import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        int n,r,nr;
        int nFac = 1;
        int rFac = 1;
        int nrFac = 1;
        int combinations;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("İlk Sayıyı Giriniz : ");
            n = input.nextInt();

            System.out.print("İkinci Sayıyı Giriniz : ");
            r = input.nextInt();
            if(n<r) {
                System.out.println("Hatalı Giriş.");
            }
        }while (n<r);



        nr = n-r;

        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }

        for (int i = 1; i <= nr; i++){
            nrFac *= i;
        }

        combinations = nFac / (rFac * nrFac);


        String message = String.format("C(%s,%s) = %s",n,r,combinations);
        System.out.println(message);



    }
}