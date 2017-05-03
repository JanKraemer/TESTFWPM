import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import models.Participant;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jan on 26.04.2017.
 */
public class FWPM {

    public static void main(String[] args) {
        String bearer = firstRequestForBearerToken("https://apistaging.fiw.fhws.de/auth/api/users/me");
        String text = getAllParticipants("https://apistaging.fiw.fhws.de/election/api/ballots", bearer);
        System.out.print(text);
    }

    private static String firstRequestForBearerToken(String urlString)
    {
        String auth = "";
        try{
            URL url = new URL(urlString);

            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization","Basic Ym9uZDpoZno1NnJnNg==");

            auth= connection.getHeaderField("X-fhws-jwt-token");
            connection.disconnect();
        }catch (Exception e)
        {

        }
        return auth;
    }

    private static String getAllParticipants( String urlString, String token){

        List<Participant> list = new LinkedList<Participant>();
        String listString = "";
        try{
            Client client = Client.create();
            WebResource webResource = client
                    .resource(urlString);

            ClientResponse response = webResource.header("Authorization","Bearer "+token)
                    .get(ClientResponse.class);

            System.out.println(response.getStatus());
            listString= response.getEntity(String.class);
           // Gson gson=new Gson();
          //  Type type = new TypeToken<List<Participant>>(){}.getType();
          //  list = gson.fromJson(listString, type);
           // response.close();
        }catch (Exception e)
        {

        }
        return listString;



    }
}
