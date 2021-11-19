public org.kpull.bastion.core.Bastion.CallbackedApiResponse<M> thenDo(org.kpull.bastion.core.Callback<M> callback) {
    this.callback = callback;
    return new org.kpull.bastion.core.Bastion.CallbackedApiResponse<>();
}