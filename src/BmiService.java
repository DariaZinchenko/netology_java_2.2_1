public class BmiService {

    //указывается вес в килограммах и рост в метрах
    public float calculate(float height, float weight) {
        return weight / height / height;
    }
}
