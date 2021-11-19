public void tryOpeningTheDoors() {
    java.lang.System.out.println("try opening the doors.");
    java.lang.System.out.println(enemies.size());
    if ((enemies.size()) == 0)
        for (robokill.Door door : doors)
            door.open();
        
    
}