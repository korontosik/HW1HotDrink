/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт 
соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */
public abstract class Main {

     public static void main(String[] args) {
        //  Product product1 = new Product("pr1", 34);
        //  Product product2 = new Product("pr2", 150);
        //  Product product3 = new Product("pr3", 300);
        //  Product product4 = new Product("pr4", 80);
         Product product5 = new HotDrink("hd1", 50, 75);
         Product product6 = new HotDrink("hd2", 75, 60);
         Product product7 = new HotDrink("hd3", 60, 80);
         Product product8 = new HotDrink("hd4", 30, 90);
        VendingMachine vendingMachine = new HotDrinkVendingMachine();
        // vendingMachine.addProductList(product1);
        // vendingMachine.addProductList(product2);
        // vendingMachine.addProductList(product3);
        // vendingMachine.addProductList(product4);
        vendingMachine.addProductList(product5);
        vendingMachine.addProductList(product6);
        vendingMachine.addProductList(product7);
        vendingMachine.addProductList(product8);
        System.out.println(vendingMachine.getProduct("hd2").getName()+ " - " 
        + vendingMachine.getProduct("hd2").getPrice());
        
        
     }
}