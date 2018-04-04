package cl.mauriciocarreno.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuckyAnswer {

    private boolean answer;
    private boolean luckyDay;

    public LuckyAnswer(boolean answer) {
        this.answer = answer;
        luckyDay = new LuckyDate().getAnswerDate();
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    public void setLuckyDay(boolean luckyDay) {
        this.luckyDay = luckyDay;
    }

    private class LuckyDate {

        public boolean getAnswerDate()
        {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");

            int day = Integer.parseInt(simpleDateFormat.format(date));

            if(day % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }

        }

    }
}
