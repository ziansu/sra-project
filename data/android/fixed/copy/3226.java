public void updateWholesale(double energy, double amount) {
    wholesale.updateValues((energy * 1000), (amount * (java.lang.Math.abs(energy))));
}