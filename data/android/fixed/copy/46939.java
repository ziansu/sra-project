public static void info(java.lang.String str, boolean skipLine) {
    if (skipLine)
        fr.epita.pri.rackrepresentator.main.Console.txtArea.append("\n");
    
    fr.epita.pri.rackrepresentator.main.Console.txtArea.append(str);
}