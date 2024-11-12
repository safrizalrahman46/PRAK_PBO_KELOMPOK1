// File: Dosen.java
public class Dosen extends Pegawai {
    public String nidn;

    // Default constructor
    public Dosen() {}

    // Constructor with parameters
    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);  // Call superclass constructor
        this.nidn = nidn;
    }

    // Overridden method to display information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("NIDN: " + nidn);
    }

    // Specific method for Dosen
    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
