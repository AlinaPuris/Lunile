package enumeration;

public class Enumeration {
    // public static void enumeration(){
    enum Months {
        Ianuarie, Februarie, Martie, Aprilie, Mai, Iunie, Iulie, August, Septembrie, Octombrie, Noiembrie, Decembrie
    }
    public void enumeration() {

        for(Months months: Months.values()) {
            System.out.println(months.name());
        }
    }
}
