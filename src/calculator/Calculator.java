package calculator;

public class Calculator {
    private String operation;
    private double currentNum;
    private double previousNum;
    private double result;

    //Get & Set methods
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getNum() {
        return currentNum;
    }

    public void setNum(double num) {
        this.currentNum = num;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getPreviousNum() {
        return previousNum;
    }

    public void setPreviousNum(double previousNum) {
        this.previousNum = previousNum;
    }

    public double getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(double currentNum) {
        this.currentNum = currentNum;
    }
    
    //Operation methods
    public double sum(){
        result = previousNum + currentNum;
        
        return result;
    }
    
    public double minus(){
        result = previousNum - currentNum;
        
        return result;
    }
    
    public double multiple(){
        result = previousNum * currentNum;
        
        return result;
    }
    
    public double division(){
        result = previousNum / currentNum;
        
        return result;
    }
}