import java.util.Scanner;

class UTS_Algoritma {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilih;
        System.out.println("score nlai;:");
        System.out.println("nilai >=90 ");
        System.out.println("nilai >=80 dan ip <90");
        System.out.println("nilai >=60 dan ip <80");
        System.out.println("nilai >=40 dan ip <60");
        System.out.println("nilai <40 ");
        System.out.println("masukan jumlah nilai anda:");
        pilih = masuk.nextInt();
        if (pilih == 1)
            System.out.println("baik sekali");
        else if (pilih == 2)
            System.out.println("baik");
        else if (pilih == 3)
            System.out.println("cukup");
        else if (pilih == 4)
            System.out.println("kurang");
        else if (pilih == 5)
            System.out.println("tidak lulus");
        for (int i = 1; i > 0; i--) {
            for (int j = 1; j > 0; j++) {
                System.out.println("apakah nilai anda sesuai ?");
                System.out.println("1. ya");
                System.out.println("2. remedial = +9");
                System.out.println("pilih:");
                pilih = masuk.nextInt();
                if (pilih == 1)
                    System.out.println("selamat anda lulus");
                else if (pilih == 2)
                    System.out.println("masukan jumlah nilai anda: ");
                pilih = masuk.nextInt();
                if (pilih == 1)
                    System.out.println("baik sekali");
                else if (pilih == 2)
                    System.out.println("baik");
                else if (pilih == 3)
                    System.out.println("cukup");
                else if (pilih == 4)
                    System.out.println("kurang");
                else if (pilih == 5)
                    System.out.println("tidak lulus");

            }
        }
    }
}