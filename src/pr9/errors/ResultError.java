package pr9.errors;

public class ResultError {
    protected Exception error;

    public ResultError(Exception error) {
        this.error = error;
    }
}
