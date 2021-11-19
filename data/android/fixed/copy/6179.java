@java.lang.Override
public java.util.List<com.goodfood.model.Food> getAllFood() {
    return getCurrentSession().createCriteria(com.goodfood.model.Food.class).list();
}