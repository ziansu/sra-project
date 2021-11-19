@java.lang.Deprecated
public static com.google.common.base.Predicate<org.apache.isis.core.metamodel.spec.feature.ObjectAction> ofType(final org.apache.isis.core.metamodel.spec.ActionType type) {
    return new com.google.common.base.Predicate<org.apache.isis.core.metamodel.spec.feature.ObjectAction>() {
        @java.lang.Override
        public boolean apply(org.apache.isis.core.metamodel.spec.feature.ObjectAction oa) {
            return (oa.getType()) == type;
        }
    };
}