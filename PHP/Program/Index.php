<?php

    require_once 'Human.php';

    // Fungsi untuk mencetak tabel data anggota DPR RI
    function printTable($humanList) {

        // Membuat tabel untuk data anggota DPR RI 2019/2024
        echo '<table border="0">';
        echo "Data Anggota DPR RI 2019/2024 :<br>";
        echo '<tr>';
        echo '<th>No</th>';
        echo '<th>ID</th>';
        echo '<th>Nama</th>';
        echo '<th>Nama Bidang</th>';
        echo '<th>Nama Partai</th>';
        echo '<th>Foto Profil</th>';
        echo '</tr>';

        // Menampilkan data anggota dalam bentuk tabel
        foreach ($humanList as $index => $current) {
            echo '<tr>';
            echo '<td>' . ($index + 1) . '</td>';
            echo '<td>' . $current->getId() . '</td>';
            echo '<td>' . $current->getName() . '</td>';
            echo '<td>' . $current->getNamBid() . '</td>';
            echo '<td>' . $current->getNamPar() . '</td>';
            echo '<td><img src="' . $current->getProfilePhoto() . '" alt="Profil" width="20" height="20"></td>';
            echo '</tr>';
        }
        echo '</table>';
        echo "<br><br>";
    }

    // Deklarasi variabel
    $i = 0;
    $n = 0;
    $id = "";
    $name = "";
    $namBid = "";
    $namPar = "";

    // Membuat list untuk menyimpan objek Human
    $humanList = array();
    // Menambahkan data anggota ke dalam list
    $humanList[] = new Human("19001", "Raffi", "Ketahanan", "PSI", "1-presiden-ri.png");
    $humanList[] = new Human("19002", "Arul", "Ketahanan", "PDIP", "1-presiden-ri.png");
    $humanList[] = new Human("19003", "Haris", "Kesehatan", "PKS", "1-presiden-ri.png");
    $humanList[] = new Human("19004", "Furqon", "Sosial", "PKB", "1-presiden-ri.png");
    $humanList[] = new Human("19005", "Rehan", "Sosial", "NasDem", "1-presiden-ri.png");

    // Inisialisasi variabel untuk panjang maksimum setiap kolom
    $maxIdLength = 0;
    $maxNameLength = 0;
    $maxNamBidLength = 0;
    $maxNamParLength = 0;

    // Menghitung panjang maksimum untuk setiap kolom
    foreach ($humanList as $human) {
        $maxIdLength = max($maxIdLength, strlen($human->getId()));
        $maxNameLength = max($maxNameLength, strlen($human->getName()));
        $maxNamBidLength = max($maxNamBidLength, strlen($human->getNamBid()));
        $maxNamParLength = max($maxNamParLength, strlen($human->getNamPar()));
    }

    // Fungsi untuk menambahkan spasi ke kolom agar tabel rapi
    function printSpaces($maxLength, $value) {
        $spaces = str_repeat(' ', max(0, $maxLength - strlen($value)));
        return $value . $spaces;
    }

    // Menampilkan tabel awal
    printTable($humanList);

    // Menu untuk menambah, mengubah, atau menghapus data
    $pilihan = 0;
    do {
        switch ($pilihan) {
            case 0:
                // Menambahkan data baru
                $humanList[] = new Human("19006", "Arya", "Ketahanan", "PDIP", "1-presiden-ri.png");
                echo "<i>Data baru berhasil ditambah :D</i><br>";
                break;
            case 1:
                // Mengubah data dengan ID 19006
                $idTarget = 19006;
                foreach ($humanList as $human) {
                    if ($idTarget == $human->getId()) {
                        $human->setName("Arya_Aydin_Margono");
                        $human->setNamBid("Ketahanan");
                        $human->setNamPar("PDIP");
                        $human->setProfilePhoto("1-presiden-ri.png");
                        $found = true;
                        echo "<i>Data dengan ID $idTarget berhasil diubah :)</i><br>";
                    }
                }
                break;
            case 2:
                // Menghapus data dengan ID 19006
                $idTarget = 19006;
                foreach ($humanList as $index => $human) {
                    if ($idTarget == $human->getId()) {
                        array_splice($humanList, $index, 1);
                        echo "<i>Data dengan ID $idTarget berhasil dihapus.</i><br>";
                        break;
                    }
                }
                break;
        }
        // Menampilkan tabel setelah perubahan
        printTable($humanList);

        $pilihan++;
    } while($pilihan != 3)

?>
