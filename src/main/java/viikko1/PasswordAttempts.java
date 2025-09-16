package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String oikeaSalasana = "java123";
        int maxYritykset = 3;
        for (int i = 0; i < tries.length && i < maxYritykset; i++) {
            if (oikeaSalasana.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}