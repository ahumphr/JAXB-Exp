package local.ah.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@XmlRootElement(namespace = "de.vogella.xml.jaxb.model")
@XmlType(propOrder = {"name", "age", "address", "orders"})
public class Customer {

    private int id;
    private int age;
	private String name;
    private Address address;
    private List<Order> orders;

    public Customer() {
        this.orders =  new ArrayList<Order>();
    }

    public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @XmlElementWrapper(name = "orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", address=" + address +
                ", orders=" + orders +
                '}';
    }
}
