public void startCooldown(cooldown.WavesCooldown cooldown, int rounds) {
    THs.add(new cooldown.WavesCDHandler.TimeHelper(cooldown, rounds));
}