package lk.ijse.spring_pos_api.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {}

    public CustomerNotFoundException(String message) {}

    public CustomerNotFoundException(String message, Throwable cause) {}
}
