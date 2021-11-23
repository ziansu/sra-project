@java.lang.Override
public void addTransformer(github.therealbuggy.configurator.transformer.Transformer<?> transformer) {
    if (!(transformers.contains(transformer)))
        transformers.add(transformer);
    
}