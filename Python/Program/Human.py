# Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
class Human:
    # Atribut-atribut yang dimiliki oleh kelas Human, berupa id; nama; nama bidang dan nama partai
    def __init__(self):
        # Inisialisasi atribut dengan nilai default
        self.id = ""
        self.name = ""
        self.namBid = ""
        self.namPar = ""

    # Konstruktor kedua dengan parameter
    def __init__(self, id, name, namBid, namPar):
        # Inisialisasi atribut dengan nilai dari parameter
        self.id = id
        self.name = name
        self.namBid = namBid
        self.namPar = namPar

    # Getter dan setter untuk atribut id
    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    # Getter dan setter untuk atribut name
    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    # Getter dan setter untuk atribut namBid
    def get_namBid(self):
        return self.namBid

    def set_namBid(self, namBid):
        self.namBid = namBid

    # Getter dan setter untuk atribut namPar
    def get_namPar(self):
        return self.namPar

    def set_namPar(self, namPar):
        self.namPar = namPar