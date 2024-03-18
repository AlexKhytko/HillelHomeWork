package HW6;

import javax.naming.Name;
import java.util.jar.Attributes;

public class Product {
    public String name;
    public String code;
    public String price;
    public String avail;

    public String newName;


public Product(){};

   public Product(String nameProd, String codeProd, String priceProd, String availProd) {
name = nameProd;
code = codeProd;
price = priceProd;
avail = availProd;
             }

    public String getName() {
        System.out.println("Your chosen product   " + name);
        return name;
    }
   public String getPrice() {
       System.out.println("Cost      " + price);
        return price;
    }
    public String getCode() {
        System.out.println("#     " + code);
        return code;
    }
    public String getAvail() {
        System.out.println("Availibity     " + avail);
        return avail;
    }
    public void setName (String newName){
        name = newName;
        System.out.println("Your chosen product   " + newName);
           }
    public void setPrice (String newPrice){
        name = newPrice;
        System.out.println("Cost      " + newPrice);
   }
    public void setCode (String newCode){
        name = newCode;
        System.out.println("#     " + newCode);
    }
    public void setAvail (String newAvail){
        name = newAvail;
        System.out.println("Availibity     " + newAvail);
    }


}
