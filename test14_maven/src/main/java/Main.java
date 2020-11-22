import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String loveMaven = "i love maven!";
        System.out.println(loveMaven);
        System.out.println(StringUtils.capitalize("maven"));
        String s = StringUtils.upperCase(loveMaven);
        System.out.println(s);

        List<String> stringList = new ArrayList<String>();

        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        stringList.add("Test4");
        stringList.forEach(System.out::println);
    }
}
