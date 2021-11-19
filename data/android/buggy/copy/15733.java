private void normalizeUserFrequency() {
    double normalizeDivision = 1;
    dictionaryFrequencyPercentage += (userFrequencyPercentage) * ((dictionaryFrequencyPercentage) / normalizeDivision);
    userActualityPercentage += (userFrequencyPercentage) * ((userActualityPercentage) / normalizeDivision);
    userFrequencyPercentage = 0;
}