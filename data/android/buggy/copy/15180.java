public void setNumPizzas(int numPizzas) {
    if ((numPizzas > 3) && (numPizzas < 1)) {
        java.lang.System.out.println("Amt of pizzas not correct! Try again!");
    }else {
        pizzas = new Pizza[numPizzas];
        num_pizzas = numPizzas;
    }
}