public org.bukkit.Location getMidPos() {
    return pos_.clone().add(0, (((getTemplate().getTemplate_height()) / 2) - 2), 0);
}