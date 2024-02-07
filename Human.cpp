/*Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/
#include <iostream>
#include <string>

#pragma once

using namespace std;

class Human
{
    private:
        string id;
        string name;
        string namBid;
        string namPar;

    public:
        Human()
        {
            this->id = "";
            this->name = "";
            this->namBid = "";
            this->namPar = "";
        }

        Human(string id, string name, string namBid, string namPar)
        {
            this->id = id;
            this->name = name;
            this->namBid = namBid;
            this->namPar = namPar;
        }

        string get_id()
        {
            return this->id;
        }

        void set_id(string id)
        {
            this->id = id;
        }

        string get_name()
        {
            return this->name;
        }

        void set_name(string name)
        {
            this->name = name;
        }

        string get_namBid()
        {
            return this->namBid;
        }

        void set_namBid(string namBid)
        {
            this->namBid = namBid;
        }

        string get_namPar()
        {
            return this->namPar;
        }

        void set_namPar(string namPar)
        {
            this->namPar = namPar;
        }

        // void add()

        // void eat()
        // {
        //     cout << this->name << " is eating!" << '\n';
        // }

        // void sleep() 
        // {
        //     cout << this->name << " is sleeping!" << '\n';
        // }

        // void tambah(list<Human>& llist)
        // {
        //     string id,name,namBid,namPar;
        //     cout << "Masukkan id, nama, nama bidang dan nama partai dari anggota yang ingin dimasukkan : " << '\n';
        //     cin >> id >> name >> namBid >> namPar;

        //     llist.push_back(Human(id, name, namBid, namPar));
        // }

        ~Human()
        {

        }
};