package Vjezbe.Vjezba_3;

public class Calculator implements Operands, Operations{

    public double a, b;
    @Override
    public void setOperands(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double add() {
        return a + b;
    }

    @Override
    public double sub() {
        return a - b;
    }
}
