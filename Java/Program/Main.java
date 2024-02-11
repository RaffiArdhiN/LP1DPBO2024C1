import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {   
        // Menampilkan header untuk data anggota DPR RI 2019/2024
        System.out.println("---------------------------");
        System.out.println("Data Anggota DPR RI 2019/2024 : ");
        System.out.println("---------------------------");

        // Deklarasi variabel
        int i, n = 0;
        String id;
        String name;
        String namBid;
        String namPar;

        // Membuat ArrayList untuk menyimpan objek Human
        ArrayList<Human> humanList = new ArrayList<>();
        // Menambahkan data anggota ke dalam ArrayList
        humanList.add(new Human("19001", "Raffi", "Ketahanan", "PSI"));
        humanList.add(new Human("19002", "Arul", "Ketahanan", "PDIP"));
        humanList.add(new Human("19003", "Haris", "Kesehatan", "PKS"));
        humanList.add(new Human("19004", "Furqon", "Sosial", "PKB"));
        humanList.add(new Human("19005", "Rehan", "Sosial", "NasDem"));

        // Inisialisasi variabel untuk panjang maksimum setiap kolom
        int maxIdLength = 0;
        int maxNameLength = 0;
        int maxNamBidLength = 0;
        int maxNamParLength = 0;

        // Menghitung panjang maksimum untuk setiap kolom
        for (Human human : humanList) {
            maxIdLength = Math.max(maxIdLength, human.getId().length());
            maxNameLength = Math.max(maxNameLength, human.getName().length());
            maxNamBidLength = Math.max(maxNamBidLength, human.getNamBid().length());
            maxNamParLength = Math.max(maxNamParLength, human.getNamPar().length());
        }

        // Menampilkan data anggota dengan lebar kolom yang sesuai
        for (i = 0; i < humanList.size(); i++) {
            Human current = humanList.get(i);
            System.out.printf("%-5s | %-"+(maxIdLength + 2)+"s | %-"+(maxNameLength + 2)+"s | %-"+(maxNamBidLength + 2)+"s | %-"+(maxNamParLength + 2)+"s%n",
                    (i + 1), current.getId(), current.getName(), current.getNamBid(), current.getNamPar());
        }

        // Input pilihan dari pengguna
        int pilihan;

        // Melakukan loop selama pilihan pengguna tidak sama dengan 4
        do {
            System.out.println("---------------------------");
            System.out.println("Pilih opsi dibawah ini:");
            System.out.println("Tambah Data (input 1)");
            System.out.println("Edit Data (input 2)");
            System.out.println("Hapus Data (input 3)");
            System.out.println("Keluar (input 4)");
            System.out.println("---------------------------");
            // Scanner digunakan untuk membaca input dari pengguna
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();

            // Switch case untuk menangani pilihan pengguna
            switch (pilihan) {
                case 1:
                    // Menambahkan data anggota baru ke dalam ArrayList
                    System.out.println("Masukkan id, nama, nama bidang, dan nama partai dari anggota yang ingin dimasukkan:");
                    id = scanner.next();
                    name = scanner.next();
                    namBid = scanner.next();
                    namPar = scanner.next();
                    humanList.add(new Human(id, name, namBid, namPar));
                    break;
                case 2:
                    // Mengedit data anggota berdasarkan id
                    System.out.println("Masukkan id dari anggota yang ingin diubah datanya:");
                    id = scanner.next();
                    Iterator<Human> iteratorEdit = humanList.iterator();
                    while (iteratorEdit.hasNext()) {
                        Human current = iteratorEdit.next();
                        if (id.equals(current.getId())) {
                            System.out.println("Data ditemukan, harap memasukkan data baru untuk diubah:");
                            name = scanner.next();
                            namBid = scanner.next();
                            namPar = scanner.next();
                            current.setName(name);
                            current.setNamBid(namBid);
                            current.setNamPar(namPar);
                        }
                    }
                    break;
                case 3:
                    // Menghapus data anggota berdasarkan id
                    System.out.println("Masukkan id dari anggota yang ingin dihapus datanya:");
                    id = scanner.next();
                    Iterator<Human> iteratorDelete = humanList.iterator();
                    while (iteratorDelete.hasNext()) {
                        Human current = iteratorDelete.next();
                        if (id.equals(current.getId())) {
                            iteratorDelete.remove();
                            System.out.println("Data sudah dihapus :)");
                        }
                    }
                    break;
                case 4:
                    // Keluar dari program
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih kembali.");
            }

            // Menampilkan data anggota setelah operasi
            System.out.println("---------------------------");
            System.out.println("Data Anggota DPR RI 2019/2024:");
            System.out.println("---------------------------");
            // Menghitung panjang maksimum untuk setiap kolom setelah operasi
            maxIdLength = 0;
            maxNameLength = 0;
            maxNamBidLength = 0;
            maxNamParLength = 0;
            for (Human human : humanList) {
                maxIdLength = Math.max(maxIdLength, human.getId().length());
                maxNameLength = Math.max(maxNameLength, human.getName().length());
                maxNamBidLength = Math.max(maxNamBidLength, human.getNamBid().length());
                maxNamParLength = Math.max(maxNamParLength, human.getNamPar().length());
            }
            // Menampilkan data anggota dengan lebar kolom yang sesuai
            for (i = 0; i < humanList.size(); i++) {
                Human current = humanList.get(i);
                System.out.printf("%-5s | %-"+(maxIdLength + 2)+"s | %-"+(maxNameLength + 2)+"s | %-"+(maxNamBidLength + 2)+"s | %-"+(maxNamParLength + 2)+"s%n",
                        (i + 1), current.getId(), current.getName(), current.getNamBid(), current.getNamPar());
            }

        } while (pilihan != 4);

        // Menampilkan pesan penutup program
        System.out.println("---------------------------");
        System.out.println("Sampai jumpa lagi XD");
        System.out.println("---------------------------");
    }
}