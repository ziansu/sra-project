public double getAge(java.util.Calendar compare) {
    double age = ChronoUnit.MINUTES.between(delivered, compare);
    age = age / 60;
    return age;
}