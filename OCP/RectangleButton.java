package OCP;

import java.awt.Color;

public class RectangleButton extends AbstractButton {

    //ʵ�ʰ�ťһ ���ΰ�ť
    public RectangleButton() {

    }
    @Override
    public void InitButton()//��д���෽�� ��ʼ��һ�����ΰ�ť
    {
        this.setText("���ΰ�ť");
        this.setBounds(50,50,120,40);
        this.setBackground(Color.YELLOW);
    }

}
