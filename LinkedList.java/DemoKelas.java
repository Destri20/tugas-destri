public class DemoKelas {
    public static void main(String[] args) {
        Siswa destri = new Siswa("Destri");

        Kelas k = new Kelas(destri);

        Siswa devi = new Siswa("Devi");
        k.tambahDiBelakang(devi);
        k.tambahDiBelakang(new Siswa("Sarah"));
        k.tambahDiBelakang(new Siswa("Ari"));
        k.tambahDiBelakang(new Siswa("Indra"));
        k.tampilkanSemua();

        System.out.println("jumlah Siswa: " + k.jumlahSiswa());
        System.out.println("urutan Devi: " + k.urutan("Devi"));
        System.out.println("Siswa di index 2: " + k.ambilDi(2));

        k.hapus("Sarah");
        System.out.println("Setelah hapus Sarah:");
        k.tampilkanSemua();
        }
}