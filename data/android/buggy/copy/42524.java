@java.lang.Override
public double pmf(int x) {
    if ((x < (min)) || (x > (max)))
        return 0;
    else
        return 1.0 / ((max) - (min));
    
}