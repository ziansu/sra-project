private void updateCounters() {
    remainingJails.setText(("       x    " + (player.getBag().getRemainingJails())));
    remainingPaws.setText(("        x   " + (player.getBag().getRemainingPawns())));
}