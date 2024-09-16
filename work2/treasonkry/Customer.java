import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Customer {
    private String name;
    private int time;
    private LocalDate latestTime;
    private ArrayList<Animal> buyAnimal = new ArrayList<Animal>();
    public String toString(){
        return "顾客姓名："+name+"\n"+"到店次数："+time+"\n"+"最新到店时间："+latestTime;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public LocalDate getLatestTime() {
        return latestTime;
    }

    public ArrayList<Animal> getBuyAnimal() {
        return buyAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLatestTime(LocalDate latestTime) {
        this.latestTime = latestTime;
    }

    public void setBuyAnimal(ArrayList<Animal> buyAnimal) {
        this.buyAnimal = buyAnimal;
    }
}
