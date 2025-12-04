public class Logic {

    public static Double suma(Double a,Double b){
        return a+b;
    }

    public static Double resta(Double a,Double b){
        return a-b;
    }

    public static Double multiplicacion(Double a, Double b){
        return a * b;
    }

    public static Double divicion(Double a, Double b){
        if(b==0){
            return null;
        }
        return a/b;
    }

    public static Double operacion(Double a, Double b, String op){
        switch (op) {
            case "+":
                return Logic.suma(a,b);
            case "-":
                return Logic.resta(a, b);
            case "x":
                return Logic.multiplicacion(a, b);
            case "/":
                return Logic.divicion(a, b);        
            default:
                return null;
        }
    }
}