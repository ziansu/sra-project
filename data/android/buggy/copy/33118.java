@java.lang.Override
public boolean remove(ecologylab.net.ParsedURL key, ecologylab.bigsemantics.metadata.builtins.Document oldDocument) {
    return cache.removeElement(new net.sf.ehcache.Element(key, oldDocument));
}