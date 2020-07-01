package calculator;

public class Operator {

    public int sum(double n, double m){
        int result;
        result = (int)(n + m);
        return result;
    }

    public int sub(double n, double m){
        int result;
        result = (int)(n - m);
        return result;
    }

    public double mul(double n, double m){
        double result;
        result = n * m;
        return result;
    }

    public double div(double n, double m){
        double result;
        result = n / m;
        return result;
    }
}
