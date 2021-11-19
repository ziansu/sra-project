public objects.Nutrient get(java.lang.String type) {
    for (objects.Nutrient n : nutrients) {
        if (n.getType().equals(type)) {
            return n;
        }
    }
    return null;
}