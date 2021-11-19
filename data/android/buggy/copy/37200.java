public static synchronized io.centeno.randominsultgenerator.HTMLParser getParser(android.content.Context context, java.lang.String tag1, java.lang.String tag2, java.lang.String html) {
    if ((io.centeno.randominsultgenerator.HTMLParser.instance) == null)
        io.centeno.randominsultgenerator.HTMLParser.instance = new io.centeno.randominsultgenerator.HTMLParser(context, tag1, tag2, html);
    
    return io.centeno.randominsultgenerator.HTMLParser.instance;
}