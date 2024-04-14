import java.util.Scanner;
public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_type;
    String car_fuel_type;
    String car_transmissions;
    int car_price;

    @Override
    public void get_details(){
        System.out.println("CAR NAME:" + car_name);
        System.out.println("COLOR:"+ car_color);
        System.out.println("CAR PRICE:" + car_price);
        System.out.println("CAR TYPE:" + car_type);


    }
    @Override
    public void set_details(){
        Scanner sc= new Scanner (System.in);
        System.out.println("******ENTER CAR DETAILS******");
        System.out.println();
        System.out.print("CAR NAME:");
        car_name = sc.nextLine();
        System.out.print("CAR COLOR:");
        car_color = sc.nextLine();
        System.out.print("CAR PRICE:");
        car_price = sc.nextInt();
        total_cars_in_stock ++;

    }
}
