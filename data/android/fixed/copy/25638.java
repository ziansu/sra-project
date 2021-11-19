@java.lang.Override
public java.util.List<isde.sde.soap.Food> suggestFoodByCaloriesBound(java.lang.String type, double calories) {
    isde.sde.soap.Business business = isde.sde.soap.ProcessImpl.getBusiness();
    return business.suggestFoodByCaloriesBound(type, calories);
}