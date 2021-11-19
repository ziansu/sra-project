public static com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie getInstance(int i) {
    if ((i <= ((com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie.ALL.size()) - 1)) && (i >= 0))
        return com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie.ALL.get(i);
    
    return null;
}