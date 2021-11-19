public void tick() {
    java.lang.System.out.println("--------------------------");
    listAircraft();
    for (int i = 0; i < (e.size()); i++) {
        e.get(i).tick();
    }
}