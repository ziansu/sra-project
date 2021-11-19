protected void bindIContentPartFactory() {
    java.lang.System.out.println("bindIContentPartFactory!");
    binder().bind(new com.google.inject.TypeLiteral<org.eclipse.gef4.mvc.parts.IContentPartFactory<javafx.scene.Node>>() {    }).toInstance(new test2.example.gef4.zest.CustomNodeExample.CustomContentPartFactory());
}