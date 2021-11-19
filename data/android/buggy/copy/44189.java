private void checkConstructorDeclaration(org.jetbrains.kotlin.resolve.ConstructorDescriptor constructorDescriptor, org.jetbrains.kotlin.resolve.JetDeclaration declaration) {
    modifiersChecker.reportIllegalModalityModifiers(declaration);
    reportErrorIfHasIllegalModifier(declaration);
    modifiersChecker.checkModifiersForDeclaration(declaration, constructorDescriptor);
}