import java.util.List;
public class tampilData {
        public static void showRekenings(List<Rekening18> rekenings) {
            System.out.println("Data Rekening:");
            for (Rekening18 rekening : rekenings) {
                System.out.println(rekening);
            }
        }
    
        public static void showTransaksis(List<Transaksi18> transaksis) {
            System.out.println("\nData Transaksi:");
            for (Transaksi18 transaksi : transaksis) {
                System.out.println(transaksi);
            }
        }
    
            
    }           
          

