public void updateWholesale(double energy, double amount) {
    energy *= 1000;
    amount *= energy;
    wholesale.updateValues(energy, amount);
}