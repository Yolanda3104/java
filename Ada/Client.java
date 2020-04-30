package Ada;

import pro.Apple;
import pro.Banana;
import pro.MyFruit;
import pro.MyFruitStore;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruit fru3 = new Apple();
		MyFruit fru4 = new Banana();
		MyFruitStore mfs1 = MyFruitStore.Getfruitstore();
		mfs1.Add(3, fru3);
		mfs1.Add(4, fru4);
		mfs1.Add(5, new Apple());
		mfs1.Add(6, new Banana());
		InewJuicer newJuicer = new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(3), mfs1.Get(4)));
	}

}
