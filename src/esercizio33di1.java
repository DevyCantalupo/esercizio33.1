import java.math.BigDecimal;
public class esercizio33di1 {
    public static void main(String[] args) {

        BigDecimal numero1 = BigDecimal.valueOf(12.343434);
        BigDecimal numero2 = BigDecimal.valueOf(234.443);
        Operaciones hacer = Operaciones.sumar;

        System.out.println(numero1 + " y " + numero2 + " " + hacer);
        System.out.println(calcular(numero1, numero2, hacer));
    }

    public static BigDecimal calcular(BigDecimal num1, BigDecimal num2, Operaciones hacer) {

        BigDecimal resultado;

        switch (hacer) {
            case sumar:
                resultado = num1.add(num2);
                break;
            case restar:
                resultado = num1.subtract(num2);
                break;
            case multiplicacion:
                resultado = num1.multiply(num2);
                break;
            case division:
                resultado = num1.divide(num2,2); //RoundingMode.blabla non funziona
                break;
            case minimo:
                resultado = num1.min(num2);
                break;
            case maximo:
                resultado = num1.max(num2);
                break;
            default:
                resultado = null;
        }
        return resultado;
    }
}
