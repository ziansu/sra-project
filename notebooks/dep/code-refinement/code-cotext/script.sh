pretrained_model=razent/cotext-2-cc
data_path=/home/su284/data/workspace/program-repair/sra-project/notebooks/dep/code-refinement/data
output_dir=./output

python run.py \
	--do_train \
	--do_eval \
	--model_type t5 \
	--model_name_or_path $pretrained_model \
	--config_name $pretrained_model \
	--tokenizer_name $pretrained_model \
	--train_filename $data_path/small/train.buggy-fixed.buggy,$data_path/small/train.buggy-fixed.fixed \
	--dev_filename $data_path/small/valid.buggy-fixed.buggy,$data_path/small/valid.buggy-fixed.fixed \
	--output_dir $output_dir \
	--max_source_length 256 \
	--max_target_length 256 \
	--beam_size 5 \
	--train_batch_size 64 \
	--eval_batch_size 16 \
	--learning_rate 5e-5 \
	--train_steps 100000 \
	--eval_steps 5000

# python run.py \
#     --do_test \
# 	--model_type roberta \
# 	--model_name_or_path roberta-base \
# 	--config_name roberta-base \
# 	--tokenizer_name roberta-base  \
# 	--load_model_path $output_dir/checkpoint-best-bleu/pytorch_model.bin \
# 	--test_filename $data_path/small/test.buggy-fixed.buggy,$data_path/small/test.buggy-fixed.fixed \
# 	--dev_filename $data_path/small/valid.buggy-fixed.buggy,$data_path/small/valid.buggy-fixed.fixed \
# 	--output_dir $output_dir \
# 	--max_source_length 256 \
# 	--max_target_length 256 \
# 	--beam_size 5 \
# 	--eval_batch_size 128