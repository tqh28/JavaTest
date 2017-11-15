package debugXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Root.class);

						
		// Root root = (Root) unmarshaller.unmarshal(xml);
		Root root = new Root();
		
//		root.f
		
		String name = "<h1>kshitij</h1>";
		String surname = "<h1>solanki</h1>";
		String id = "<h1>1</h1>";

		root.setId(id);
		root.setName(name);
		root.setSurname(surname);

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(root, System.out);
	}

}
