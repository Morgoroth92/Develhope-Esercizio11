import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("Pisa", "Madrid", "Parigi");

        cityNames.set(1, "Tegucigalpa");

        System.out.println("cityNames: " + cityNames);


        List<String> kingsOfRome = new ArrayList<String>();


        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");


        System.out.println("kingsOfRome: " + kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("kingsOfRomeArray: " + Arrays.toString(kingsOfRomeArray));
    }
}
