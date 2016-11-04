package utility;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by Mohammed Ibrahim on 4/11/16.
 */

public class MyUtility {

    public void registerStudent(final Context context, String name, String email, long phoneNumber, String address, final RegistrationCallBackInterface registrationCallBackInterface){

        RequestQueue queue = Volley.newRequestQueue(context);
        String url ="";
        Toast.makeText(context, ""+url, Toast.LENGTH_SHORT).show();

// Request a string response from the provided URL.
        JsonObjectRequest str=new JsonObjectRequest(Request.Method.GET, url,null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("jsonfrom Server",""+response.toString());
                registrationCallBackInterface.onResult();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

// Add the request to the RequestQueue.
        queue.add(str);

    }
}
