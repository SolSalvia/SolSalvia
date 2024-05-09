import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Creo diferentes productos
        Chair c1 = new Chair(20, "Elegant", 1500.0f, false);
        Desk d1 = new Desk(18, "Confort", 2300.5f, 0.50f, 0.87f);
        Printer p1 = new Printer(12, "T24JAXR", 267.2f, "Epson Stilus", 20);
        Notebook n1 = new Notebook(10, "ASUS", 7000.8f, "VivoBook", 256);


        List<Product> productList = new ArrayList<>(); //Hago un arraylist de productos
        productList.add(c1);
        productList.add(d1);
        productList.add(p1);
        productList.add(n1);


        System.out.println("Precios sin aumento:");
        for(Product product : productList){ //Recorro la lista y la muestro en pantalla (Sin aumento)
            System.out.println(product);
        }

        float discountPercentage = 10; //Pongo que es 10% de descuento (oferta)
        float discountedPriceChair = c1.applyDiscount(discountPercentage);
        float discountedPricePrinter = p1.applyDiscount(discountPercentage);

        System.out.println("Precio de la silla con descuento: $" + discountedPriceChair);
        System.out.println("Precio de la impresora con descuento: $" + discountedPricePrinter);

        updatePrices(productList);

        System.out.println("\nPrecios con aumento:"); //Precios con aumento
        for(Product p : productList) {
            System.out.println(p);
        }

    }
        public static void updatePrices(List<Product> productList){
            for(Product p : productList){
                if(p instanceof Chair){
                    ((Chair) p).updatePrice(0.05); //Incrementa 5% de la Silla
                }
                if(p instanceof Desk){
                    ((Desk) p).updatePrice(0.10); //Incrementa 10% del Escritorio
                }
                if(p instanceof Printer){
                    ((Printer) p).updatePrice(0.15); //Incrementa 15% de la impresora
                }
                if(p instanceof Notebook){
                    ((Notebook) p).updatePrice(0.20); //Incrementa 20% de la Notebook
                }
            }
        }
    }


