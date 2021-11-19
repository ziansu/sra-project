@java.lang.Override
public void run() {
    if (p.hasPotionEffect(type))
        p.removePotionEffect(type);
    
    p.addPotionEffect(new org.bukkit.potion.PotionEffect(type, dur, amp));
}