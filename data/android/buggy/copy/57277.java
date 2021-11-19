public io.evercam.Right getRights() throws io.evercam.EvercamException {
    try {
        java.lang.String rightsString = jsonObject.getString("rights");
        return new io.evercam.Right(rightsString);
    } catch (org.json.JSONException e) {
        throw new io.evercam.EvercamException(e);
    }
}