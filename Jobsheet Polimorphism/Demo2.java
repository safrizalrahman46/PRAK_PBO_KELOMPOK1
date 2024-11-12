// File: Demo.java
public class Demo2 {
    public static void main(String[] args) {
        // Step 1: Create a `Dosen` object
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        // Step 2: Upcast `Dosen` to `Pegawai`
        Pegawai pegawai1 = dosen1;  // Upcasting, now `pegawai1` is treated as `Pegawai`

        // Step 3: Display fields accessible in `Pegawai`
        System.out.println(pegawai1.nip);       // Should print "19940201"
        System.out.println(pegawai1.nama);      // Should print "Widia, S.Kom. M.Kom"
        pegawai1.displayInfo();                 // Calls overridden `displayInfo()` in `Dosen`

        // Step 4: Attempt Invalid Downcasting to `TenagaKependidikan`
        try {
            TenagaKependidikan test = (TenagaKependidikan) pegawai1;  // This will cause a runtime error
        } catch (ClassCastException e) {
            System.out.println("Runtime Error: " + e);  // Expected error, because `pegawai1` is not a `TenagaKependidikan`
        }

        // Step 5: Valid Downcasting Back to `Dosen`
        Dosen newDosen = (Dosen) pegawai1;  // Downcasting back to `Dosen`
        System.out.println(newDosen.nama);   // Now accessible because `newDosen` is of type `Dosen`
        System.out.println(newDosen.nidn);   // Accessing `nidn` in `Dosen`
        newDosen.mengajar();                 // Calling `mengajar()` in `Dosen`
    }
}
