public double avgValue() {
    for (int i = 1; i < 10; i++)
        sum = (sum) + (values.get(i));
    
    return (sum) / 10;
}