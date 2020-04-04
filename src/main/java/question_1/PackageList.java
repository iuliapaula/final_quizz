package question_1;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Pack;

import java.util.ArrayList;
import java.util.List;

public class PackageList {
    private List<Package> packageList = new ArrayList<>();



    public int getGroupValue () {
        int n = packageList.size();
        int groupValue = 0;
        for (Package aPackage : packageList) {
            groupValue += aPackage.getPackageValue();
        }
        return groupValue;
    }

    public int getGroupRevenue () {
        int n = packageList.size();
        int groupRevenue = 0;
        for (Package aPackage : packageList) {
            groupRevenue += aPackage.getDistanceInKm();
        }
        return groupRevenue;
    }

    public PackageList(List<Package> packageList) {
        this.packageList = packageList;
    }

}
