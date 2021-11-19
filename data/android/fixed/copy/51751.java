public static boolean deletePart(model.Part part) {
    if (part != null) {
        return model.Inventory.allParts.remove(part);
    }
    return false;
}