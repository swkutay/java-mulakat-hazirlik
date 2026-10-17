package temeller;

public class Ders2_Kosullar {
    public static void main(String[] args) {

        int score = 72;

        if (score >= 90) {
            System.out.println("Grade : A");
        } else if (score >= 70) {
            System.out.println("Grade : B");
        } else {
            System.out.println("Grade : C");
        }

        String result = score >= 50 ? "Passed" : "Failed";
        System.out.println(result);

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
