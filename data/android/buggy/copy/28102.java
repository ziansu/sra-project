@java.lang.Override
public int getItemCount() {
    int counter = 0;
    for (int i = 0; i <= (informationCategoryList.size()); i++) {
        if ((i % 3) != 0)
            counter++;
        
    }
    return counter;
}