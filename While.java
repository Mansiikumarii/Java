public class While {
    public static void main(String[] args) {
        int i=0;
        while (i<5) {
            System.out.println(i);
            i++;
        }

        int countDown = 3;
        while(countDown > 0){
            System.out.println(countDown);
            countDown--;
        }
        System.out.println("Happy Bday !!");

        int j=0;
        do{
            System.out.println(j);
            j++;
        }
        while(j<5);

        //when do while condition is false it run at least once
        int k=0;
        do{
            System.out.println(k);
            k++;
        }
        while (k<5);

        int dice = 1;
        while (dice <= 6) {
            if (dice< 6) {
                System.out.println("Win");
            }
            else{
                System.out.println("Not win");
            }
            dice++;
        }
    }
}
