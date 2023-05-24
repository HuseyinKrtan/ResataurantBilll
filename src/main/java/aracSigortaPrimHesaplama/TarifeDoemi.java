package aracSigortaPrimHesaplama;

import java.util.Scanner;

public class TarifeDoemi {
    public static void main(String[] args) {
        TarifeDoemi obj1 = new TarifeDoemi();
        obj1.start();



    }

    public  void    birinciTarifeHaziran (){

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen arac tipini seciniz");
        System.out.println(" 1.dönemi :Haziran   2023      \n" +
                "            1 otomobil: 2000 TL   \n" +
                "            2 kamyon:   3000 TL   \n" +
                "            3 otobüs: tip1: 4000TL\n" +
                "                      tip2: 5000TL\n" +
                "            4 motosiklet: 1500  TL");
       int tarife = input.nextInt();



        switch (tarife){

            case 1:
                System.out.println("OTOMOBIL : 2000 TL");
                break;
            case 2:
                System.out.println(" kAMYON : 3000 TL");
                break;
            case 3:
             otobus();
             break;
            case 4:
                System.out.println("MOTOSIKLET 1500 TL");
                break;

            default:
                System.out.println("Yanlıs secim ...");


        }


    }


    public void  ikinciTarifeAralik (){

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen arac tipini seciniz");
        System.out.println(" 1.dönemi :Haziran   2023      \n" +
                "          1 otomobil: 2500 TL   \n" +
                "          2 kamyon:   3500 TL   \n" +
                "          3 otobüs: tip1: 4500 TL\n" +
                "                    tip2: 5500 TL\n" +
                "          4 motosiklet: 1750 TL");
        int tarife2 = input.nextInt();



        switch (tarife2){

            case 1:
                System.out.println("OTOMOBIL : 2500 TL");
                break;
            case 2:
                System.out.println(" kAMYON : 3500 TL");
                break;
            case 3:
                otobus();
                break;
            case 4:
                System.out.println("MOTOSIKLET 1750 TL");
                break;

            default:
                System.out.println("Yanlıs secim ...");


        }


    }

    public void start (){

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen tarife donemini seciniz...");
        System.out.println("1) Aralik 2023");
        System.out.println("2) Haziran 2023");
        int secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println(" Tarife dönemi:Aralık 2023 ");
                birinciTarifeHaziran();
                break;
            case 2 :
                System.out.println("Tarife dönemi:Haziran 2023");
                ikinciTarifeAralik();
                break;
            default:
                System.out.println("Tekrar deneyiniz..");
                start();
        }



    }

 public void otobus (){
        Scanner input = new Scanner(System.in);
     System.out.println("Lutfen otobus tipini igirniz..");
     System.out.println("1==>Tıp 1: 18-30 Koltuklu 4000 TL " +
             "           2==>Tıp 2: 31 ve uzeri Koltuklu 4500 TL");
        int otobusTipi =input.nextInt();
        switch (otobusTipi){
            case 1:
                System.out.println("Tıp 1: 18-30 Koltuklu 4000 TL");
                break;
            case 2 :
                System.out.println("Tıp 2: 31 ve uzeri Koltuklu 4500 TL");
                break;
        }


 }



}
















