public void up() {
    if (d7.get()) {
        elevTalon.set(1);
    }else {
        elevTalon.set(0);
    }
}