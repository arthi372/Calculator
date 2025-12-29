package Calculator;



public class Add implements Operate {
    public  Double getResult(Double...numbers){
        Double Add = numbers[0];
        for(int i =0; i< numbers.length;i++){
            Add += numbers[0];
        }
        return Add;
    }


}
