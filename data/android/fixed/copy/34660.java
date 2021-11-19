public void show(java.lang.Object mc) {
    com.google.gson.Gson g = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    textpane.setText(g.toJson(mc));
}