public void resolve(de.adrodoc55.minecraft.mpl.interpretation.VariableScope scope) {
    for (java.lang.Object object : commandParts) {
        if (object instanceof de.adrodoc55.minecraft.mpl.interpretation.insert.Insert) {
            ((de.adrodoc55.minecraft.mpl.interpretation.insert.Insert) (object)).resolve(scope);
        }
    }
}