public boolean add(abdjekt.Item object) {
    if (checkMax(1)) {
        java.lang.System.out.println("The world is full, please remove or destroy an object.");
        return false;
    }else {
        world.add(object);
        return true;
    }
}