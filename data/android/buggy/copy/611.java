public void add(abdjekt.Item object) {
    world.add(object);
    if (checkMax(1)) {
        java.lang.System.out.println("The world is full, please remove or destroy an object.");
    }
}