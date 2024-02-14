<!-- // Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.  -->
<?php

// Definisi kelas Human
class Human {
    // Properti pribadi untuk menyimpan data anggota DPR
    private $id;
    private $name;
    private $namBid;
    private $namPar;
    private $profilePhoto;

    // Konstruktor untuk inisialisasi objek Human dengan data awal atau nilai default
    public function __construct($id = "", $name = "", $namBid = "", $namPar = "", $profilePhoto = "") {
        $this->id = $id;
        $this->name = $name;
        $this->namBid = $namBid;
        $this->namPar = $namPar;
        $this->profilePhoto = $profilePhoto;
    }

    // Metode-metode getter dan setter untuk mengakses dan mengubah nilai properti
    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getNamBid() {
        return $this->namBid;
    }

    public function setNamBid($namBid) {
        $this->namBid = $namBid;
    }

    public function getNamPar() {
        return $this->namPar;
    }

    public function setNamPar($namPar) {
        $this->namPar = $namPar;
    }

    public function getProfilePhoto() {
        return $this->profilePhoto;
    }

    public function setProfilePhoto($profilePhoto) {
        $this->profilePhoto = $profilePhoto;
    }
}

?>