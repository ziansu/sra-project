public boolean isSuspended() {
    return ((isInExile()) && (hasAbility(MagicAbility.Suspend))) && (hasCounters(MagicCounterType.Time));
}