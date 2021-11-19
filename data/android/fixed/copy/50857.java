private boolean isDishDiscountable(com.rci.bean.entity.Dish dish) {
    if (dish == null) {
        return false;
    }
    if (!(com.rci.enums.CommonEnums.YOrN.isY(dish.getDiscountFlag()))) {
        return true;
    }
    return false;
}