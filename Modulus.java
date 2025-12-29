package Calculator;


public class Modulus implements Operate {


    @Override
    public Double getResult(Double... numbers) {
        Double modul = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            modul %= numbers[0];
        }

        return modul;
    }
}
