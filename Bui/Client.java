package Bui;

import Vis.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��̬ȷ���ײ�����
		MealBuilder mb = (MealBuilder)XMLUtil.getBean();
		//����Ա��ָ����
		KFCWaiter waiter = new KFCWaiter();
		//����Ա׼���ײ�
		waiter.setMealBuilder(mb);
		//�ͻ�����ײ�
		Meal meal = waiter.construct();
		
		System.out.println("�ײ����:");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
