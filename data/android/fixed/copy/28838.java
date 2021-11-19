@java.lang.Override
public void ban(uk.co.drnaylor.minecraft.hammer.core.wrappers.WrappedCommandSource source, java.lang.String reason) {
    ban(source, new uk.co.drnaylor.minecraft.hammer.core.text.HammerTextBuilder().add(reason).build());
}