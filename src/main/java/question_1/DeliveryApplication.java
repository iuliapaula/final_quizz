package question_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeliveryApplication {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "question_1" + File.separator + "input_data.csv";

        List<Package> packageList = Files.lines(Paths.get(path))
                .map(i -> new Package(i.split(",")[0],
                        Integer.parseInt(i.split(",")[1]),
                        Integer.parseInt(i.split(",")[2]),
                        i.split(",")[3]))
                .collect(Collectors.toList());
//        packageList.forEach(System.out::println);
        Map<Tuple, List<Package>> packageListGrouped = packageList.stream().collect(Collectors.groupingBy(i -> new Tuple(i.getLocation(), i.getDeliveryDate())));
        int nbOfThreads = packageListGrouped.keySet().size();
//        for (Tuple tuple : packageListGrouped.keySet()) {
//            Package firstPackage = packageListGrouped.get(tuple).get(0);
//            System.out.println("[Delivering for <" +
//                    firstPackage.getLocation() +
//                    "> and date <" +
//                    firstPackage.getDeliveryDate() +
//                    "> in <" +
//                    firstPackage.getDistanceInKm() +
//                    "> seconds]");
//        }

        for (Tuple tuple : packageListGrouped.keySet()) {
            List<Package> packageGroup = packageListGrouped.get(tuple);
            ThreadPrintingGroupInfo thread = new ThreadPrintingGroupInfo(packageGroup);
            thread.start();
        }

        int packageValueTotal = packageList.stream()
                    .map(Package::getPackageValue)
                    .reduce(0, Integer::sum);
        int totalRevenues = packageList.stream()
                                        .map(Package::getDistanceInKm)
                                        .reduce(0, Integer::sum);
        System.out.println("Total value of all delivered packages: " + packageValueTotal);
        System.out.println("Total value of the revenue computed for all groups delivered: " + totalRevenues);

    }
}
