package com.yllu;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecordBuilder;

public class GenericRecordYL {

    public static void main(String[] args) {

        Schema.Parser parser = new Schema.Parser();
        Schema customerSchema = parser.parse("{\n" +
                "     \"type\": \"record\",\n" +
                "     \"namespace\": \"com.example\",\n" +
                "     \"name\": \"Customer\",\n" +
                "     \"fields\": [\n" +
                "       { \"name\": \"first_name\", \"type\": \"string\", \"doc\": \"First Name of Customer\" },\n" +
                "       { \"name\": \"last_name\", \"type\": \"string\", \"doc\": \"Last Name of Customer\" },\n" +
                "       { \"name\": \"age\", \"type\": \"int\", \"doc\": \"Age at the time of registration\" },\n" +
                "       { \"name\": \"height\", \"type\": \"float\", \"doc\": \"Height at the time of registration in cm\" },\n" +
                "       { \"name\": \"weight\", \"type\": \"float\", \"doc\": \"Weight at the time of registration in kg\" },\n" +
                "       { \"name\": \"automated_email\", \"type\": \"boolean\", \"default\": true, \"doc\": \"Field indicating if the user is enrolled in marketing emails\" }\n" +
                "     ]\n" +
                "}");

        GenericRecordBuilder customerBuilder = new GenericRecordBuilder(customerSchema);

        customerBuilder.set("first_name", "John");
        customerBuilder.set("last_name", "Snow");
        customerBuilder.set("age", 27);
        customerBuilder.set("height", 183f);
        customerBuilder.set("weight", 81f);
        customerBuilder.set("automated_email", true);

        GenericData.Record record = customerBuilder.build();
        System.out.println(record);


    }
}
