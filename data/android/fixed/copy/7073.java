@java.lang.Override
public long mediaGetCurrentMs() {
    if ((tvInputPlayer) != null)
        return (tvInputPlayer.getCurrentPosition()) + (mediaGetStartMs());
    else
        return 0;
    
}