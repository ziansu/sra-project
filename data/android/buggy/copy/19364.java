float calculatePrice() {
    float final_price = 0;
    float shipping_price = (20 * (this.weight)) * (this.quantity);
    final_price = (this.price) + shipping_price;
    return final_price;
}