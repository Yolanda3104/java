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
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();//ʵ����һ��DocumentBuilderFactory����ȡDocumentBuilder
        DocumentBuilder builder=null;
        try {
            builder=factory.newDocumentBuilder();
        }catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        Document document=null;
        try {
            document=builder.parse("OCP.xml");//��ָ��·����ȡXML�ļ� ����ocp.xml����Ŀ�ļ�����
            
        }catch (SAXException e) {
        	e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        NodeList nList=document.getElementsByTagName("ButtonName");//�ڵ����С�ButtonName�� ��ȡ���е�����
        return nList.item(0).getFirstChild().getNodeValue();//����������
    }
}