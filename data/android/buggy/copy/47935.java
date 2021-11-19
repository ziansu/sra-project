public de.buschgaming.aptget.apt get() {
    if (!(usesql)) {
        return new de.buschgaming.aptget.YAMLapt(plugin, fileManager);
    }else {
        return new de.buschgaming.aptget.SQLapt(plugin, MySQL, c);
    }
}