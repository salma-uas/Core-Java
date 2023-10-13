public class ProductShipping{

    //Instance filed declaration
    boolean isFilled;
    double ammountBill;
    String shipping;

    //constractor method

    public ProductShipping(boolean productFill,double cost, String shippingType){
        if(cost>30.00){
            System.out.println("Expensive Product");
        }

        isFilled=productFill;
        ammountBill=cost;
        shipping=shippingType;
    }

        //ship method

        public void ship(){
            if(isFilled){
                System.out.println("Product is ready");
                System.out.println("Shipping cost is " +shippingCost() + " euro");

            }
            else{
                System.out.println("Product is not  ready");
            }

        }

        //shippingCost Method

        public double shippingCost(){
            double shipCost;
            switch(shipping){
                case "Regular":
                shipCost=0.0;
                break;

                case "Express":
                shipCost=1.75;
                break;

                default:
                shipCost=0.5;

            }
            return shipCost;
        }
    
    public static void main(String [] args){
        ProductShipping fish=new ProductShipping(true, 200, "Express");
        ProductShipping Meat=new ProductShipping(true, 20, "Normal");
        ProductShipping Veg=new ProductShipping(false, 20, "Normal");


        fish.ship();
        Meat.ship();
        Veg.ship();



    }
}