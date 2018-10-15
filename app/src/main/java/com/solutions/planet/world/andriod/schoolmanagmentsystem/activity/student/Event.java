package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.MySingleTone;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.adapter.EventAdapter;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.model.DemoList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Event extends AppCompatActivity {

    public static final String URL = "https://simplifiedcoding.net/demos/view-flipper/heroes.php";
    public static final String TAG = Event.class.getCanonicalName();
    Context context;
    RequestQueue requestQueue;
    EventAdapter eventAdapter;
    ArrayList<DemoList> demoLists;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Log.i(TAG, "onCreate: ");
        context = Event.this;
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.rvEvent);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        demoLists = new ArrayList<>();
        getData();

    }

    private void getData() {
        Log.i(TAG, "getData: ");

        requestQueue = Volley.newRequestQueue(context);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i(TAG, "onResponse: ");
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            for (int i = 0; i < response.length(); i++) {
                                Log.i(TAG, "onResponse: "+response.length());
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                String name = jsonObject.getString("name");
                                String imageurl = jsonObject.getString("imageurl");
                                DemoList demoList = new DemoList(name, imageurl);
                                demoLists.add(demoList);
                                Log.i(TAG, "onResponse: "+response);
                            }

                            eventAdapter = new EventAdapter(Event.this, demoLists);
                            recyclerView.setAdapter(eventAdapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "onErrorResponse: ");
                VolleyLog.e("Error: ", error.getMessage());
            }
        });

        MySingleTone.getInstance(getApplicationContext()).addToRequest(jsonObjectRequest);

    }
}
