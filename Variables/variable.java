class variable {

    public static void main(String[] args) {
        String Name = "Priyanshi";
        System.out.println(Name);

        int myNum = 15;
        System.out.println(myNum);
        
        //overwrite 
        myNum = 20;
        System.out.println(myNum);

        //final variable
        int myNewNum = 15; // cannot be changed
        System.out.println(myNewNum);

        float myFloatNum = 5.99f;
        char myLetter = 'M';
        boolean myBool = true;
        String myText = "Hello";
    }
}