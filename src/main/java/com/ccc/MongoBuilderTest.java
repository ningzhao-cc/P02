package com.ccc;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.log.LoggerLog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Filters.gte;
import static java.util.Arrays.asList;

/**
 * Created by Ning on 2/11/18.
 */
public class MongoBuilderTest {

    public static void main(String[] args) {
        //MongoClient client = new MongoClient();
        //
        //MongoDatabase database = client.getDatabase("test");
        //MongoCollection<Document> zips = database.getCollection("zips");
        //
        //
        //List<Document> res = zips.find().into(new ArrayList<Document>());
        //
        //
        ////
        ////List<Document> pipeline = asList(new Document("$group",
        ////                                    new Document("_id", "$state").append("totalPop",
        ////                                                                        new Document("$sum", "$pop"))),
        ////                                new Document("$match", new Document("totalPop",
        ////                                                            new Document("$gt", 10 * 1000 *1000))));
        ////List<Document> res = zips.aggregate(pipeline).into(new ArrayList<>());
        //
        //// builder pattern for mongo aggregation framework
        ////List<Bson> pipeline = asList(group("$state", Accumulators.sum("totalPop", "$pop")),
        ////        match(gte("totalPop", 10*1000*1000)));
        ////
        ////List<Document> res = zips.aggregate(pipeline).into(new ArrayList<>());
        //for (Document doc : res) {
        //    System.out.println(doc.toJson());
        //}


        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("test");
        MongoCollection<Document> albums = database.getCollection("albums");
        MongoCollection<Document> images = database.getCollection("images");


        HashSet<Integer> image_ids = new HashSet<>();
        List<Document> album_lists = albums.find().into(new ArrayList<>());
        for (Document doc : album_lists) {
            List<Integer> id_list = (List<Integer>)doc.get("images");
            image_ids.addAll(id_list);
        }

        int count = 0;

        List<Document> image_list = images.find().into(new ArrayList<>());

        Iterator iterator = image_list.iterator();

        while (iterator.hasNext()) {
            Document doc = (Document)iterator.next();
            if (image_ids.contains(doc.get("_id")) && ((List<String>)doc.get("tags")).contains("sunrises")) {
                count++;
            }
        }

        System.out.println(count);

    }

}
