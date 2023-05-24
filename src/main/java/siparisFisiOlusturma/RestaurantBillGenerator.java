package siparisFisiOlusturma;

public class RestaurantBillGenerator {
    public static void main(String[] args) {

        start();

    }

    public static void start() {
        FoodMethods obj = new FoodMethods();
        obj.addFoods();
        System.out.println("================================================");
        System.out.println("===============  WELCOME  ======================");
        System.out.println("================================================");
        System.out.println();
        System.out.println("1==>Order Menu");
        System.out.println("2==>Entering an order");
        System.out.println("3==>Order Cancel");
        System.out.println("4==>Order Bill");
        System.out.println("5==>EXIT");

        System.out.println("Please make your selection...");
        int options=Input.input.nextInt();

        switch (options){
            case 1:
                obj.menu();
                break;
            case 2:
//                System.out.println("siparis ekleme");
//                System.out.println("yiyecgin kod ve adedi ile fiyat olusturma");
//                System.out.println("her siparis icin kod uretilsin 100 den baslasın");
//                System.out.println("her sıpariş icin tutar hesaplansın ");
                obj.menu();
                System.out.println("Please ,Enter the code of the food you want to order");
                int secim=Input.input.nextInt();
                System.out.println("How many want this food..");
                int howMany=Input.input.nextInt();
                obj.addOrder(secim,howMany);
                break;
            case 3:
//                System.out.println("siparis kodu girilerek siparis silinsin");
                System.out.println("");
                OrderBill orderBill=new OrderBill();

//                orderBill.cancelOrder(cancelCode);
                break;
            case 4:
                System.out.println("tutarları ile birlikte tum siparişleri ve toplam tutarı gosteren bir" +
                        "hesap fisi yazdırılsın");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice....");
                start();

        }


    }


}
