package OCP;

import java.awt.Color;

public class CircleButton extends AbstractButton {

    //ʵ�ʰ�ťһ Բ�ΰ�ť
    public CircleButton() {
    	
    }
    @Override
    public void InitButton()//��д���෽�� ��ʼ��һ��Բ�ΰ�ť
    {
        this.setText("Բ�ΰ�ť");
        this.setBounds(50,50,120,40);
        this.setBackground(Color.WHITE);
    }
}