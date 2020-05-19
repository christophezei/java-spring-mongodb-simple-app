package com.christophe.database;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.net.UnknownHostException;

public class DbHelper {
    public static MongoClient connectToDb() throws UnknownHostException {
        return new MongoClient(new MongoClientURI("mongodb://ui0acsksrucy3kgegttk:kd0E1NEaq7mSB6Ol2369@blskjsshbntrgcg-mongodb.services.clever-cloud.com:27017/blskjsshbntrgcg"));
    }

    public static DB getDb(MongoClient mongoClient) throws UnknownHostException {
        return mongoClient.getDB("blskjsshbntrgcg");
    }

    public static DBCollection getCollection(DB database, String collectionName){
       return database.getCollection(collectionName);
    }

}
