package Ite;

public class Client {
	
	public static void display(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("电视机频道:");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkyworthTelevision tv1 = new SkyworthTelevision();
		TCLTelevision tv2 = new TCLTelevision();
		display(tv1);
		display(tv2);
	}

}
