@java.lang.Override
public java.lang.String serialize() {
    if ((durabilityPercent) >= 0)
        return java.lang.String.format("%.0f%%", ((durabilityPercent) * 100));
    
    return java.lang.String.valueOf(durability);
}