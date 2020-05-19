package com.christophe.main;

import com.christophe.database.DbHelper;
import com.christophe.model.User;
import com.mongodb.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(MainApplication.class, args);
        User user = new User();
        user.setUserName("chris");
        user.setUserAge("23");
        MongoClient client = DbHelper.connectToDb();
        DBCollection usersCollection = DbHelper.getCollection(DbHelper.getDb(client),"Users");
        DBObject userObj = new BasicDBObject()
                .append("name", user.getUserName())
                .append("age", user.getUserAge());
       usersCollection.save(userObj);

    }

}
