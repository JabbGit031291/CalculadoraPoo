public class Calculadora {

    //suma
    public int suma (int num1, int num2){
        return num1 + num2;
    }

    //resta
    public int resta (int num1, int num2){
        return num1 - num2;
    }
    //Multi
    public int multi (int num1, int num2){
        return num1 * num2;
    }

    //Divi
    public int divi (int num1, int num2){
        if(num2 == 0 ){
            System.out.println("No se puede dividir entre cero");
        }
        return num1 / num2;
    }


}
