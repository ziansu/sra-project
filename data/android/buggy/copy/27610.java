public static void main(java.lang.String[] args) {
    JsonConverter.Human human = new JsonConverter.Human("Ivan", "Ivan", 18);
    JsonConverter.Converter converter = new JsonConverter.Converter();
    converter.convert(human);
}