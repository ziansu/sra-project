@java.lang.Override
public java.util.List<fr.pizzeria.model.Pizza> findAllPizzas() {
    return new java.util.ArrayList<fr.pizzeria.model.Pizza>(pizzas.values());
}