
#include <vector>
using namespace std;

class Solution {

public:
    int findWinningPlayer(vector<int>& skills, int targetNumberOfConsequtiveWins) {
        int numberOfWins = 0;
        int indexMaxValue = 0;
        int maxValue = skills[0];
        if (targetNumberOfConsequtiveWins > skills.size()) {
            targetNumberOfConsequtiveWins = skills.size();
        }

        for (int i = 1; i < skills.size() && numberOfWins < targetNumberOfConsequtiveWins; ++i) {
            if (maxValue < skills[i]) {
                maxValue = skills[i];
                indexMaxValue = i;
                numberOfWins = 1;
            }
            else {
                ++numberOfWins;
            }
        }

        return indexMaxValue;
    }
};
