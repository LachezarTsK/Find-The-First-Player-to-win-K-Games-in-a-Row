
package main

func findWinningPlayer(skills []int, targetNumberOfConsequtiveWins int) int {
    numberOfWins := 0
    indexMaxValue := 0
    maxValue := skills[0]
    if targetNumberOfConsequtiveWins > len(skills) {
        targetNumberOfConsequtiveWins = len(skills)
    }

    var i = 1
    for i < len(skills) && numberOfWins < targetNumberOfConsequtiveWins {
        if maxValue < skills[i] {
            maxValue = skills[i]
            indexMaxValue = i
            numberOfWins = 1
        } else {
            numberOfWins++
        }
        i++
    }

    return indexMaxValue
}
