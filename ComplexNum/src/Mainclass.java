
public class Mainclass extends Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ��������ʵ�����鲿��");
		Complex data1=new Complex();
		System.out.println("������ڶ���������ʵ�����鲿��");
		Complex data2=new Complex();
		Complex result_add=data1.add(data2);
		Complex result_sub=data1.sub(data2);
		Complex result_mul=data1.mul(data2);
		Complex result_div=data1.div(data2);
		result_add.print();
		result_sub.print();
		result_mul.print();
		result_div.print();

	}

}
