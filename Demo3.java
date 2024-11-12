// File: Demo.java
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        // Instantiating objects
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // Heterogeneous collection
        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());

        // Displaying information from the collection
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.displayInfo();
            System.out.println();
        }

        // Demonstrating upcasting and downcasting
        Pegawai pegawai1 = dosen1;  // Upcasting
        pegawai1.displayInfo();  // Calls overridden method in Dosen

        // Downcasting
        if (pegawai1 instanceof Dosen) {
            Dosen newDosen = (Dosen) pegawai1;  // Downcasting to Dosen
            System.out.println(newDosen.nama);
            System.out.println(newDosen.nidn);
            newDosen.mengajar();
        }

        // Attempting invalid downcasting (uncomment to test and observe runtime error)
        /*
        TenagaKependidikan test = (TenagaKependidikan) pegawai1;
        */

        // Using train method to demonstrate polymorphic argument
        train(dosen1);
        train(tendik1);
    }

    // Polymorphic method
    public static void train(Pegawai pegawai) {
        System.out.println("Memberikan pelatihan untuk pegawai");
        pegawai.displayInfo();

        // Checking object type and customizing output
        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        } else if (pegawai instanceof TenagaKependidikan) {
            System.out.println("Memberikan pelatihan administrasi dan layanan");
        }
    }
}
