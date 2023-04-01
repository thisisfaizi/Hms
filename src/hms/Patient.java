/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms;

/**
 *Faizan
 *
 * @author Master
 */
public class Patient {
  private  int age,id;
  private  String name,adress,gender,contact;

    public Patient() {
        this.age = 0;
        this.id = 0;
        this.name = "";
        this.adress = "";
        this.gender = "";
        this.contact = "";
    }

    public Patient(int age, int id, String name, String adress, String gender, String contact) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.gender = gender;
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "age=" + age + ", id=" + id + ", name=" + name + ", adress=" + adress + ", gender=" + gender + ", contact=" + contact + '}';
    }
    
}
