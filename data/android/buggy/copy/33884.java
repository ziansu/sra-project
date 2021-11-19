@java.lang.Override
public boolean accept(java.util.Map.Entry<java.lang.Object, java.lang.Object> element) {
    return org.raisercostin.utils.ObjectUtils.getContext().accept(element.getKey().toString());
}