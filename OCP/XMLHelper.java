package OCP;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLHelper {

    public XMLHelper() {

    }
    public String getButtonName()
    {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();//实例化一个DocumentBuilderFactory来获取DocumentBuilder
        DocumentBuilder builder=null;
        try {
            builder=factory.newDocumentBuilder();
        }catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        Document document=null;
        try {
            document=builder.parse("OCP.xml");//从指定路径获取XML文件 这里ocp.xml在项目文件夹下
            
        }catch (SAXException e) {
        	e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        NodeList nList=document.getElementsByTagName("ButtonName");//节点名叫“ButtonName” 获取其中的内容
        return nList.item(0).getFirstChild().getNodeValue();//返回其内容
    }
}