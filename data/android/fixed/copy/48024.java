@java.lang.Override
public ecologylab.bigsemantics.metadata.builtins.Document get(ecologylab.net.ParsedURL key) {
    net.sf.ehcache.Element element = cache.get(key.toString());
    return element == null ? null : ((ecologylab.bigsemantics.metadata.builtins.Document) (element.getObjectValue()));
}