private org.spongepowered.api.text.Text finalizeBuilder(org.spongepowered.api.text.Text text, org.spongepowered.api.text.Text.Builder build) {
    build.color(text.getColor()).style(text.getStyle());
    return build.build();
}