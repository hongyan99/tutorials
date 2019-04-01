package com.beanone.aws;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.local.embedded.DynamoDBEmbedded;
import com.amazonaws.services.dynamodbv2.local.main.ServerRunner;
import com.amazonaws.services.dynamodbv2.local.server.DynamoDBProxyServer;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductInfoDAOIntegrationIT {
    private static DynamoDBProxyServer server;
    private static AmazonDynamoDB dynamoDB;

    @BeforeClass
    public static void setupClass() throws Exception {
        System.setProperty("sqlite4java.library.path", "native-libs");
        dynamoDB = createEmbeddedDB();
    }

    private static AmazonDynamoDB createEmbeddedDB() {
        return DynamoDBEmbedded.create().amazonDynamoDB();
    }

    @Test
    public void test() {
        listTables(dynamoDB.listTables());
    }

    private static void listTables(ListTablesResult result) {
        for (String table : result.getTableNames()) {
            System.out.println(table);
        }
    }
}
