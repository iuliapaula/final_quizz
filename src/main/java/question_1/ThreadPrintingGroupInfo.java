package question_1;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Pack;

import java.util.List;

public class ThreadPrintingGroupInfo extends Thread {
    public List<Package> packageGroup;

    public ThreadPrintingGroupInfo(List<Package> packageGroup) {
        this.packageGroup = packageGroup;
    }

    @Override
    public void run() {
        Package firstPackage = packageGroup.get(0);
//        PackageList group = new PackageList(packageGroup);
        System.out.println("[Delivering for <" +
                firstPackage.getLocation() +
                "> and date <" +
                firstPackage.getDeliveryDate() +
                "> in <" +
                firstPackage.getDistanceInKm() +
                "> seconds]");
//                + " value " + group.getGroupValue() + " revenue " + group.getGroupRevenue());

        try {
            Thread.sleep(firstPackage.getDistanceInKm() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
