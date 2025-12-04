public class Logica {

    static Double check_input(String a){
        try{
            return Double.parseDouble(a);
        }catch (Exception i){
            return null;
        }
    }

    static Double calc_imc(Double a, Double b){
        if(a==null || b==null){
            return null;
        }
        System.out.println(a);
        System.out.println(b);
        return a/(b*b);
    }
}