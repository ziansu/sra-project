public void setData(dictionary.DataContainer dataContainer) {
    this.dataContainer = dataContainer;
    this.studyStrategy = dataContainer.studyStrategy;
    cardIndexesFromChoose = dataContainer.auxiliaryDataContainer.studiedCardIndexes;
    answerDataByStudyItemsContainer = dataContainer.auxiliaryDataContainer.studiedAnswerDataByStudyItemContainer;
}