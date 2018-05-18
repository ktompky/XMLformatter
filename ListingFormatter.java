package formatter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;


public class ListingFormatter {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		try {
			File fXmlFile = new File("C:\\Users\\Missmeer\\eclipse-workspace\\XMLFormatter\\src\\formatter\\rmls.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			//recommend for parsing Java
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element is : " + doc.getDocumentElement().getNodeName());
			
			
		}
		finally {
			System.out.println("Hope this works!");
		}
	}

}
