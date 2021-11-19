@java.lang.Override
public boolean replace(ecologylab.net.ParsedURL key, ecologylab.bigsemantics.metadata.builtins.Document oldDocument, ecologylab.bigsemantics.metadata.builtins.Document newDocument) {
    return cache.replace(new net.sf.ehcache.Element(key, oldDocument), new net.sf.ehcache.Element(key, newDocument));
}