package command;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������
		Order order1 = new Order();
		order1.setId(1);
		order1.setFruitmap("����", 1);
		order1.setFruitmap("����", 2);
		order1.setFruitmap("ƻ��", 3);
		
		Order order2 = new Order();
		order2.setId(2);
		order2.setFruitmap("�㽶", 1);
		order2.setFruitmap("â��", 2);
		order2.setFruitmap("����", 3);
		//����������
		Operator op = new Operator();
		//�����������װ���������
		OrderCommand cmd1 = new OrderCommand(op,order1);
		OrderCommand cmd2 = new OrderCommand(op,order2);
		//���������߲�������
		WaiterInvoker waiter = new WaiterInvoker();
		waiter.SetCommand(cmd1);
		waiter.SetCommand(cmd2);
		//ִ������
		waiter.OrderUp();
	}

}
