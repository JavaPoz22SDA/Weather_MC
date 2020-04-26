package pl.sda.weather.project;

public class APIError {

    private boolean success;
    private Error error;

    public APIError() {
    }

    public APIError(boolean success, Error error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
