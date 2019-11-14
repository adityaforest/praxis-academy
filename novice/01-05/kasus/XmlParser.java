import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XmlParser
{
    public static void main (String[] args)
    {
        try {
            File inputFile = new File("input.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            //System.out.println("Root element :" + document.getRootElement().getName());
            Element classElement = document.getRootElement();
            List<Element> studentList = classElement.getChildren();

            Element student = studentList.get(temp);
            System.out.println("\nCurrent Element :" 
               + student.getName());
            // Attribute attribute =  student.getAttribute("rollno");
            // System.out.println("Student roll no : " 
            //    + attribute.getValue() );
            System.out.println("First Name : "
               + student.getChild("first_name").getText());
            System.out.println("Last Name : "
               + student.getChild("last_name").getText());
            System.out.println("Location : "
               + student.getChild("location").getText());
            System.out.println("Online : "
               + student.getChild("online").getText());

        } catch(JDOMException e) {
            e.printStackTrace();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
    }
}
