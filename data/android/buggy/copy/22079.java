public void setEncodersCollection(java.util.Collection<org.mythtv.android.presentation.model.EncoderModel> encodersCollection) {
    this.validateEncodersCollection(encodersCollection);
    this.encodersCollection = ((java.util.List<org.mythtv.android.presentation.model.EncoderModel>) (encodersCollection));
    this.notifyDataSetChanged();
}