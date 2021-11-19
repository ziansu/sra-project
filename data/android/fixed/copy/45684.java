protected java.lang.String getConfigPath() {
    return ru.yandex.qatools.allure.command.PROPERTIES.getAllureConfig().toAbsolutePath().getParent().toString();
}