@javax.annotation.Nonnull
public void setId(org.sosy_lab.cpachecker.util.identifiers.SingleIdentifier pId) {
    assert ((id) == null) || (id.getName().equals(pId.getName())) : (("Old id " + (id)) + ", new one - ") + pId;
}