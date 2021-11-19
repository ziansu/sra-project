private org.spongepowered.api.text.Text withStyle(org.spongepowered.api.text.Text text, org.spongepowered.api.text.Text styled) {
    return text.toBuilder().color(styled.getColor()).style(styled.getStyle()).build();
}