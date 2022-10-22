package GroupProject2;

public class Task3 {
    public static void main(String[] args) {
    Truck truck = new Truck(50000, 1000, 1900);
        System.out.println("Truck price with discount is "+truck.calculateSalePrice());
    Sedan sedan = new Sedan(32000, 500, 15);
        System.out.println("Sedan price with discount is "+sedan.calculateSalePrice());
    }
}
class Car {
    double carPrice;
    double color;
    Car (double carPrice, double color) {
        this.carPrice=carPrice;
        this.color=color;
    }
     double calculateSalePrice(){
        double price=carPrice+color;
        return price;
     }
}
class Truck extends Car {
    double weight;

    Truck(double carPrice, double color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        double price = carPrice+color;
        double discount = 0;
        if (weight > 2000) {
            return discount=((price)-(price*.1));
        }else {
            return discount=((price)-(price*.2));
        }
    }
}
class Sedan extends Car{
    double length;

    Sedan(double carPrice, double color, double length) {
        super(carPrice, color);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        double price=carPrice+color;
        double discount =0;
        if(length>20){
            return discount=((price)-(price*.05));
        } else {
            return discount=((price)-(price*.1));
        }
    }
}

    /*
    Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
     */