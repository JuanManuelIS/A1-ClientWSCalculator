package clientwscalculator;

public class ClientWSCalculator {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        System.out.println("Suma = " + sum(n1, n2));
        System.out.println("Resta = " + rest(n1, n2));
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static int rest(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }
    
}
