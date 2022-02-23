# using-java-in-pyspark

There are many reason we want to call java function inside pyspark notebook such as implementation protection, reuse existing coding logic and skillset...etc.

[Medium Article: Utilizing Java In PySpark](https://mychen76.medium.com/utilizing-java-in-pyspark-fd386b3eaaf5)


**how to reuse existing java code functionality in pyspark notebook**

1. see sample notebook demo usage
2. see java project demo static method or extend spark UDF interface

**Setup**

1. put your java logic as jaav static function or extending from UDF
2. build java project using maven to create a jar file.
3. deploy jar in spark jar folder before using notebook or perform dynamic loading with by restarting of jupyter notebook kernel after download jars locally.

**Approaches to invoke Java function:**

1. Invoke java function directly as python function
2. register java function as spark UDF

- call it in dataframe
- embeded in sql statement
