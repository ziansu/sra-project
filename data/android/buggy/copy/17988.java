public static java.lang.reflect.Type getClassFromType(java.lang.String code) {
    return com.yandex.money.api.typeadapters.showcase.ComponentTypeAdapterFactory.TYPE_MAPPING.get(Component.Type.parse(code));
}