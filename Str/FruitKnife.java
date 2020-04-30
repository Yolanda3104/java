package Str;

public class FruitKnife implements ICutFruit {

	@Override
	public void CutStrategy(String fruitname) {
		// TODO Auto-generated method stub
		System.out.println(fruitname + "一次被切成一片");
	}

}
