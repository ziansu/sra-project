public java.lang.String getBook(java.lang.String memberName) throws datasource.DatabaseException {
    datasource.MemberRowDataGatewayMock memberRowDataGatewayMock = new datasource.MemberRowDataGatewayMock(memberName);
    return memberRowDataGatewayMock.addMemberName();
}