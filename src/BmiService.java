public class BmiService {
    public double calculate(double weight, double squareHeight) {
        double index = weight / squareHeight;
        return index;
    }
}
