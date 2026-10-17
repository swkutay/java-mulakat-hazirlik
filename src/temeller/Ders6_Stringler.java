package temeller;

import java.util.Locale;

public class Ders6_Stringler {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println("java".equalsIgnoreCase(a));


        String text = "hello";
        text.toUpperCase();
        System.out.println(text);
        text = text.toUpperCase();
        System.out.println(text);


        String s = "  Java Developer  ";
        System.out.println(s.length());
        String t = s.trim();
        System.out.println(t.length());
        System.out.println(t.charAt(0));
        System.out.println(t.substring(5));
        System.out.println(t.substring(0, 4));
        System.out.println(t.indexOf("Dev"));
        System.out.println(t.indexOf("James"));
        System.out.println(t.contains("Java"));
        System.out.println(t.startsWith("Java"));
        System.out.println(t.replace("Java", "Spring"));
        System.out.println(t.toLowerCase());
        System.out.println(t.isEmpty());

        String names = "jordan,kobe,bird";
        String[] partNames = names.split(",");
        System.out.println(partNames.length);
        System.out.println(partNames[1]);


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 3; i++) {
            sb.append(i).append(",");
        }
        sb.append("end");
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
    }
}
