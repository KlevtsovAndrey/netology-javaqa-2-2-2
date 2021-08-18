public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.76;
        int weight = 73;
        double Bmi = service.calculate(height, weight);
        System.out.println(Bmi);
    }
}
