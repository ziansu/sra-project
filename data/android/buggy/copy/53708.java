@javax.persistence.Id
@javax.persistence.GeneratedValue
@javax.persistence.Column(name = "addressId")
public long getAddressId() {
    return this.addressId;
}