package CreatingObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    String name;
    float price;
    int id;

    public Product(String name, float price, int id) {
        this.name = name;

        this.price = price;
        this.id = id;
    }
}




public class Project1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product("Laptop",12000f,01));
        list.add(new Product("Desktop",24000f,14));
        list.add(new Product("Tablet",4000f,10));
        list.add(new Product("ipad",2400f,13));
        List<Float>ProductPriceList = list.stream().map(x->x.price).collect(Collectors.toList());
        System.out.println(ProductPriceList);

        List<String>ProductNameList= list.stream().map(x->x.name).collect(Collectors.toList());
        System.out.println(ProductNameList);

        Double sumPrices = list.stream().collect(Collectors.summingDouble(x->x.price));
        System.out.println(sumPrices);

        Integer sumID = list.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println(sumID);

        Long numberofelements = list.stream().collect(Collectors.counting());
        System.out.println(numberofelements);



    }
}
