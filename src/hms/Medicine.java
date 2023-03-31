/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms;

/**
 *JIA KO SMJHA RHA huu
 * @author Master
 */
public class Medicine {
    private int id,sellinPrice,buyingPrice,quantity;
    private String  name,description;

    public Medicine(int id, int sellinPrice, int buyingPrice, int quantity, String name, String description) {
        this.id = id;
        this.sellinPrice = sellinPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public Medicine() {
          this.id = 0;
        this.sellinPrice = 0;
        this.buyingPrice =0;
        this.quantity = 0;
        this.name = "";
        this.description = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellinPrice() {
        return sellinPrice;
    }

    public void setSellinPrice(int sellinPrice) {
        this.sellinPrice = sellinPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", sellinPrice=" + sellinPrice + ", buyingPrice=" + buyingPrice + ", quantity=" + quantity + ", name=" + name + ", description=" + description + '}';
    }
    
}
