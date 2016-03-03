package local.ah.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by ahumphr on 03/03/16.
 */
@XmlRootElement
public class Address {
    private String street;
    private int houseNumber;
    private String town;

    public String getStreet() {
        return street;
    }

    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    @XmlElement
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getTown() {
        return town;
    }

    @XmlElement
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", town='" + town + '\'' +
                '}';
    }
}
