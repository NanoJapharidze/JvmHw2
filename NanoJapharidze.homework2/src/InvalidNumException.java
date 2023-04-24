public class InvalidNumException extends Exception{
    private static String ERROR = "არ გამოიყენოთ უარყოფითი რიცხვები";
    public InvalidNumException(String message) {
        super(message);
    }
    public InvalidNumException() {
        super(ERROR);
    }
}
