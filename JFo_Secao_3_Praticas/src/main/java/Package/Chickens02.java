public class Chickens02 {
    public static void main(String[] args) {
        int mondayEggs = 100, tuesdayEggs = 121, wednesdayEggs = 117;
        double eggProfit = 0.18 ;

        double dailyAverage = (double)(mondayEggs + tuesdayEggs + wednesdayEggs)/3;
        double monthlyAverage = 30*dailyAverage;
        double monthlyProfit = monthlyAverage * eggProfit;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);

    }
    
}
