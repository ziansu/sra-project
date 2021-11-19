private void updateList(java.util.ArrayList<com.freeman.sofa_adm.model.CategoryTranslate> categoryTranslates) {
    categories.clear();
    for (com.freeman.sofa_adm.model.CategoryTranslate category : categoryTranslates) {
        categories.add(category);
    }
    notifyDataSetChanged();
}