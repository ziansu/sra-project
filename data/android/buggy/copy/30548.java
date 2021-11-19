private void addValue(org.bukkit.block.Sign sign, int i) {
    long k = majongToLong(sign.getLine(0));
    k += i;
    sign.setLine(0, longToMajong(k));
}