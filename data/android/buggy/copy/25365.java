@java.lang.Override
public double sum() {
    int sum = 0;
    int len = sto.size();
    for (int i = 1; i < len; i++)
        sum += sto.get(i);
    
    return sum;
}