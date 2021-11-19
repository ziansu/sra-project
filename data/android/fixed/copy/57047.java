@java.lang.Override
public de.saschafeldmann.adesso.master.thesis.elearningimport.model.LearningContent execute(final de.saschafeldmann.adesso.master.thesis.elearningimport.model.LearningContent learningContent, final de.saschafeldmann.adesso.master.thesis.preprocesses.model.PreprocessingOptions preprocessingOptions) {
    final edu.stanford.nlp.pipeline.StanfordCoreNLP stanfordCoreNLP = getStanfordCoreNlpInstanceForLanguage(learningContent);
    annotateRawText(stanfordCoreNLP, learningContent, preprocessingOptions);
    return learningContent;
}