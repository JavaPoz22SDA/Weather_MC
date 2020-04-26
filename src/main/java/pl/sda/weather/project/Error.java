package pl.sda.weather.project;

public class Error {
    private int code;
    private String type;
    private String info;

    public Error() {
    }

    public Error(int code, String type, String info) {
        this.code = code;
        this.type = type;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
