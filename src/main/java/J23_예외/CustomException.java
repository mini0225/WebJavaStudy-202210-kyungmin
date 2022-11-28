package J23_예외;


import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException {//예외처리 함.

    @Getter
    private Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}


