
class Solution {

    fun findWinningPlayer(skills: IntArray, targetNumberOfConsequtiveWins: Int): Int {
        var numberOfWins = 0
        var indexMaxValue = 0
        var maxValue = skills[0]
        var targetNumberOfConsequtiveWins = if (targetNumberOfConsequtiveWins >= skills.size)
            skills.size else targetNumberOfConsequtiveWins

        var i = 1
        while (i < skills.size && numberOfWins < targetNumberOfConsequtiveWins) {
            if (maxValue < skills[i]) {
                maxValue = skills[i]
                indexMaxValue = i
                numberOfWins = 1
            } else {
                ++numberOfWins
            }
            ++i
        }

        return indexMaxValue
    }
}
