@java.lang.Override
public long getCommandCooldownMs(java.lang.String label) {
    com.earth2me.essentials.Entry<java.util.regex.Pattern, java.lang.Long> result = getCommandCooldownEntry(label);
    return result != null ? result.getValue() : -1;
}