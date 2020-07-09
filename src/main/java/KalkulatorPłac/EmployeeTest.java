package KalkulatorPłac;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Hania", "Postek", 3000);
        double netto = PaymentCalculator.nettoYearPayment(employee);
        double brutto = PaymentCalculator.bruttoYearPayment(employee);
        System.out.println("Pensja roczna netto: " + netto);
        System.out.println("Pensja roczna brutto: " + brutto);
    }
}
