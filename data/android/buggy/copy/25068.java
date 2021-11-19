protected void convertNutrients(java.util.ArrayList<objects.Nutrient> nutrients) {
    for (objects.Nutrient n : nutrients) {
        int t = nutrientConsumption.get(n.getType());
        java.lang.System.out.println(t);
    }
}