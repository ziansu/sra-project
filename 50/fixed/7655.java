protected boolean jsonHasCode200AndBody(com.badlogic.gdx.utils.JsonValue jsonValue) {
    return ((jsonValue.has("code")) && ((jsonValue.getInt("code")) == 200)) && (jsonValue.has("body"));
}