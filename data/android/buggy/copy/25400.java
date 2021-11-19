public static com.liferay.mobile.screens.ddl.model.Field.DataType valueOf(java.util.Map<java.lang.String, java.lang.Object> attributes) {
    java.lang.Object mapValue = attributes.get("dataType");
    return mapValue == null ? com.liferay.mobile.screens.ddl.model.Field.DataType.UNSUPPORTED : com.liferay.mobile.screens.ddl.model.Field.DataType.valueOfString(mapValue.toString());
}