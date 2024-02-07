#include <bits/stdc++.h>
#include <cstring>
#include "Human.cpp"

using namespace std;

int main()
{
    // Human rain;

    // rain.set_name("Rain");
    // rain.set_gender('L');

    cout << "Anggota DPR RI 2019/2024 : " << '\n';
    cout << "---------------------------" << "\n\n";
    // Human raffi("19001","Raffi","Ketahanan","PSI");
    // Human arul("19002","Arul","Ketahanan","PDIP");
    // Human haris("19003","Haris","kesehatan","PKS");
    // Human furqon("19004","Furqon","Sosial","PKB");
    // Human rehan("19005","Rehan","Sosial","NasDek");

    int i, n = 0;
    string id;
    string name;
    string namBid;
    string namPar;
    // char gender;

    list<Human> llist;
    llist.push_back(Human("19001","Raffi","Ketahanan","PSI"));
    llist.push_back(Human("19002","Arul","Ketahanan","PDIP"));
    llist.push_back(Human("19003","Haris","kesehatan","PKS"));
    llist.push_back(Human("19004","Furqon","Sosial","PKB"));
    llist.push_back(Human("19005","Rehan","Sosial","NasDem"));

    i = 0;
    for(list<Human>::iterator it = llist.begin(); it != llist.end(); it++)
    {
        cout  << (i+1) << ". " << it->get_id() << " | " << it->get_name() << " | " << it->get_namBid() << " | " << it->get_namPar() << '\n';
        i++;
    }

    cout << "Pilih opsi dibawah ini :" << '\n';
    cout << "Tambah Data (input 1)" << '\n';
    cout << "Hapus Data (input 2)" << '\n';
    cout << "Edit Data (input 3)" << '\n';
    cout << "Keluar (input 4)" << '\n';

    int pilihan;
    cin >> pilihan;
    while(pilihan!=4) {
        if(pilihan==1) {
            cout << "Masukkan id, nama, nama bidang dan nama partai dari anggota yang ingin dimasukkan : " << '\n';
            cin >> id >> name >> namBid >> namPar;

            llist.push_back(Human(id, name, namBid, namPar));
        }
        else if(pilihan==2) {
            cout << "Masukkan id dari anggota yang ingin diubah datanya : " << '\n';
            cin >> id;

            i = 0;
            for(list<Human>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                if(id==it->get_id()) {
                    cout << "Data ditemukan, Harap memasukkan data baru untuk diubah : " << '\n';
                    cin >> name >> namBid >> namPar;
                    it->set_name(name);
                    it->set_namBid(namBid);
                    it->set_namPar(namPar);// = namPar;
                }
                i++;
            }
        }
        else if(pilihan==3) {
            cout << "Masukkan id dari anggota yang ingin dihapus datanya : " << '\n';
            cin >> id;

            i = 0;
            for(list<Human>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                if(id==it->get_id()) {
                    cout << "Data sudah dihapus :) " << '\n';
                }
                i++;
            }
        }
        else if(pilihan==4) {
            
        }
        i = 0;
        for(list<Human>::iterator it = llist.begin(); it != llist.end(); it++)
        {
            cout  << (i+1) << ". " << it->get_id() << " | " << it->get_name() << " | " << it->get_namBid() << " | " << it->get_namPar() << '\n';
            i++;
        }
        cout << "Pilih opsi dibawah ini :" << '\n';
        cout << "Tambah Data (input 1)" << '\n';
        cout << "Hapus Data (input 2)" << '\n';
        cout << "Edit Data (input 3)" << '\n';
        cout << "Keluar (input 4)" << '\n';
        cin >> pilihan;
    }

    return 0;
}