package com.example.gson_recall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "horse";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.showJson);
        Gson gson = new Gson();

//        Address address = new Address("Germany", "Berlin");
//        List<FamilyMember> family = new ArrayList<>();
//        family.add(new FamilyMember("Wife", 30));
//        family.add(new FamilyMember("Daughter", 5));
//        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
//        String json = gson.toJson(employee);
//        Log.e(TAG, "onCreate: "+json );
//        textView.setText(json);


        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"family\":[{\"age\":30,\"role\":\"Wife\"},{\"age\":5,\"role\":\"Daughter\"}],\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";

//        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
//        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);

        Employee employee = gson.fromJson(json,Employee.class);

//        textView.setText(employee.getmFirstName());

//        public class Employee {
//            @Expose
//            private String firstName;
//            @Expose(serialize = false)
//            private int age;
//            @Expose(deserialize = false)
//            private String mail;
//
//            private String password;
//
//            public Employee(String firstName, int age, String mail, String password) {
//                this.firstName = firstName;
//                this.age = age;
//                this.mail = mail;
//                this.password = password;
//            }
        /*
        Expose means visible
                serialize means work on object to json convert
                deserialize menas work on json to object
                we can set true and false in it....

                to omit any field we can simple do not write expose

                also another keyword work as it "transit" java key word

                like private trnsit name;

            */

    }
}