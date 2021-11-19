@java.lang.Override
public java.lang.String toString() {
    if (this.hasLinkedAnnotation()) {
        if (this.content.isEmpty()) {
            return "Empty Highlight";
        }
        return abbreviateAnnotationName(("Highlight: " + (content)));
    }
    return abbreviateAnnotationName(content);
}