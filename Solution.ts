
function findWinningPlayer(skills: number[], targetNumberOfConsequtiveWins: number): number {
    let numberOfWins = 0;
    let indexMaxValue = 0;
    let maxValue = skills[0];
    if (targetNumberOfConsequtiveWins > skills.length) {
        targetNumberOfConsequtiveWins = skills.length;
    }

    for (let i = 1; i < skills.length && numberOfWins < targetNumberOfConsequtiveWins; ++i) {
        if (maxValue < skills[i]) {
            maxValue = skills[i];
            indexMaxValue = i;
            numberOfWins = 1;
        } else {
            ++numberOfWins;
        }
    }

    return indexMaxValue;
};
