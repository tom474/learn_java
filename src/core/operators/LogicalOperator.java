package core.operators;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        // AND operator: returns true if both operands are true
        boolean andResult = isTrue && isFalse;
        System.out.println("AND Result: " + andResult);

        // OR operator: returns true if at least one operand is true
        boolean orResult = isTrue || isFalse;
        System.out.println("OR Result: " + orResult);

        // NOT operator: reverses the boolean value, returns true if the operand is false and vice versa
        boolean notA = !isTrue;
        System.out.println("NOT A Result: " + notA);

        // XOR operator: returns true if two operands have different boolean values
        boolean xorResult = isTrue ^ isFalse;
        System.out.println("XOR Result: " + xorResult);
    }
}
