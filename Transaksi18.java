public class Transaksi18 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    Transaksi18 (double a, double b, double c, String d){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi =  d;
        
        }

        public String toString() {
            return "Saldo Awal = " + saldoAwal + ", Saldo Akhir = " + saldoAkhir + ", Tanggal Transaksi = " + tanggalTransaksi ;
        }
}
