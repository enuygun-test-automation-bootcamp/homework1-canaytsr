public class AbstractMain {
    public static void main(String[] args) {
        //Car car = new Car(); // abstract method'dan interface gibi  obje oluşmaz
        Car car1 = new Mercedes(); //mercedes tipinde 0bje oluşturma
        car1.brand();
        car1.price();
        System.out.println("***************************");

        Mercedes mercedes = new Mercedes();// mercedes tipinde 0bje oluşturma
        mercedes.brand();
        mercedes.price();
        System.out.println("***************************");

        Car car2 = new Bmw();//bmw tipinde 0bje oluşturma
        car2.brand();
        car2.price();
        System.out.println("***************************");

        Bmw bmw = new Bmw();//bmw tipinde 0bje oluşturma
        bmw.brand();
        bmw.price();
        System.out.println("***************************");
    }
}
