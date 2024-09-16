public class Dog extends Animal{
    protected boolean isVaccineInjected;

    public boolean getVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        this.isVaccineInjected = vaccineInjected;
    }


    public String toString(){
        return "Dog:"+"\n"+"name:"+name+"\n"+"age:"+age+"\n"+"sex"+sex+"\n"+"price:100"+"\n"+"isVaccineInjected:"+isVaccineInjected;
    }
    public Dog(char sex,int age,String name,boolean isVaccineInjected){
        super(100,sex,age,name);
        this.isVaccineInjected=isVaccineInjected;
    }

}
