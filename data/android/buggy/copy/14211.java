public static void main(java.lang.String[] args) {
    new Main();
    YandexTranslator translator = new YandexTranslator("trnsl.1.1.20161027T134752Z.2bdd96c146d9bb91.4eb1dbaf01ae42dd44bf357c6d0051307d745004", "en", "tr");
    java.lang.System.out.println("translating...");
    java.lang.System.out.println(translator.translate("hello"));
}