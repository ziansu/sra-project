@java.lang.Override
public boolean equals(java.lang.Object other) {
    return (other == (this)) || ((other instanceof seedu.addressbook.data.person.Address) && (this.value.equals(((seedu.addressbook.data.person.Address) (other)).value)));
}