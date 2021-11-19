@javax.annotation.Nonnull
public void setId(org.sosy_lab.cpachecker.util.identifiers.SingleIdentifier pId) {
    assert ((id) == null) || (id.equals(pId)) : (("Old id " + (id)) + ", new one - ") + pId;
    id = pId;
}