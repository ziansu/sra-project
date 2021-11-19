private com.beaconhackathon.slalom.beaconandeggs.Models.Categories convertToJson(java.lang.String jsonString) {
    com.google.gson.GsonBuilder builder = new com.google.gson.GsonBuilder();
    com.google.gson.Gson gson = builder.create();
    com.beaconhackathon.slalom.beaconandeggs.Models.Categories categories = gson.fromJson(jsonString, com.beaconhackathon.slalom.beaconandeggs.Models.Categories.class);
    return categories;
}