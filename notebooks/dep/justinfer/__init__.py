# This is the module to faciliate inference
from . import codebert

def process(model_type, output_dir, load_model_path, test_filename, 
    batch_size):

    if model_type == 'codebert-ft':
        codebert.infer(output_dir, load_model_path, 
            test_filename, batch_size)