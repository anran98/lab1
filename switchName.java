import java.util.ArrayList;

public class switchName {
    private static String switchFirstLast(String name) {
        if (name.length() <= 1) {
            return name;
        }
        char first = Character.toUpperCase(name.charAt(name.length() - 1));
        char last = Character.toLowerCase(name.charAt(0));
        String middle = name.substring(1, name.length() - 1);

        return first + middle + last;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Becca");
        names.add("Luke");
        names.add("John");
        names.add("Zoe");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchFirstLast(name));
        }

        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names (switched) = { " + String.join(", ", switchedNames) + " }");
    }
}
