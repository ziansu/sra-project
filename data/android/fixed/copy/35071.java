public void setCollectionDoOnRefresh(org.ednovo.gooru.shared.model.content.CollectionDo collectionDo) {
    this.collectionDo = collectionDo;
    getView().setCollectionMetadata(collectionDo);
}