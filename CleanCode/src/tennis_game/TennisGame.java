package tennis_game;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int mFirstScore, int mSecondScore) {
        String score = "";
        int tempScore = 0;
        if (mFirstScore == mSecondScore)
        {
            switch (mFirstScore)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (mFirstScore >= 4 || mSecondScore >=4)
        {
            int minusResult = mFirstScore - mSecondScore;
            switch (minusResult) {
                case 1:
                    score ="Advantage player1";
                    break;
                case -1:
                    score ="Advantage player2";
                    break;
                case 2:
                    score = "Win for player1";
                    break;
                default:
                    score ="Win for player2";
                    break;
            }
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = mFirstScore;
                else { score +="-"; tempScore = mSecondScore;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
