private double calcConsumption(java.util.List<com.jungbluth.johannes.petroltracker.data.PetrolData> petrolData) {
    double avgLiter = calcAvgLiter(petrolData);
    double avgDrivenKilometers = calcAvgDrivenKilometers(petrolData);
    return (avgLiter * 100.0) / avgDrivenKilometers;
}