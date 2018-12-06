public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        int operandOne = 0;
        try{
            operandOne = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            System.out.println("Bad Input:" + args[0]);
        }
        int operandTwo = 0;
        try{
            operandTwo = Integer.parseInt(args[2]);
        }catch (NumberFormatException e){
            System.out.println("Bad Input: " + args[2]);
        }


        int result = 0;

        switch (args[1].charAt(0)) {
            case '+': result = operandOne + operandTwo;
            break;

            case '-': result = operandOne - operandTwo;
            break;

            case '.': result = operandOne * operandTwo;
            break;

            case '/': result = operandOne / operandTwo;
            break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
