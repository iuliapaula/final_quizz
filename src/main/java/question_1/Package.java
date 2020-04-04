package question_1;

import java.time.LocalDate;

public class Package {
    private String location;
    private int distanceInKm;
    private int packageValue;
    private String deliveryDate;
//    private Tuple deliveryLocationAndDate = new Tuple();

    public Package(String location, int distanceInKm, int packageValue, String deliveryDate) {
        this.location = location;
        this.distanceInKm = distanceInKm;
//        deliveryLocationAndDate.setDeliveryDate(deliveryDate);
//        deliveryLocationAndDate.setLocation(location);
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

//    public Tuple getDeliveryLocationAndDate() {
//        return deliveryLocationAndDate;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public int getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(int packageValue) {
        this.packageValue = packageValue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Package {" +
                "location: " + this.location +
                " distance in km" + this.distanceInKm +
                " package value" + this.packageValue +
                " delivery date" + this.deliveryDate +
                "}";
    }
}
