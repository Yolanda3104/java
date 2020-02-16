package OCP;

import java.awt.Color;

public class CircleButton extends AbstractButton {

    //实际按钮一 圆形按钮
    public CircleButton() {
    	
    }
    @Override
    public void InitButton()//重写父类方法 初始化一个圆形按钮
    {
        this.setText("圆形按钮");
        this.setBounds(50,50,120,40);
        this.setBackground(Color.WHITE);
    }
}