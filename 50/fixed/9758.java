@java.lang.Override
public zombiewar.intf.ICharacter make(java.lang.String type) {
    if (type == "soldier")
        return new zombiewar.impl.Soldier();
    else
        if (type == "tank")
            return new zombiewar.impl.Tank();
        else
            return null;
        
    
}