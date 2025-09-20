import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] product=new String[100];
        int[] price=new int [100];
        int[] quantity=new int [100];
        int n=50;
        int prod=0;
        int quant=0;
        int c=0;
        int total=0;
        // int i=0;
        System.out.println("Products details: ");
        System.out.println("Rice:   Rs.50 per kg(Choice:1)\nSugar:  Rs.40 per kg(Choice:2)\nOil:    Rs:150 per litre(Choice:3)\nSoap:   RS.30 per litre(Choice:4)\nMilk:   Rs.25 per litre(Choice:5)\nEnd the purchase (Choice:6)");

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Choice: ");
            prod=sc.nextInt();
            if(prod!=6)
            {
                System.out.println("Enter the quantity: ");
                quant = sc.nextInt();
            }
            if (prod == 1) {
                product[i] = "Rice ";
                price[i] = 50;
                quantity[i] = quant;
                price[i]*=quant;
                total+=price[i];
                //   i++;
                c++;
                //break;
            } else if (prod == 2) {
                product[i] = "Sugar";
                price[i] = 40;
                quantity[i] = quant;
                price[i]*=quant;
                total+=price[i];
                // i++;
                c++;
                // break;
            } else if (prod == 3) {
                product[i] = "Oil  ";
                price[i] = 150;
                quantity[i] = quant;
                price[i]*=quant;
                total+=price[i];
                //  i++;
                c++;
                // break;
            } else if (prod == 4) {
                product[i] = "Soap ";
                price[i] = 30;
                quantity[i] = quant;
                price[i]*=quant;
                total+=price[i];
                // i++;
                c++;
                //  break;
            } else if (prod == 5) {
                product[i] = "Milk ";
                price[i] = 25;
                quantity[i] = quant;
                price[i]*=quant;
                total+=price[i];
                //  i++;
                c++;
                //  break;
            } else if (prod == 6) {

                break;
            }
        }
        System.out.println("Product      quantity      price");
        for(int i=0;i<c;i++)
        {
            System.out.println(product[i]+"         "+quantity[i]+"            "+price[i] );
        }
        System.out.println("Total Price:" + total);
        System.out.println("Thank you");
    }
}