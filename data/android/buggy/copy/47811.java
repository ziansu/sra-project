private void validateResult(org.ow2.authzforce.core.pdp.api.value.Bag<AV> result) throws org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException {
    if ((mustBePresent) && (result.isEmpty())) {
        throw new org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException(org.ow2.authzforce.core.pdp.api.StatusHelper.STATUS_MISSING_ATTRIBUTE, missingAttributeMessage, result.getReasonWhyEmpty());
    }
}