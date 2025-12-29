package Calculator;

public class Sub implements  Operate{
    public Double getResult(Double...numbers){
        Double Sub = numbers[0];
        for (int i =0; i< numbers.length; i++){
            Sub -= numbers[0];
        }
        return Sub;
    }
}
