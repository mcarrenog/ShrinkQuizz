package cl.mauriciocarreno.shrinkquizz;

public class MatchResult extends MatchAnswer {

    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    private String calculateMatch() {
        int userAge = getUserAge();
        int loverAge = getLoverAge();

        if (userAge > loverAge && (loverAge > 18)) {
            return "Voh dale!, es mayor de edad";
        } else if (loverAge < 18) {
            return "Aló PDI?";
        } else {
            return "¿Por qué no?";
        }
    }

    public String result() {
        return calculateMatch();
    }
}
