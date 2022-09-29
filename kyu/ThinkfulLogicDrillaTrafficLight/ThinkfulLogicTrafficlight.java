package ThinkfulLogicDrillaTrafficLight;

public class ThinkfulLogicTrafficlight {

    public static String updateLight(String current) {
        if (current == "green") {
            return "red";
        } else if (current == "red") {
            return "yellow";
        } else if (current == "yellow") {
            return "green";
        }
        return "Their is no light";
    }

    public static void main(String[] args) {
        System.out.println(updateLight("green"));
        System.out.println(updateLight("red"));
    }
}
