package h1;

public class H1_main {
    public static void main (String[] args) {
        double guthaben = -100;
        double monEingang = 200;

        int rating = -2;
        
        boolean warnhinweis = false;
        boolean negativ = false;

        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }

        if (guthaben > 0) {
            rating = rating +3;
        }

        if (guthaben == 0) {
            rating = rating + 2;
        }

        if (guthaben < 0 && monEingang >= (-guthaben)) {
            rating = rating + 1;
        }
        
        if (guthaben < 0 && monEingang <= (-guthaben)) {
            rating = rating - 1;
        }

        if (guthaben < 0 && monEingang <= (-guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        System.out.println("Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Warnhinweis: " + warnhinweis);
        System.out.println("Negativ: " + negativ);
    }
}
