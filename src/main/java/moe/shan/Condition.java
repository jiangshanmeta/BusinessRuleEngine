package moe.shan;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
