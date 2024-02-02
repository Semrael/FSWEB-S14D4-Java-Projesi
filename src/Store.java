public class Store {
    public static void main(String[] args) {
        ProductForSale[] products= new ProductForSale[5];
        products[0]=new Chocolate("sweet",12.2,"ödlascds","white",Boolean.TRUE);
        products[1]=new Bread("Bakery",2,"bread","kepekli","brown");
        products[2]=new Coke("Drinks",14,"soğuk içiniz",Boolean.TRUE,2);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
            for(ProductForSale product: products){
                if(product!= null) {
                    product.showDetails();
                }
            }
    }
}