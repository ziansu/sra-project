public static void clean() {
    evaluate.RunSystemCommand.run("rm data/corpus/*.tmp");
    evaluate.RunSystemCommand.run("rm *.tmp");
}