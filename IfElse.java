public class IfElse {
    public static void main(String[] args) {
        boolean isRainig = true;
        if(isRainig){
            System.out.println("Bring an umbrella!");
        }
        if (20>18) {
            System.out.println("x is greater than y");
        }

        int x = 20;
        int y=20;
        if (x == y) {
            System.out.println("x is equal to y");
        }

        int weather = 2;

        if(weather == 1){
            System.out.println("Bring an umbrella.");
        }
        else if(weather == 2){
            System.out.println("Wear sunglasses.");
        }
        else{
            System.out.println("Just go outside normally");
        }
        int time = 21;
        System.out.println((time<18) ? "Good day": " Good evening");

        String message = (time<12) ? "Good morning" : (time<18)?"Good afternoon": "Good evening";
        System.out.println(message);
    }
}
