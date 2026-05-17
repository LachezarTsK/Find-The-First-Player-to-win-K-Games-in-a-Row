
public class Solution {

    public int findWinningPlayer(int[] skills, int targetNumberOfConsequtiveWins) {
        int numberOfWins = 0;
        int indexMaxValue = 0;
        int maxValue = skills[0];
        if (targetNumberOfConsequtiveWins > skills.length) {
            targetNumberOfConsequtiveWins = skills.length;
        }

        for (int i = 1; i < skills.length && numberOfWins < targetNumberOfConsequtiveWins; ++i) {
            if (maxValue < skills[i]) {
                maxValue = skills[i];
                indexMaxValue = i;
                numberOfWins = 1;
            } else {
                ++numberOfWins;
            }
        }

        return indexMaxValue;
    }
}
