private boolean casellaLibera(com.example.andrea.starship_battle.model.Casella c) {
    if (c.getOccupata()) {
        return false;
    }
    return true;
}