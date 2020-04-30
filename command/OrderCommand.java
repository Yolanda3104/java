package command;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	//放两个参数,一个执行者,一个执行目标
	
	public OrderCommand(Operator receiver,Order order) {
		this.receiver = receiver;
		this.order = order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(order.getId() + "号顾客的成品");
		receiver.MakeFruit(order);
	}

}
