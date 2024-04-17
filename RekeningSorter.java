public class RekeningSorter {
    public static void sortByName(Rekening18[] listRek) {
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
}
