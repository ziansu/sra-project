public static <S extends ru.noties.spg.SPGSerializer<?, ?>> void addSerializer(S serializer) {
    final java.util.Map map = ru.noties.spg.SPGManager.getInstance().mSerializers;
    map.put(serializer.getClass(), serializer);
}