package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.bus.BusActivity;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.StudentActivity;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher.TeacherActivity;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.model.LoginModel;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.solution.planet.world.andriod.jawahargurukulenglishschool.R.*;

public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String TAG = LoginActivity.class.getCanonicalName();
    Context context;
    String item;
    EditText etUserName, etPassword;
    private static final int REQ_GROUP_PERMISSION = 425;
    RequestQueue requestQueue;
    public static final String URL = "http://myapijges.azurewebsites.net/api/Login/";
    ArrayList<LoginModel> loginModelsArrayList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = LoginActivity.this;
        Log.i(TAG, "onCreate: ");
        Spinner spinner = findViewById(id.spinner);
        etUserName = findViewById(id.etUserName);
        etPassword = findViewById(id.etPassword);

        ArrayList<String> permissionsNeeded = new ArrayList<>();
        ArrayList<String> permissionsAvailable = new ArrayList<>();
        permissionsAvailable.add(Manifest.permission.READ_CONTACTS);
        permissionsAvailable.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        permissionsAvailable.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        permissionsAvailable.add(Manifest.permission.MEDIA_CONTENT_CONTROL);
        permissionsAvailable.add(Manifest.permission.CALL_PHONE);
        permissionsAvailable.add(Manifest.permission.INTERNET);

        for (String permission : permissionsAvailable) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED)
                permissionsNeeded.add(permission);
        }

        requestGroupPermission(permissionsNeeded);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_spinner_item, getResources().getStringArray(array.catagery));
        dataAdapter.setDropDownViewResource(layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

         getData();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void btnLogin(View view) {
        if (!item.isEmpty()) {
            if (item.contains("Parent"))
                validationParent();
            else if (item.contains("Teacher"))
                validationTeacher();
            else if (item.contains("-- Select --"))
                validation();
            else if (item.contains("Bus"))
                validationBus();
        }

      /*  for (int i = 0; i < loginModelsArrayList.size(); i++) {
            if (loginModelsArrayList.get(i).getLoginType() == item) {
                if (item == getEtPassword() == getEtUserName())
            }

            if (getEtUserName() == getEtPassword() == item) {

            }
        }*/
    }

    private void validation() {
        if (item.contains("-- Select --"))
            Toast.makeText(context, "Please select user type", Toast.LENGTH_SHORT).show();
        clearText();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void validationBus() {
        if (item.contains("Bus")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else {
                clearText();
                startActivity(new Intent(context, BusActivity.class));
            }
        }
    }

    private void validationTeacher() {
        if (item.contains("Teacher")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else {

                clearText();
                startActivity(new Intent(context, TeacherActivity.class));
            }
        }
    }

    private void validationParent() {
        if (item.contains("Parent")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else {
                LoginModel loginModel = new LoginModel(getEtUserName(), getEtPassword(), item);
                startActivity(new Intent(context, StudentActivity.class));
                clearText();
            }
        }
    }

    public String getEtUserName() {
        return etUserName.getText().toString().trim();
    }

    public String getEtPassword() {
        return etPassword.getText().toString().trim();
    }

    public void clearText() {
        etUserName.setText("");
        etPassword.setText("");
    }

    private void requestGroupPermission(ArrayList<String> permissions) {
        String[] permissionList = new String[permissions.size()];
        permissions.toArray(permissionList);
        ActivityCompat.requestPermissions(LoginActivity.this, permissionList, REQ_GROUP_PERMISSION);
    }

    private void getData() {
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i(TAG, "onResponse: " + response);

                        try {
                            JSONArray jsonArray = response.getJSONArray("user");
                            for (int i = 0; i > jsonArray.length(); i++) {
                                JSONObject dataList = jsonArray.getJSONObject(i);
                                Log.i(TAG, "onResponse: " + dataList);
                               /* LoginModel loginModel = new LoginModel(
                                        dataList.getString("UserId"),
                                        dataList.getString("Password"),
                                        dataList.getString("LoginType"));*/

                                Log.i(TAG, "onResponse: data "
                                        + dataList.getString("UserId")
                                        + dataList.getString("Password")
                                        + dataList.getString("LoginType"));

                             //   loginModelsArrayList.add(loginModel);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i(TAG, "onErrorResponse: " + error);
                    }
                });

        requestQueue.add(jsonObjectRequest);

    }
}