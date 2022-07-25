public class Calculator {
    private double results;
    private double firstNumber;
    private double secondNumber;
    private char operator;

    public Calculator() {
    }

    public Calculator(double firstNumber, double secondNumber, char operator) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public void setFirstNumber(double input) {
        this.firstNumber = input;
    }

    public void setSecondNumber(double input) {
        this.secondNumber = input;
    }

    public void setOperator(char input) {
        this.operator = input;
    }

    public void performOperation() {
        if (this.operator == '+') {
            results = (firstNumber) + (secondNumber);
        }
        if (this.operator == '+') {
            results = (firstNumber) + (secondNumber);
        }
        if (this.operator == '+') {
            results = (firstNumber) + (secondNumber);
        }
        if (this.operator == '+') {
            results = (firstNumber) + (secondNumber);
        }
    }

    public void getResults() {
        System.out.println(results);
    }
}