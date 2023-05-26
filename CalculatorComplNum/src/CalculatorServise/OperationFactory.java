package CalculatorServise;

import Controller.iOperation;
import Controller.iOperationFactory;

public class OperationFactory implements iOperationFactory {

    @Override
    public iOperation create(String operation) {
            if (operation.equals("+")) {
                return new Addition();
            } else if (operation.equals("*")) {
                return new Multiplication();
            } else  if (operation.equals("/")) {
                return new Division();
            }else{
                return null;
            }
        }
    
    
}

