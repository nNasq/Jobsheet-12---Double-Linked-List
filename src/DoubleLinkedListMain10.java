import java.util.Scanner;

public class DoubleLinkedListMain10 {

    static Mahasiswa10 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM    : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama   : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas  : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK    : ");
        double ipk = Double.parseDouble(scan.nextLine());
        return new Mahasiswa10(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList10 list = new DoubleLinkedList10();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Reverse data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = Integer.parseInt(scan.nextLine());

            switch (pilihan) {
                case 1:
                    Mahasiswa10 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    System.out.println("Data berhasil ditambahkan di awal.");
                    break;
                case 2:
                    Mahasiswa10 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    System.out.println("Data berhasil ditambahkan di akhir.");
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa10 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        scan.close();
    }
}
