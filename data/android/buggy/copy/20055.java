private static int getIndexFromResources(java.lang.String chosen) {
    for (int i = 0; i < (com.example.seifmostafa.colormatches.Utilities.Resources.length); i++) {
        if (chosen == (com.example.seifmostafa.colormatches.Utilities.Resources[i]))
            return i;
        
    }
    return -1;
}