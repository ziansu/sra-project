@javax.jdo.annotations.Column(allowsNull = "false")
@org.apache.isis.applib.annotation.MemberOrder(sequence = "2")
public java.math.BigDecimal getKeyValue() {
    return keyValue.setScale(2, java.math.BigDecimal.ROUND_HALF_DOWN);
}