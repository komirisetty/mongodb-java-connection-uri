import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
public class MongoTest {

	public static void main(String args[]){

		String uri = "mongodb+srv://alphasourceuser:Prestige123$$@alphasourcestagingclust.o6sdv.azure.mongodb.net/foodyhive?retryWrites=true&w=majority";
		MongoClientURI mgURI = new MongoClientURI(uri);
		MongoClient mongo = new MongoClient(mgURI);
		/**** Get database ****/
		MongoDatabase dataBase = mongo.getDatabase("foodyhive");
		
		// display all the database
	     MongoIterable<String> list = mongo.listDatabaseNames();
	      for (String name : list) {
	         System.out.println(name);
	      }
	  
	      MongoCollection<Document> coll = dataBase.getCollection("Promocode");
		
	  	// display all the Collections
		for (String name : dataBase.listCollectionNames()) {
		    System.out.println(name);
		}
		     
	}
}
