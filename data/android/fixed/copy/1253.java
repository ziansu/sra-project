private void checkForElixir() {
    if (elixirCavern.equals(playerCavern)) {
        items.setElixir(true);
        elixirCavern = "NONE";
        messageReceiver.elixirFound();
    }
}