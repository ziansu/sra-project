@java.lang.Override
public void removeSubCategory(com.opencart.entity.SubCategory subcategory) {
    getCurrentSession().delete(subcategory);
}