public class rekeningmain18 {
      Rekening18 listRek[];
        int idx;
    public rekeningmain18(int jumRek) {
            listRek = new Rekening18[listRek];
            idx = 0;
        }
    void tambah (Rekening18 m ){
        if (idx < listRek.length){
            listRek[idx] = m;
            idx ++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for  (Rekening18 m :listRek){
            m.tampil();
            System.out.println("======================");
        }
    }

    public void sortByName() {
        for (int i = 0; i < listRek.length - 1; i++) {
            for (int j = 0; j < listRek.length - i - 1; j++) {
                if (listRek[j].nama.compareToIgnoreCase(listRek[j + 1].nama) > 0) {
                    // Tukar posisi
                    Rekening18 temp = listRek[j];
                    listRek[j] = listRek[j + 1];
                    listRek[j + 1] = temp;
                }
            }
        }
    }
   
   
    public void Tampildata ( String x, int pos){
        if (pos!= -1){
            System.out.println("No Rekening = " +listRek[pos].noRekening);
            System.out.println("nama "+ listRek[pos].nama);
            System.out.println("nama Ibu = " + listRek[pos].namaIbu);
            System.out.println("Phone  = " +listRek[pos]. Phone);
            System.out.println("Email = " + listRek[pos].Email);

        }else {
            System.out.println("data" + x + "tidak ditemukan");
        }
    }


}


