import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

public class AssertClass {
    @ParameterizedTest
    @NullSource
    public void assertTest(String str){
        //assertFalse(4>3,"Выражение неверно");
        str = "строка";
        assertNotNull(str,"str null");
    }
}
