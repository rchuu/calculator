public class Program {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setFirstNumber(5);
        cal.setSecondNumber(10);
        cal.setOperator('+');
        cal.performOperation();
        cal.getResults();
    }
}
