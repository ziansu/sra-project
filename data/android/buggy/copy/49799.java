public static boolean numeric(symbols.Type p) {
    if (((p == (symbols.Type.Char)) || (p <= (symbols.Type.Int))) || (p == (symbols.Type.Float)))
        return true;
    else
        return false;
    
}