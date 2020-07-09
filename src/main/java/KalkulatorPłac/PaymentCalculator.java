package KalkulatorPłac;


public class PaymentCalculator {
    Employee employee;

    public PaymentCalculator(Employee employee) {
        this.employee = employee;
    }

    public static double nettoYearPayment(Employee employee){
         double YearSalary = (employee.getSalary())*12;
         return YearSalary;
    }
    public static double bruttoYearPayment(Employee employee){
        double YearSalary = (employee.getSalary())*12;
        double taxexPerYear = 1000*12;
        double US = YearSalary*0.2;
    double payment = YearSalary + taxexPerYear + US;
    return payment;}
}
