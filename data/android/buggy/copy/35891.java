@java.lang.Override
public void deleteRecipeComponent(dto01917.RecipeComponentDTO recipeComponent) throws daointerfaces01917.DALException {
    connector01917.Connector.doUpdate(daoimpl01917.Queries.getFormatted("recipecomponent.delete", java.lang.Integer.toString(recipeComponent.getIngredientId()), java.lang.Integer.toString(recipeComponent.getRecipeId())));
}