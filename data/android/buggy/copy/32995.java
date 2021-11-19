protected void markUncheckedValid() {
    if (preferredSugar) {
        getExpectation().acceptActualType(resultClosureType, ((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.UNCHECKED) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PREFERRED_LAMBDA_SUGAR)));
    }else {
        getExpectation().acceptActualType(resultClosureType, ConformanceFlags.UNCHECKED);
    }
}