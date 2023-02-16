package Homework1ShoppingCartStringsUsingList;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<String> listShop = new ArrayList<>();

    public static void main(String[] args) {

        ShoppingCart m = new ShoppingCart();

        System.out.println("----Add in the list----");
        m.add("pepsi");
        m.add("butter");
        m.add("bread");
        m.add("milk");
        m.read();

        System.out.println("----Replace in list----");
        m.replace("water","oil");

        System.out.println("----Find in list----");
        m.find("bere");
        m.find("milk");
        m.read();

        System.out.println("----Remove from list----");
        m.remove("milk");
    }

    public void add(String product){
        listShop.add(product);
    }

    public List<String> read(){
        for (String s: listShop){
            System.out.println(s);
        }
        return listShop;
    }

    public void find (String product){
        Boolean productExist = listShop.contains(product);
        System.out.println("if the product was find: " + productExist);
    }

    public void remove(String product){
        Boolean productExist = listShop.remove(product);
        System.out.println("if the product exist: " + productExist);
        read();
    }

    public void replace(String currentProduct, String newProduct){
        for(int i=0; i < listShop.size(); i++){
            if(listShop.get(i).contains(currentProduct)){
                listShop.set(i,newProduct);
            }
        }
        read();
    }

}
