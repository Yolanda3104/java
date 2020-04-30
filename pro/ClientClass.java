package pro;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruit fru1 = new Apple();
//		MyFruit fru2 = fru1;
		MyFruit fru2 = (Apple)fru1.clone();
		fru1.Display();
		fru2.Display();
		System.out.println("fru1:" + fru1.hashCode());
		System.out.println("fru2:" + fru2.hashCode());
		System.out.println("fru1:" + fru1.toString());
		System.out.println("fru2:" + fru2.toString());
		System.out.println(fru1 == fru2);
		
////////////////////////////////////////////////////////////////
		
		MyFruit fru3 = new Apple();
		MyFruit fru4 = new Banana();
		MyFruitStore mfs1 = MyFruitStore.Getfruitstore();
		mfs1.Add(3, fru3);
		mfs1.Add(4, fru4);
		mfs1.Add(5, new Apple());
		mfs1.Add(6, new Banana());
		MyFruitStore mfs2 = MyFruitStore.Getfruitstore();
		
		MyFruit fru = (MyFruit)mfs1.Get(5);
		fru.Display();
		System.out.println("mfs1:" + mfs1.toString());
		System.out.println("mfs2:" + mfs2.toString());
		
	}

}
