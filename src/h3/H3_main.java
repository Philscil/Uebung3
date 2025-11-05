package h3;

public class H3_main {
    public static void main (String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 2;

        boolean istVoll = false;

        if ((max > fix) && wartend > 0) {
            if (wartend >= max - fix) {
                wartend = wartend - (max - fix);
                fix = max;
                istVoll = true;
            } else {
                fix = fix + wartend;
                wartend = 0;
                istVoll = false;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Fix: " + fix);
        System.out.println("Wartend: " + wartend);
        System.out.println("Ist Voll: " + istVoll);
    }
}
