public class Calculator {

    public static int add(int usr1, int usr2){
        return usr1 + usr2;
    }

    public static int subtract(int usr1, int usr2){
        return usr1 - usr2;
    }

    public static void main(String[] args) {
        System.out.println("Addition of 10 and 20 is : " + add(10, 20));
        System.out.println("Addition of -15 and 20 is : " + add(-15, 20));
        System.out.println("Addition of -15 and -20 is : " + add(-15, -20));
        System.out.println("Addition of -15 and 2000 is : " + add(-15, 2000));

        System.out.println("Subtraction of -15 and 15 is : " + add(-15, 15));
        System.out.println("Subtraction of -15 and -15 is : " + add(-15, -15));
        System.out.println("Subtraction of -15 and 30 is : " + add(-15, 30));
        System.out.println("Subtraction of -60 and 30 is : " + add(-60, 30));
    }
}
