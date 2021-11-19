@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format("%s.%s-%s (%s %s) URI=%s DOC=%s", groupId, artifactId, version, resourceType, packaging, resourceFile.toString(), resourceDoc.toString());
}