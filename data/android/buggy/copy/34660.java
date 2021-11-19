public void showCard(org.magic.api.beans.MagicCard mc) {
    com.google.gson.Gson g = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    textpane.setText(g.toJson(mc));
}