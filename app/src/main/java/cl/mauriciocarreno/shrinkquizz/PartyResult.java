package cl.mauriciocarreno.shrinkquizz;

public class PartyResult extends PartyAnswer {


    public PartyResult(String answer) {
        super(answer);
    }

    private String processing() {
        String answer = getAnswer();

        if (answer.contains("5")) {
            return "Eres un niño";
        } else if (answer.contains("10")) {
            return "Bien, dale campeón";
        } else {
            return "Consigue Ayuda";
        }
    }

    public String score()
    {
        return processing();
    }

}
