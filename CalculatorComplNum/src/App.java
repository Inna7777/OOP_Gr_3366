import Controller.iComplexNumber;
import Controller.iOperation;

public class App {
    public static void main(String[] args) throws Exception {
        
        ViewCalculator view = new ViewCalculator();
        iComplexNumber num1 = view.readNum1();
        iComplexNumber num2 = view.readNum2();
        iOperation operation = view.run();
        iComplexNumber result = operation.action(num1, num2);
        view.displayResult(result);
    }
    }

