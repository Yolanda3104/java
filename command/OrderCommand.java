package command;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	//����������,һ��ִ����,һ��ִ��Ŀ��
	
	public OrderCommand(Operator receiver,Order order) {
		this.receiver = receiver;
		this.order = order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(order.getId() + "�Ź˿͵ĳ�Ʒ");
		receiver.MakeFruit(order);
	}

}
