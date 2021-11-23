boolean addChicken(com.examples.one.petstore.Chicken c) {
    if ((chickens.size()) < 10) {
        chickens.add(c);
        return true;
    }else {
        java.lang.System.out.println("Error: too many chickens");
        return false;
    }
}