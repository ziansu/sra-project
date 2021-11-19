@org.springframework.transaction.annotation.Transactional
public void createRecipe(model.Recipe recipe) throws java.lang.Exception {
    model.User currentUser = getCurrentUser();
    currentUser = userRepository.findById(currentUser.getId());
    recipeRepository.save(recipe);
}