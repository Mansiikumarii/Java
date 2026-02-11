public class For {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        //even number
        for(int i=0; i<=10; i= i+2){
            System.out.println(i);
        }

        //Sum of Numbers
        int sum = 0;
        for(int i=1; i<= 5; i++){
            sum += i;
        }
        System.out.println("Sum is "+ sum);

        //Countdown 
        for(int i=5; i>0; i--){
            System.out.println(i);
        }

        //Nested Loops
        //Outer loop
        for(int i=1; i<= 2; i++){
            System.out.println("Outer :" + i);
            //Inner loop
            for(int j=1; j<= 3; j++){
                System.out.println("Inner: "+j);
            }
        }

        //Multiplication table
        for(int i=1; i<=3; i++){
            for(int j=1; j<= 3; j++){
                System.out.print(i*j +" ");
            }
            System.out.println();
        }

        //For each loop
        String[] job = {"Sales","food","administrative",
            "Agriculture", "Healthcare"
        };
        for(String jobs : job){
            System.out.println(jobs);
        }

        //Factorial of a number
        int n = 5;
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        System.out.println("Factorial of "+ n+ "is"+ fact);
    }
}
