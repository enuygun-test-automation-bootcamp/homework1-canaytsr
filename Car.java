public abstract class Car {
    public void year(){ //araba üretim yılı
        System.out.println("Year of production : 2013");

    }
    public void wheel(){ //araba tekerlek sayısı
        System.out.println("Number of wheels : 4");

    }
    abstract void price();//araba fiyatı her araç için farklı
    abstract void brand();//araba markası her araç için farklı

}
