@org.junit.Before
public void before() {
    javax.lang.model.util.Elements elements = compilation.getElements();
    javax.lang.model.element.TypeElement element = elements.getTypeElement("com.bdl.annotation.processing.model.AbstractClass");
    metadata = com.bdl.annotation.processing.model.ClassMetadata.fromElement(element);
}