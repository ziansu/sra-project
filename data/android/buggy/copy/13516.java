public int compareTo(uk.chromis.pos.ticket.CouponLine o) {
    int c = o.m_Id.compareTo(m_Id);
    if (c == 0) {
        c = (o.m_LineNumber) - (m_LineNumber);
    }
    return c;
}