@java.lang.Override
public int compare(uowtt.ttapplication.Player player, uowtt.ttapplication.Player t1) {
    if (((player.wins) + (player.losses)) < ((t1.wins) + (t1.losses)))
        return 1;
    else
        return -1;
    
}