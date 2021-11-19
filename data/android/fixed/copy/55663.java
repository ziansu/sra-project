public void tryOpeningTheDoors() {
    if ((enemies.size()) == 0)
        for (robokill.Door door : doors)
            door.open();
        
    
}