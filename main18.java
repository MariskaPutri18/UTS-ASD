import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char pilih;
        List<Rekening18> rekenings = new ArrayList<>();
        List<Transaksi18> transaksis = new ArrayList<>();

        rekenings.add(new Rekening18("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"));
        rekenings.add(new Rekening18("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        rekenings.add(new Rekening18("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"));
        rekenings.add(new Rekening18("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"));
        rekenings.add(new Rekening18("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));
        
        transaksis.add(new Transaksi18(898214, 494048, 3587, "2021-03-09 07:54:42"));
        transaksis.add(new Transaksi18(205420, 200162, 775880, "2021-06-25 10:23:00"));
        transaksis.add(new Transaksi18(838632, 350929, 328316, "2021-09-18 23:00:04"));
        transaksis.add(new Transaksi18(230659, 204434, 690503, "2022-02-02 19:10:34"));
        transaksis.add(new Transaksi18(770592, 334245, 444267, "2020-08-11 13:36:56"));
        
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. tampil data rekening ");
            System.out.println("2. tampil data transaksi");
            System.out.println("3. mencari saldo > 50000");
            System.out.println("4. sorting by name");
            System.out.println("5. keluar");
            System.out.print("Pilih operasi (1/2/3/4): ");
            int operasi = sc.nextInt();
            sc.nextLine();
            switch (operasi) {
                case 1:
                tampilData.showRekenings(rekenings);
                    break;
                case 2:
                tampilData.showTransaksis(transaksis);   
                    break;
                case 3:
                 
                    break;
                case 4:
                  
                    break;
                case 5:
                System.out.println("\n*****************************************");
                System.out.println("*      Terima kasih telah menggunakan     *");
                System.out.println("\n*****************************************");
                System.exit(0);
                    break;
                default:
                    System.out.println("Operasi tidak ada");
            }
           
        }
    }
}
