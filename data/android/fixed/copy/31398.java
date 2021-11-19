public boolean isCancelStatus() {
    return StatusCode.CANCELED_CODE.equals(mRequest.getStatus());
}