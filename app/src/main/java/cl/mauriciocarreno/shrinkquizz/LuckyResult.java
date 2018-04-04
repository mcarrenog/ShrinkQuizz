package cl.mauriciocarreno.shrinkquizz;

public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean answer) {
        super(answer);
    }

    private String processingAnswer() {
        if (isAnswer()) {
            return "Esas es la actitud!";
        } else {
            return "Anímate! ";
        }
    }

    private String processingLuckyDay() {

        if (isLuckyDay()) {
            return "y es tu día de suerte!";
        } else {
            return "vendrán mejores tiempos :)";
        }
    }

    public String result()
    {
        return processingAnswer() + " " + processingLuckyDay();
    }

}
