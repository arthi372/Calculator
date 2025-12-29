package Calculator;

public class Multiply implements Operate{
    public  Double getResult(Double...numbers){
        Double Mul = numbers[0];
        for (int i =0; i< numbers.length;i++){
            Mul+=numbers[0];
        }
        return Mul;
    }
}
