private int availablePop(java.util.Collection<java.lang.Integer> dest, int count) {
    for (int i = 0; i < count; i++)
        dest.add(availablePop());
    
    return 0;
}