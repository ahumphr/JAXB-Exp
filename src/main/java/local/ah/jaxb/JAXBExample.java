package local.ah.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class JAXBExample {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("Aiden");
        customer.setAge(29);

        Address address = new Address();
        address.setHouseNumber(11);
        address.setStreet("Highstreet");
        address.setTown("Bromborough");
        customer.setAddress(address);

        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setOrderItem("Book 1");
        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setOrderItem("Book 2");

        customer.setOrders(Arrays.asList(new Order[]{order1, order2}));

        try {

            File file = new File("./src/main/resources/customer.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
