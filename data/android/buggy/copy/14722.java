protected void expectException(java.lang.Class<? extends java.lang.Throwable> type, java.lang.String message) {
    thrown.expect(type);
    thrown.expectMessage(java.lang.String.format(message));
}