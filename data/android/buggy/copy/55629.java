private org.sonar.plugins.cxx.compiler.CompilerParser getCompilerParser() {
    java.lang.String parserKey = getStringProperty(org.sonar.plugins.cxx.compiler.CxxCompilerSensor.PARSER_KEY_DEF, org.sonar.plugins.cxx.compiler.CxxCompilerSensor.DEFAULT_PARSER_DEF);
    org.sonar.plugins.cxx.compiler.CompilerParser parser = parsers.get(parserKey);
    if (parser == null) {
        parser = parsers.get(org.sonar.plugins.cxx.compiler.CxxCompilerSensor.DEFAULT_PARSER_DEF);
    }
    return parser;
}