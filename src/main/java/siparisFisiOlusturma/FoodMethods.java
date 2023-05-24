package siparisFisiOlusturma;

import java.util.ArrayList;
import java.util.List;

public class FoodMethods {

    public  static  List<Foods> foodsList=new ArrayList<>();

    public void addFoods() {

        Foods kofte=new Foods(101,"kofte",85);
        Foods sivasKebabi=new Foods(102,"sivasKebabi",110);
        Foods etliEkmek=new Foods(103,"etliEkmek",75);
        Foods cigerSis=new Foods(104,"cigerSis",100);
        Foods cagKebabiSis=new Foods(105,"cagKebabiSis",70);
        foodsList.add(kofte);
        foodsList.add(sivasKebabi);
        foodsList.add(etliEkmek);
        foodsList.add(cigerSis);
        foodsList.add(cagKebabiSis);

}


    public void menu() {
        System.out.println("==>MENU>==");
        System.out.println();
        System.out.printf("%-5s %-15s %5s","id","Food Name","Food Price");
        System.out.println();
        System.out.println();
        int i=1;
        for (Foods each : foodsList) {

            System.out.printf("%-5d %-15s %5d %-1s", each.getFoodscode(), each.getFoodName(), each.getFoodPrice(),"$");
            System.out.println();
            i++;
        }
    }


    public void addOrder(int secim, int howMany) {
        for (Foods each:foodsList) {
            if (each.getFoodscode()==secim){
                Foods obj=new Foods(OrderBill.count,each.getFoodName(),each.getFoodPrice()*howMany);
                OrderBill.orderBillList.add(obj);
                System.out.println("Order CODE : "+obj.getFoodscode()+" "+howMany+" piece "+obj.getFoodName()+" price "+obj.getFoodPrice()+" $");
                OrderBill.count++;
            }
        }
        RestaurantBillGenerator.start();


    }
}
