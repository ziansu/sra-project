public static ai.grakn.exception.GraphOperationException noType(ai.grakn.concept.Thing thing) {
    return new ai.grakn.exception.GraphOperationException(ai.grakn.util.ErrorMessage.NO_TYPE.getMessage(thing.getId()));
}