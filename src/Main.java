public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60; //вес в килограммах
        double height = 1.70; //рост в метрах
        double index = service.calculate(weight, height);

        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + "м");
        System.out.println("Индекс массы тела: " +index);
    }
}