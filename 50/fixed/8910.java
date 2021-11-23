public long calculateTotalCost() {
    long totalDiscounts = 0;
    for (int i = 0; i < (discounts.size()); i++)
        totalDiscounts += discounts.get(i);
    
    return (totalCost) - totalDiscounts;
}