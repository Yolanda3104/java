package OCP;
import java.awt.Container;

import javax.swing.*;
import javax.swing.AbstractButton;
public class LoginForm extends JFrame{

    private AbstractButton button=null;
    private XMLHelper xmlHepler=null;
    public LoginForm() {
         setTitle("OCP");
         setVisible(true);
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setBounds(0,0,200,200);
         setLayout(null);//���Բ���
    }
    //���������ӿؼ�
    public void showControl() throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        XMLHelper xmlHepler=new XMLHelper();
        String btnName=xmlHepler.getButtonName();
        Container container=getContentPane();
        button=(AbstractButton)Class.forName(btnName).newInstance();//����������ʵ������Ӧ�İ�ť
        button.InitButton();
        container.add(button);
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

    	new LoginForm().showControl();
    }

}
