package While_Loop;

public class Main {
    public static void main(String[] args){
        int depositePound = 10000;
        int currentDay = 0;
        double minChangeRate = 1.15;
        int poundsForDay = 1000;


        while (depositePound >0){
            double changeRateForDay = 1 + (Math.random() * 0.2);
            currentDay++;
            if(changeRateForDay >= minChangeRate){
                depositePound = depositePound - poundsForDay ;
                System.out.println("Oggi il changerate è ottimo");
            } else {
                System.out.println("Il change rate è troppo basso per vendere");
            }

        }
        System.out.println(currentDay + "  è il totale dei giorni passati");
    }
}
