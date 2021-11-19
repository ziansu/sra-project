private void setCategoryButton(de.grau.organizer.classes.Category category) {
    if (category == null)
        return ;
    
    btn_category.setText(category.getName());
}