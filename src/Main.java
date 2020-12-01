public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float bmi = bmiService.calculate((float) 1.56, 52);
        System.out.println("Индекс массы тела = " + String.format("%.2f",bmi));
    }
}
