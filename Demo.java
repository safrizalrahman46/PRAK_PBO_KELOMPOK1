// File: Demo.java
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Instantiating objects
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // System.out.println(dosen1.nip);        // Prints the NIP of the Dosen
        // System.out.println(dosen1.nama);       // Prints the name of the Dosen
        // System.out.println(dosen1.nidn);       // Prints the NIDN specific to Dosen
        // dosen1.mengajar();

        Pegawai pegawai1 = dosen1;
        System.out.println(pegawai1.nip);       // Accessible, because `nip` is in `Pegawai`
        System.out.println(pegawai1.nama);      // Accessible, because `nama` is in `Pegawai`
        pegawai1.displayInfo();  
        // The following lines will cause errors:
        // System.out.println(pegawai1.nidn);   // Error: `nidn` is not a field in `Pegawai`
        // pegawai1.mengajar();                 // Error: `mengajar()` is not a method in `Pegawai`



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
        // Pegawai pegawai1 = dosen1;  // Upcasting
        // pegawai1.displayInfo();  // Calls overridden method in Dosen

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
