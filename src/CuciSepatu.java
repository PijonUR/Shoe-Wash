import java.util.Scanner;
public class CuciSepatu extends PesanSepatu{
    Scanner input = new Scanner(System.in);
    public int id;
    public int jmlPesanan;
    public int pilih;
    public int harga;
    public int jumlah;

    @Override
    public void insertdata() {
        System.out.print("\nORDER HERE : ");
        pilih = input.nextInt();
        if (pilih == 1){
            System.out.println("\nWASH");
            System.out.println("The List");
            System.out.println("1. Hard Shoe Wash");
            System.out.println("2. Soft Shoe Wash");
            System.out.print("\nSilahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 100000;
                    System.out.println("You Ordering Is Hard Shoe Was");
                    break;

                case 2:
                    harga = 50000;
                    System.out.println("You Ordering Is Soft Shoe Was");
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
