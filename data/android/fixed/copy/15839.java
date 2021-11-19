@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    recipeDetail = dataSnapshot.getValue(brightseer.com.brewhaha.models.RecipeDetail.class);
    recipeDetail.setKey(dataSnapshot.getKey());
    goToSceneOverView(findViewById(R.id.card_overview), false);
    toggleSceneButtons = true;
    evaluateUser();
}