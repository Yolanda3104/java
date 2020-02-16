package OCP;
import javax.swing.*;
public abstract class AbstractButton extends JButton {

    //设计抽象类 满足所有按钮的需求
    public AbstractButton() {

    }
    public abstract void InitButton();//抽象方法没有方法体 且子类必须重写
}
