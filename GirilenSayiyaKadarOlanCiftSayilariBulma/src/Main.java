import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getData = new Scanner(System.in);   //Scanner Objemiz

        System.out.print("Please Enter a Number : ");

        int number = getData.nextInt();  // Kullanıcıdan Aldığımız Sayı Değeri

        int dividedby34sum = 0;  // 3 ve 4'e bölünebilen Sayıların Toplamı

        int dividedby34Count = 0;  // 3 ve 4'e bölünebilem Sayılarım Miktarı


        for (int i = 0 ; i <= number; i++){

            if (i % 3 == 0 && i % 4 == 0){  // 3 ve 4'e bölünebilirlik kontrolü

                System.out.println("The numbers can be divided 3 & 4 are : " + i);  // 3 ve 4'e bölünebilen Sayıların Çıktısı...

                dividedby34sum += i;

                dividedby34Count++;


            }

        }

        if (dividedby34Count > 0){   // Ortalama Hesap Kontrolü

            double average = (double) dividedby34sum / dividedby34Count;  // Ortalama Alma

            System.out.println("The Average is : " + average);


        }else{

            System.out.println("There is no number can be divided 3 and 4");

        }


    }

}
