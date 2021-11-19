private void checkForElixir() {
    if (elixirCavern.contains(playerCavern)) {
        items.setElixir(true);
        elixirCavern = "NONE";
        messageReceiver.elixirFound();
    }
}