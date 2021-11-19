@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof logisticspipes.utils.OneList)) {
        return false;
    }
    return content.equals(((logisticspipes.utils.OneList<?>) (obj)).content);
}