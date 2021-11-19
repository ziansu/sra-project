@java.lang.Override
public boolean isApplicable(model.AtomData data) {
    return ((data.getNext()) != null) || ((data.getPrevious()) != null);
}