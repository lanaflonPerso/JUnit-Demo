package calculator.math;

public class Multiplication implements Operation{
    public Long calculer(Long a, Long b) {
        return a*b;
    }
    public Character lireSymbole() {
        return '*';
    }
}