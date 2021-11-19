@java.lang.Override
public de.fhro.inf.prg3.a02.SimpleList filter(de.fhro.inf.prg3.a02.SimpleFilter filter) {
    de.fhro.inf.prg3.a02.SimpleListImpl filteredSimpleList = new de.fhro.inf.prg3.a02.SimpleListImpl();
    for (java.lang.Object object : this) {
        if (filter.include(object))
            this.add(new de.fhro.inf.prg3.a02.SimpleListImpl.Element(object));
        
    }
    return this;
}