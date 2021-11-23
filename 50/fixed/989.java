@org.junit.Before
public void before() {
    elements = compilation.getElements();
    javax.lang.model.element.TypeElement element = elements.getTypeElement("com.bdl.annotation.processing.model.AbstractClass");
    metadata = com.bdl.annotation.processing.model.ClassMetadata.fromElement(element);
}