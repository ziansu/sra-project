protected void convertNutrients(java.util.ArrayList<objects.Nutrient> nutrients) {
    for (objects.Nutrient n : nutrients) {
        int t = nutrientConsumption.get(n.getType());
        n.add(((-1) * t));
    }
}