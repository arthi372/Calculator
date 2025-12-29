package Calculator;

public class Divide implements  Operate{
    public Double getResult(Double...numbers){
        Double Div = numbers[0];
        for (int i =0; i< numbers.length; i++){
            Div /= numbers[0];
        }
        return  Div;
    }
}
