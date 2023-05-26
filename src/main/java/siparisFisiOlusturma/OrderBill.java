package siparisFisiOlusturma;

import java.util.ArrayList;
import java.util.List;

public class OrderBill {

   public static List<Foods> orderBillList=new ArrayList<>();

   public static int count =1000;



   public void cancelOrder(int cancelCode) {
      for (Foods each:orderBillList) {

         if (each.getFoodscode()==cancelCode){
            orderBillList.remove(each);
            System.out.println("CANCEL ==> Order code : "+"("+each.getFoodscode()+")"+" "+ each.getHowManyPiece()+" piece "+each.getFoodName()+" price "+each.getFoodPrice()+" $");
         }else {
            System.out.println("Invalide choose");
            RestaurantBillGenerator.start();
         }
      }
      RestaurantBillGenerator.start();
   }

   public void showOrder() {
      for (Foods each:orderBillList) {
         System.out.println("Order CODE : "+"("+each.getFoodscode()+")"+" "+each.getHowManyPiece()+" piece "+each.getFoodName()+" price "+each.getFoodPrice()+" $");
      }
   }

   public void showOrderBill() {
      int totalBill=0;
      for (Foods each:orderBillList) {

         totalBill+=each.getFoodPrice();
         System.out.println("Order CODE : "+"("+each.getFoodscode()+")"+" "+each.getHowManyPiece()+" piece "+each.getFoodName()+" price "+each.getFoodPrice()+" $");
      }
      System.out.println("                             Total Bill = "+totalBill);
      System.out.println("=========== GOOD DAY ================");
   }
}
