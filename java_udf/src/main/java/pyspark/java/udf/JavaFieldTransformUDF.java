package pyspark.java.udf;

import org.apache.spark.sql.api.java.UDF3;

public class JavaFieldTransformUDF implements UDF3<String, Integer, String, String> {

    @Override
    public String call(String token, Integer num, String replacement) throws Exception {
        // reuse existing function
        return JavaTransformFunctions.transformFieldValueEnding(token, num, replacement);
    }
}
