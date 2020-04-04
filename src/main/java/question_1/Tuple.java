package question_1;

import java.util.Objects;

public class Tuple {
    private String location;
    private String deliveryDate;

    public Tuple(String location, String deliveryDate) {
        this.location = location;
        this.deliveryDate = deliveryDate;
    }

    public String getLocation() {
        return location;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, deliveryDate);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Objects.equals(location, ((Tuple) o).getLocation()) && Objects.equals(deliveryDate, ((Tuple) o).getDeliveryDate());
    }
}
