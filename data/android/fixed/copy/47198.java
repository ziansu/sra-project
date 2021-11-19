public boolean isModActive(game.Mod m) {
    for (game.Mod mod : mods)
        if (m == mod)
            return true;
        
    
    return false;
}