@java.lang.Override
public void registerEvent(@org.jetbrains.annotations.NotNull
java.lang.Object event) {
    timestamps.add(getEventTime());
    removeRedundancy();
}