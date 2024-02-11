/*Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/
public class Human {
    // Atribut-atribut yang dimiliki oleh kelas Human, berupa id; nama; nama bidang dan nama partai
    private String id;
    private String name;
    private String namBid;
    private String namPar;

    // Konstruktor pertama tanpa parameter
    public Human() {
        // Inisialisasi atribut dengan nilai default
        this.id = "";
        this.name = "";
        this.namBid = "";
        this.namPar = "";
    }

    // Konstruktor kedua dengan parameter
    public Human(String id, String name, String namBid, String namPar) {
        // Inisialisasi atribut dengan nilai dari parameter
        this.id = id;
        this.name = name;
        this.namBid = namBid;
        this.namPar = namPar;
    }

    // Getter dan setter untuk atribut id
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter dan setter untuk atribut name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan setter untuk atribut namBid
    public String getNamBid() {
        return this.namBid;
    }

    public void setNamBid(String namBid) {
        this.namBid = namBid;
    }

    // Getter dan setter untuk atribut namPar
    public String getNamPar() {
        return this.namPar;
    }

    public void setNamPar(String namPar) {
        this.namPar = namPar;
    }
}
