@java.lang.Override
public final javafx.beans.Observable getObservable(org.genericsystem.common.Generic generic) {
    return org.genericsystem.defaults.tools.TransitiveObservable.create(transactionProperty, () -> new javafx.beans.Observable[]{ org.genericsystem.common.transactionProperty.get().getObservable(generic) });
}