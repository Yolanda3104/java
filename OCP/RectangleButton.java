package OCP;

import java.awt.Color;

public class RectangleButton extends AbstractButton {

    //实际按钮一 矩形按钮
    public RectangleButton() {

    }
    @Override
    public void InitButton()//重写父类方法 初始化一个矩形按钮
    {
        this.setText("矩形按钮");
        this.setBounds(50,50,120,40);
        this.setBackground(Color.YELLOW);
    }

}
