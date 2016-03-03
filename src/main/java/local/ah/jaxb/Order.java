package local.ah.jaxb;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by ahumphr on 03/03/16.
 */
@XmlRootElement
public class Order {

    private int orderId;
    private String orderItem;

    public int getOrderId() {
        return orderId;
    }

    @XmlTransient
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItem='" + orderItem + '\'' +
                '}';
    }
}
