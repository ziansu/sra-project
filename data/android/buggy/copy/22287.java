public void setPizza3(Pizza pizza3) {
    if ((num_pizzas) >= 3) {
        pizzas[2] = pizza3;
    }
    if ((num_pizzas) < 3) {
        num_pizzas = 3;
    }
}