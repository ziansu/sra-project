private int calculatePrice() {
    int price = pricePerCoffee;
    if (hasWhippedCream)
        price++;
    
    if (hasChocolate)
        price += 2;
    
    return price * (quantity);
}