package udf;

import static org.junit.Assert.assertEquals;
import static  pyspark.java.udf.JavaTransformFunctions.transformFieldValueEnding;

import org.junit.Test;


public class PySparkJavaUDFTest {

    @Test
    public void testMultiply() throws Exception {
        assertEquals(String.valueOf("415-9012-8080305772cf"), transformFieldValueEnding("415-9012-8080305772cf", 8, "#"),
                "305772cf#############");
    }

}
