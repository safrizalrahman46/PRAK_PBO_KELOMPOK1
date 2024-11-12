// File: TenagaKependidikan.java
public class TenagaKependidikan extends Pegawai {
    public String kategori;

    // Default constructor
    public TenagaKependidikan() {}

    // Constructor with parameters
    public TenagaKependidikan(String nip, String nama, String kategori) {
        super(nip, nama);  // Call superclass constructor
        this.kategori = kategori;
    }

    // Overridden method to display information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Kategori: " + kategori);
    }
}
