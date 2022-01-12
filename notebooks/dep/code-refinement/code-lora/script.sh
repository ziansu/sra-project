pretrained_model=microsoft/codebert-base
# output_dir=../output-lora-10-percent-0-8-4
output_dir=../output-lora-10-percent-0-128-4
train_buggy_path=../data/small/train-split-10/0-src.txt
train_fixed_path=../data/small/train-split-10/0-targ.txt

python run.py \
	--do_train \
	--do_eval \
	--model_type roberta \
	--model_name_or_path $pretrained_model \
	--config_name roberta-base \
	--tokenizer_name roberta-base \
	--train_filename $train_buggy_path,$train_fixed_path \
	--dev_filename ../data/small/valid.buggy-fixed.buggy,../data/small/valid.buggy-fixed.fixed \
	--output_dir $output_dir \
	--max_source_length 256 \
	--max_target_length 256 \
	--beam_size 5 \
	--train_batch_size 32 \
	--eval_batch_size 32 \
	--learning_rate 5e-5 \
	--train_steps 20000 \
	--eval_steps 1000 \
	--lora_dim 256 \
	--lora_alpha 1024

# python run.py \
#     --do_test \
# 	--model_type roberta \
# 	--model_name_or_path $pretrained_model \
# 	--config_name roberta-base \
# 	--tokenizer_name roberta-base  \
# 	--load_model_path $output_dir/checkpoint-best-bleu/pytorch_model.bin \
# 	--test_filename ../data/small/test.buggy-fixed.buggy,../data/small/test.buggy-fixed.fixed \
# 	--output_dir $output_dir \
# 	--max_source_length 256 \
# 	--max_target_length 256 \
# 	--beam_size 5 \
# 	--eval_batch_size 128 \
# 	--lora_dim 128 \
# 	--lora_alpha 512

	# --dev_filename ../data/small/valid.buggy-fixed.buggy,../data/small/valid.buggy-fixed.fixed \
