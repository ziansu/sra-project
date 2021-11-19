public static void main(java.lang.String[] args) {
    Services.TemplateGenerator tg = new Services.TemplateGenerator();
    tg.GroupZeroGenerator(new java.lang.String[]{ "prod" }, "quant");
    tg.CloneMapForGroupingVariables("2");
    tg.SaveFile();
}