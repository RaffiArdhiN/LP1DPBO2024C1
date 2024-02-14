# Sistem Manajemen Data Anggota DPR

## Gambaran Umum
Program ini mengelola data anggota DPR Republik Indonesia untuk periode 2019/2024. Ini memungkinkan pengguna untuk melihat, menambah, mengedit, dan menghapus data anggota.

## Cara Menjalankan
1. Clone repositori ke mesin lokal Anda.
2. Buka direktori proyek.
3. Jalankan perintah berikut di terminal:
    ```bash
    python HumanManager.py
    ```

## Struktur Program

### 1. Kelas Human (Human.py)
- Mewakili seorang anggota MPR.
- Berisi atribut: ID, nama, nama bidang, nama partai, dan foto profil.
- Menyediakan metode untuk mendapatkan dan mengatur atribut.

### 2. Kelas HumanManager (HumanManager.py)
- Mengelola logika utama program.
- Menampilkan tabel anggota MPR.
- Memungkinkan pengguna untuk menambah, mengedit, dan menghapus data anggota.

### 3. Menjalankan Program (fungsi utama di HumanManager.py)
- Menginisialisasi daftar objek Human dengan data contoh.
- Menampilkan tabel awal anggota.
- Meminta pengguna memilih opsi: tambah, edit, hapus, atau keluar.
- Melaksanakan opsi yang dipilih dan menampilkan tabel yang diperbarui.
- Berlanjut hingga pengguna memilih untuk keluar.

## Contoh Pengaplikasian Program Ini

### Tabel Awal
![Tabel Awal](screenshots/initial_table.png)

### Menambah Anggota
![Menambah Anggota](screenshots/adding_member.png)

### Mengedit Anggota
![Mengedit Anggota](screenshots/editing_member.png)

### Menghapus Anggota
![Menghapus Anggota](screenshots/deleting_member.png)

## Kesimpulan
Program ini menyediakan antarmuka sederhana untuk mengelola data anggota MPR dengan efisien.

Jangan ragu untuk berkontribusi dan meningkatkan program!
