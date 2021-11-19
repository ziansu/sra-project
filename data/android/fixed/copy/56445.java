protected java.io.File computeDestDir(org.eclipse.mylyn.internal.wikitext.mediawiki.core.tasks.WikiToDocTask.Path path) {
    java.lang.String name = path.name;
    name.replace(' ', '_');
    java.io.File dest = new java.io.File(this.dest, name);
    return dest;
}