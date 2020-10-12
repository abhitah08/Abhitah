class Karyawan {

    String namaKaryawan, alamatKaryawan, jabatanKaryawan;
    int umurKaryawan;

    Karyawan() {}

    void printKaryawan() {
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Alamat Karyawan : " + alamatKaryawan);
        System.out.println("Jabatan Karyawan : " + jabatanKaryawan);
        System.out.println("Umur Karyawan : " + umurKaryawan);
    }
}

class DemoKaryawan {
    public static void main(String[] args) {
        Karyawan newKaryawan = new Karyawan();
        newKaryawan.namaKaryawan = "Abhitah";
        newKaryawan.alamatKaryawan = "Madiun";
        newKaryawan.jabatanKaryawan = "Staff Office";
        newKaryawan.umurKaryawan = 21;

        newKaryawan.printKaryawan();

    }
}
