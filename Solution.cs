
using System;

public class Solution
{
    public int FindWinningPlayer(int[] skills, int targetNumberOfConsequtiveWins)
    {
        int numberOfWins = 0;
        int indexMaxValue = 0;
        int maxValue = skills[0];
        if (targetNumberOfConsequtiveWins > skills.Length) {
            targetNumberOfConsequtiveWins = skills.Length;
        }

        for (int i = 1; i < skills.Length && numberOfWins < targetNumberOfConsequtiveWins; ++i)
        {
            if (maxValue < skills[i])
            {
                maxValue = skills[i];
                indexMaxValue = i;
                numberOfWins = 1;
            }
            else
            {
                ++numberOfWins;
            }
        }

        return indexMaxValue;
    }
}
