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
         setLayout(null);//绝对布局
    }
    //面板容器添加控件
    public void showControl() throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        XMLHelper xmlHepler=new XMLHelper();
        String btnName=xmlHepler.getButtonName();
        Container container=getContentPane();
        button=(AbstractButton)Class.forName(btnName).newInstance();//根据名字来实例化对应的按钮
        button.InitButton();
        container.add(button);
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

    	new LoginForm().showControl();
    }

}
