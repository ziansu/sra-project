private org.apache.beam.runners.core.SimpleDoFnRunner<InputT, OutputT>.DoFnStartBundleContext<InputT, OutputT> createStartBundleContext(org.apache.beam.sdk.transforms.DoFn<InputT, OutputT> fn, org.apache.beam.runners.core.SimpleDoFnRunner.DoFnContext<InputT, OutputT> context) {
    return new DoFnStartBundleContext(this.fn, this.context);
}