package moe.shan;

@FunctionalInterface
public interface Action {
    void execute(Facts facts);
}
