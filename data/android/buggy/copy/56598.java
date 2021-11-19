@java.lang.Override
public int compareTo(org.golde.forge.scratchforge.base.common.world.ScheduledTask other) {
    if ((other.timeToFire) > (this.timeToFire))
        return 1;
    else
        if ((other.timeToFire) < (this.timeToFire))
            return -1;
        else
            return 0;
        
    
}