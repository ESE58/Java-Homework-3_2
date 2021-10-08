public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55.5;
        double height = 1.65;
        double squareHeight = height * height;
        double index = service.calculate(weight, squareHeight);
        System.out.println(index);
    }
}
