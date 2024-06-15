public class NumeroMayor {
    private int num1;
    private int num2;
    private int num3;

    public NumeroMayor (int no1,int no2,int no3){
        num1 = no1;
        num2 = no2;
        num3 = no3;
    }
    public int ejercicio1(){
        int mayor = num1;
        if(num2 > num1){
            mayor = num2;
        } else if (num3 > num2) {
            mayor = num3;
        }else return mayor;
        return mayor;
    }




}