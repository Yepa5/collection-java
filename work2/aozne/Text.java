public class Text {
    public static void main(String[] args){
        Animal dog1=new ChineseRuralDog("dog1",2,"male",200,100);
        Animal dog2=new ChineseRuralDog("dog2",3,"female",300,150);
        Animal dog3=new ChineseRuralDog("dog3",2,"male",200,100);
        Animal cat1=new Cat("CAT1",3,"female",100,50);
        Animal cat2=new Cat("CAT2",1,"female",100,50);
        Animal cat3=new Cat("CAT3",2,"female",100,50);
        AnimalShop animalShop=new MyAnimalShop(2000,false);
        animalShop.purchase(dog1,1);
        animalShop.purchase(dog2,2);
        animalShop.purchase(cat1,1);
        animalShop.purchase(cat2,1);
        animalShop.purchase(cat3,1);
        System.out.println("*********这是一条分界线**********" );
        Customer c1=new Customer("xiaohong",1);
        Customer c2=new Customer("HAHHAA",2);
        animalShop.hello(c1);
        animalShop.hello(c2);
        animalShop.closeAnimalShop(animalShop);
        animalShop.hello(c2);
        System.out.println("*********这是一条分界线**********" );
        AnimalShop animalShop1=new MyAnimalShop(1000,false);
        animalShop1.purchase(dog1,2);
        animalShop1.purchase(cat1,1);
        animalShop1.closeAnimalShop(animalShop1);






    }
}
