public void eatFoods(org.json.JSONArray e) {
    for (java.lang.Object foodEaten : e)
        foods.remove(((org.json.JSONObject) (foodEaten)).getInt("id"));
    
}