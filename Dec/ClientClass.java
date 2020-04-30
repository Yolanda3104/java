package Dec;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBirthdayCake birthdayCake = new Cake();
		birthdayCake.Show();
		Cream cream = new Cream(birthdayCake);
		cream.PutCream();
		Fruit fruit = new Fruit(cream);
		fruit.PutFruit();
		fruit.Show();
	}

}
