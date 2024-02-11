from Human import Human

def main():
    # Menampilkan header untuk data anggota DPR RI 2019/2024
    print("---------------------------")
    print("Data Anggota DPR RI 2019/2024 : ")
    print("---------------------------")

    # Membuat list untuk menyimpan objek Human
    humanList = [
        Human("19001", "Raffi", "Ketahanan", "PSI"),
        Human("19002", "Arul", "Ketahanan", "PDIP"),
        Human("19003", "Haris", "Kesehatan", "PKS"),
        Human("19004", "Furqon", "Sosial", "PKB"),
        Human("19005", "Rehan", "Sosial", "NasDem")
    ]

    # Inisialisasi variabel untuk panjang maksimum setiap kolom
    maxIdLength = max(len(human.get_id()) for human in humanList)
    maxNameLength = max(len(human.get_name()) for human in humanList)
    maxNamBidLength = max(len(human.get_namBid()) for human in humanList)
    maxNamParLength = max(len(human.get_namPar()) for human in humanList)

    # Menampilkan data anggota dengan lebar kolom yang sesuai
    for i, human in enumerate(humanList):
        print("{:<5} | {:<{}} | {:<{}} | {:<{}} | {:<{}}".format(
            i + 1, human.get_id(), maxIdLength + 2,
            human.get_name(), maxNameLength + 2,
            human.get_namBid(), maxNamBidLength + 2,
            human.get_namPar(), maxNamParLength + 2
        ))

    # Input pilihan dari pengguna
    pilihan = 0

    # Melakukan loop selama pilihan pengguna tidak sama dengan 4
    while pilihan != 4:
        print("---------------------------")
        print("Pilih opsi dibawah ini:")
        print("Tambah Data (input 1)")
        print("Edit Data (input 2)")
        print("Hapus Data (input 3)")
        print("Keluar (input 4)")
        print("---------------------------")

        # Input pilihan dari pengguna
        pilihan = int(input().strip())

        # Switch case untuk menangani pilihan pengguna
        if pilihan == 1:
            # Menambahkan data anggota baru ke dalam list
            print("Masukkan id, nama, nama bidang, dan nama partai dari anggota yang ingin dimasukkan:")
            input_data = input()
            id, name, namBid, namPar = input_data.split()
            humanList.append(Human(id, name, namBid, namPar))
        elif pilihan == 2:
            # Mengedit data anggota berdasarkan id
            print("Masukkan id dari anggota yang ingin diubah datanya:")
            id = input().strip()
            for human in humanList:
                if id == human.get_id():
                    print("Data ditemukan, harap memasukkan data baru untuk diubah:")
                    input_data = input()
                    name, namBid, namPar = input_data.split()
                    human.set_name(name)
                    human.set_namBid(namBid)
                    human.set_namPar(namPar)
                    break
        elif pilihan == 3:
            # Menghapus data anggota berdasarkan id
            print("Masukkan id dari anggota yang ingin dihapus datanya:")
            id = input().strip()
            for human in humanList:
                if id == human.get_id():
                    humanList.remove(human)
                    print("Data sudah dihapus :)")
                    break
        elif pilihan == 4:
            # Keluar dari program
            break
        else:
            print("Opsi tidak valid. Silakan pilih kembali.")

        # Menampilkan data anggota setelah operasi
        print("---------------------------")
        print("Data Anggota DPR RI 2019/2024:")
        print("---------------------------")
        # Menghitung panjang maksimum untuk setiap kolom setelah operasi
        maxIdLength = max(len(human.get_id()) for human in humanList)
        maxNameLength = max(len(human.get_name()) for human in humanList)
        maxNamBidLength = max(len(human.get_namBid()) for human in humanList)
        maxNamParLength = max(len(human.get_namPar()) for human in humanList)
        # Menampilkan data anggota dengan lebar kolom yang sesuai
        for i, human in enumerate(humanList):
            print("{:<5} | {:<{}} | {:<{}} | {:<{}} | {:<{}}".format(
                i + 1, human.get_id(), maxIdLength + 2,
                human.get_name(), maxNameLength + 2,
                human.get_namBid(), maxNamBidLength + 2,
                human.get_namPar(), maxNamParLength + 2
            ))

    # Menampilkan pesan penutup program
    print("---------------------------")
    print("Sampai jumpa lagi XD")
    print("---------------------------")
    
# Memanggil fungsi main jika file ini dijalankan sebagai program utama
if __name__ == "__main__":
    main()