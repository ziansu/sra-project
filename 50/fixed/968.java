public void map() {
    for (com.mycompany.a1.GameObject item : GameObjects) {
        if (item instanceof com.mycompany.a1.GameObject) {
            java.lang.System.out.println(((com.mycompany.a1.GameObject) (item)).toString());
        }
    }
    java.lang.System.out.println();
}