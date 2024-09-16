import java.time.LocalDate;
import java.util.ArrayList;
public class MyAnimalShop implements AnimalShop{
	private double balance;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private boolean isOpened;
		private double dailyProfit = 0;
		public MyAnimalShop(double balance, boolean isOpened) {
		super();
		this.balance = balance;
		this.isOpened = isOpened;
	}
	@Override
	public void buyAnimal(Animal animal) {
		try{
			if(balance >= animal.price) {
				balance -= animal.price;
				animals.add(animal);
				System.out.println("�ɹ�����" + animal.name + ",����" + animal.price + "Ԫ��ʣ�����" + balance + "Ԫ");
				dailyProfit -= animal.price;
			}else {
				throw new InsufficientBalanceException("����");
			}
		}catch(InsufficientBalanceException ibe) {
			System.out.println(ibe.toString());
		}
	}
	@Override
	public void entertainCustomer(Customer customer) {
		try{
			if(!isOpened) {
				System.out.println("����������Ъҵ");
				return;
			}
			if(animals.size() != 0) {
				boolean isNew = true;
				for (Customer i : customers) {
					if(customer.getName() == i.getName()) {
						isNew = false;
					}
				}
				if(isNew) {
					customers.add(customer);
				}
				customer.setTime(customer.getTime() + 1);
                customer.setLastArrivalTime(LocalDate.now());
				int num = (int) (Math.random() * animals.size());
				balance += animals.get(num).price + 50;
				dailyProfit += animals.get(num).price + 50;//�۳��۸�Ƚ����۸�ͳһ�߳�50Ԫ
				System.out.println("�ɹ��۳�" + animals.get(num).name + ",���" + (animals.get(num).price + 50) + "Ԫ��ʣ�����" + balance + "Ԫ");
				System.out.println("�۳�������Ϣ��" + animals.get(num).toString());
				animals.remove(num);
			}else {
				throw new AnimalNotFountException("�����޳�����۳�");
			}
		}catch(AnimalNotFountException anfe) {
			System.out.println(anfe.toString());
		}
	}
	@Override
	public void close() {
		System.out.println("���չ˿ͣ�");
		for (Customer i : customers) {
			System.out.println(i.toString());
		}
		System.out.println("��������" + dailyProfit);
	}
	
}
