@org.springframework.web.bind.annotation.RequestMapping(value = "/modifyIngredients", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.util.List<edu.unl.csce361.group4.cookbook.Ingredient> modifyIngredients(java.util.List<edu.unl.csce361.group4.cookbook.Ingredient> ingredients) {
    ingredientDAO.modify(ingredients);
    return ingredients;
}