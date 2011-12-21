import org.apache.http.Header;
import org.apache.http.client.methods.HttpUriRequest;

public class ExampleUsage {
    public static void makeRequest() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get("http://www.google.com", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(HttpUriRequest request, Header[] headers, String response) {
                System.out.println(response);
            }
        });
    }
}