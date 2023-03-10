public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKG = 98;
        double heightMeters = 1.87;
        int bmi = service.calculate(weightKG, heightMeters);
        System.out.println(bmi);

    }
}