public class ChineseRuralDog extends Animal {

    // (boolean 是否注射狂犬病疫苗)
    private boolean isVaccineInjected;

    public ChineseRuralDog(String name, int age, int gender, boolean isVaccineInjected) {
        super(name, age, gender, 100.0,80);
        this.isVaccineInjected = isVaccineInjected;
    }
    @Override
    public String toString() {

        String str;
        str = "这是一只中华田园犬\n名字：" + super.getName() + "\n年龄：" + super.getAge() + "\n" + "性别：";
        if (super.getGender() == 0)
            str += "雌性";
        else if (super.getGender() == 1) {
            str += "雄性";
        } else if (super.getGender() == 2) {
            str += "被嘎蛋的雄性";
        }
        str += "\n售价：" + super.getPrice() +"\n进价: " + super.getPurchasingCost() + "\n疫苗情况：";
        if (isVaccineInjected)
            str += "已打";
        else
            str += "未打";

        return str;
    }
    // 打疫苗
    public void vaccinate(){
        if(!isVaccineInjected){
            isVaccineInjected = true;
            System.out.println("恭喜主人成功给"+super.getName()+"打疫苗");
        }else
            System.out.println(super.getName()+"已经打过疫苗了，无需再打疫苗");
    }
}
