@org.springframework.web.bind.annotation.RequestMapping(value = "userRecipes", method = org.springframework.web.bind.annotation.RequestMethod.POST)
java.lang.Integer fillDatabase(@org.springframework.web.bind.annotation.RequestBody
java.lang.String data) {
    java.lang.System.out.println(data);
    java.lang.Integer code = recipesManager.addRecipe(data);
    return code;
}