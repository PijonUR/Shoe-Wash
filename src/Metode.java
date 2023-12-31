import java.util.Scanner;

public class Metode extends PesanSepatu{
    Scanner input = new Scanner(System.in);
    public int id;
    public int jmlPesanan;
    public int pilih;
    public int harga;
    public int jumlah;

    @Override
    public void insertdata() {
        System.out.print("\nPick Your Choice : ");
        pilih = input.nextInt();
        if (pilih == 2){
            System.out.println("\nWASH");
            System.out.println("The List");
            System.out.println("1. Fast Shoe Wash");
            System.out.println("2. Standart Shoe Wash");
            System.out.print("\nSilahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 100000;
                    System.out.println("You Ordering Is Fast Shoe Was");
                    break;

                case 2:
                    harga = 50000;
                    System.out.println("You Ordering Is Standart Shoe Was");
                    break;

                default:
                    System.out.println("There Is No One Order,Please Back");

            }
            System.out.print("How Many Shoe : ");
            jmlPesanan = input.nextInt();
            jumlah = harga*jmlPesanan;
            System.out.println("Price : "+jumlah);
        }
    }
}
