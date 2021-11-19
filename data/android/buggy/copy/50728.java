private java.lang.String parseJplString(krTools.language.Term jplTerm) {
    if (!(jplTerm.isAtom()))
        throw new java.lang.IllegalArgumentException();
    
    vh3.goalgamygdala.parser.Atom thisAtom = ((vh3.goalgamygdala.parser.Atom) (jplTerm));
    return thisAtom.name();
}