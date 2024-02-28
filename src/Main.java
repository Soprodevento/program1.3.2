
public class Main {

    public static void main(String[] args) {
        char result = charExpression(5);
        System.out.println(result);
    }

    public static char charExpression(int a) {
        return (char) ((int) '\\' + a);
    }
}