import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Kasir kasir = new Kasir();
        System.out.println("====== Casher ======");
        System.out.print("Casher Name  : ");
        kasir.nama = input.nextLine();
        System.out.print("Chaser Phone Number : ");
        kasir.no_tlpn = input.nextInt();

        Customer Customer = new Customer();
        System.out.println("\n====== Customer ======");
        System.out.print("Your Name   : ");
        Customer.nama = in.nextLine();
        System.out.print("Your Addres : ");
        Customer.alamat= in.nextLine();
        System.out.print("Your ID     : ");
        Customer.id_customer = in.nextInt();
        System.out.print("Your Phone Number  : ");
        Customer.no_tlpn = in.nextInt();


        BufferedReader baca =new BufferedReader(new InputStreamReader(System.in));
        File file = new File("struk.txt");
        try {

            CuciSepatu CuciSepatu = new CuciSepatu();
            CuciSepatu.Pilihan();
            CuciSepatu.insertdata();

            Metode Metode = new Metode();
            Metode.Pilihan();
            Metode.insertdata();

            PrintWriter output = new PrintWriter(file);
            System.out.println("\n============ Casher ==============");
            System.out.println("Casher Name          : " + kasir.getNama());
            System.out.println("Casher Phone Number  : " + kasir.getNo_tlpn());
            System.out.println("==================================\n");

            System.out.println("==========DATA Kasir============");
            System.out.println("Casher Name          : " + Customer.getNama());
            System.out.println("Casher ID            : " + Customer.getId_customer());
            System.out.println("Casher Phone Number  : " + Customer.getNo_tlpn());
            System.out.println("Casher Addres        : " + Customer.getAlamat());
            System.out.println("==================================\n");

            System.out.println("================== STRUK =====================");
            System.out.println("Customer               : "+ Customer.getNama());
            System.out.println("Customer.ID            : "+ Customer.getId_customer());
            System.out.println("Customer Phone Number  : "+ Customer.getNo_tlpn());
            System.out.println("Customer Address       : "+ Customer.getAlamat());
            System.out.println("Price                  : "+CuciSepatu.jumlah);
            System.out.println("==============================================");
            System.out.println("============== <3 Thank You ==================");
            System.out.println("==============================================");

            output.println("=================== STRUK ====================");
            output.println("Customer               :  "+ Customer.getNama());
            output.println("Customer.ID            :  "+ Customer.getId_customer());
            output.println("Customer Phone Number  :  "+ Customer.getNo_tlpn());
            output.println("Customer Address       :  "+ Customer.getAlamat());
            output.println("Price                  :  "+CuciSepatu.jumlah);
            output.println("==============================================");
            output.println("================= Thank You ===================");
            output.println("==============================================");

            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak di temukan");
        }
    }
}
