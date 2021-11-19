@java.lang.Override
public float getProbability() {
    if ((demand) < (available))
        return 1.0F;
    else
        return (available) / ((demand) + 1);
    
}