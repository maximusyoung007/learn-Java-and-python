package Chapter5;
public class Exercise_04 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        int miles = 1;
        while (miles <= 10) {
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }
    }
}

