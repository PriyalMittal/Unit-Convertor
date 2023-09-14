//activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent" android:layout_height="match_parent"
android:orientation="vertical" android:background="@drawable/ucimage" tools:context=".MainActivity">

<LinearLayout
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginLeft="20dp" android:layout_marginTop="30dp" android:orientation="horizontal">

<TextView
android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@string/enter_the_number" android:textColor="@color/black" android:textSize="20dp" android:textStyle="bold" />

<EditText
android:id="@+id/text" android:layout_width="wrap_content" android:layout_height="wrap_content" android:layout_marginLeft="10dp" android:layout_marginRight="20dp" android:textColor="@color/black" android:textSize="20dp" android:text="0.2"/>

<Spinner
android:id="@+id/units" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_gravity="center" android:popupBackground="#5E5E3F46" android:text="@array/units" />
</LinearLayout>

<TextView
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="42dp" android:gravity="center_horizontal" android:padding="10dp"
android:text="@string/select_the_unit_you_want_to_convert_to" android:textColor="@color/white"
android:textSize="30dp" android:textStyle="bold" />

<Spinner
android:id="@+id/unit" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginLeft="50dp" android:layout_marginTop="10dp" android:layout_marginRight="50dp" android:popupBackground="#5E5E3F46" android:text="@array/units" />

<Button
android:id="@+id/button" android:layout_width="wrap_content" android:layout_height="wrap_content" android:layout_gravity="center" android:layout_marginTop="70dp" android:text="@string/convert" />

</LinearLayout>



//MainActivity.java

package com.example.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView; import android.widget.ArrayAdapter; import android.widget.Button; import android.widget.EditText; import android.widget.Spinner; import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
View.OnClickListener, AdapterView.OnItemSelectedListener {

Spinner sp1, sp2; Button b; EditText e;
 
String text1 = "", text2 = ""; double num=0.0;

@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
sp1 = findViewById(R.id.units); sp2 = findViewById(R.id.unit); b = findViewById(R.id.button); e = findViewById(R.id.text);

ArrayAdapter<CharSequence> flo = ArrayAdapter.createFromResource(this, R.array.units, R.layout.support_simple_spinner_dropdown_item);
sp1.setAdapter(flo); ArrayAdapter<CharSequence> uni =
ArrayAdapter.createFromResource(this, R.array.units, R.layout.support_simple_spinner_dropdown_item);
sp2.setAdapter(uni); sp1.setOnItemSelectedListener(this); sp2.setOnItemSelectedListener(this); b.setOnClickListener(this);
}

@Override
public void onItemSelected(AdapterView<?> parent, View view, int
position, long id) {
text1 = sp1.getSelectedItem().toString(); text2 = sp2.getSelectedItem().toString();
}

@Override
public void onNothingSelected(AdapterView<?> parent) {

}

@Override
public void onClick(View v) {
String number=e.getText().toString(); num = Double.parseDouble(number); switch (text1) {
case "km":
switch (text2) {
case "km":
break; case "hm":
num = num * 10;
break; case "Dm":
num = num * 100;
break; case "m":
num = num * 1000;
 
break; case "dm":
num = num * 10000;
break; case "cm":
num = num * 100000;
break; case "mm":
num = num * 1000000;
break; case "lb":
num = num * 2.20462;
break; case "in":
num = num * 39370.1;
break; case "ft":
num = num * 3280.84;
break;
}
break; case "hm":
switch (text2) {
case "km":
num = num * 0.1;
break; case "hm":
break; case "Dm":
num = num * 10;
break; case "m":
num = num * 100;
break; case "dm":
num = num * 1000;
break; case "cm":
num = num * 10000;
break; case "mm":
num = num * 100000;
break; case "lb":
num = num * 2.20462 * 10;
break; case "in":
num = num * 3937.01;
break; case "ft":
num = num * 328.084;
break;
}
break;
 
case "Dm":
switch (text2) {
case "km":
num = num * 0.01;
break; case "hm":
num = num * 0.1;
break; case "Dm":
break; case "m":
num = num * 10;
break; case "dm":
num = num * 100;
break; case "cm":
num = num * 1000;
break; case "mm":
num = num * 10000;
break; case "lb":
num = num * 2.20462 * 100;
break; case "in":
num = num * 393.701;
break; case "ft":
num = num * 32.8084;
break;
}
break; case "m":
switch (text2) {
case "km":
num = num * 0.001;
break; case "hm":
num = num * 0.01;
break; case "Dm":
num = num * 0.1;
break; case "m":
break; case "dm":
num = num * 10;
break; case "cm":
num = num * 100;
break; case "mm":
num = num * 1000;
 
break; case "lb":
num = num * 2.20462 * 1000;
break; case "in":
num = num * 39.3701;
break; case "ft":
num = num * 3.28084;
break;
}			
break;			
case "dm":			
switch (text2) {			
case "km":			
num = num	*	0.0001;	
break;			
case "hm":			
num = num	*	0.001;	
break;			
case "Dm":			
num = num	*	0.01;	
break;			
case "m":			
num = num	*	0.1;	
break;			
case "dm":			
break;			
case "cm":			
num = num	*	10;	
break;			
case "mm":			
num = num	*	100;	
break;			
case "lb":			
num = num	*	2.20462 *	10000;
break;			
case "in":			
num = num	*	3.93701;	
break;			
case "ft":			
num = num	*	0.328084;	
break;			
}			
break;			
case "cm":			
switch (text2) {			
case "km":			
num = num	*	0.00001;	
break;			
case "hm":			
num = num	*	0.0001;	
break;			
case "Dm":			
 
num = num	*	0.001;
break;		
case "m":		
num = num	*	0.01;
break;		
case "dm":		
num = num	*	0.1;
break;		
case "cm":		
break;		
case "mm":		
num = num	*	10;
break;		
case "lb":		
num = num	*	2.20462 * 100000;
break;		
case "in":		
num = num	*	0.393701;
break;		
case "ft":		
num = num	*	0.0328084;
break;		
}		
break;		
case "mm":		
switch (text2) {		
case "km":		
num = num	*	0.000001;
break;		
case "hm":		
num = num	*	0.00001;
break;		
case "Dm":		
num = num	*	0.0001;
break;		
case "m":		
num = num	*	0.001;
break;		
case "dm":		
num = num	*	0.01;
break;		
case "cm":		
num = num	*	0.1;
break;		
case "mm":		
break;		
case "lb":		
num = num	*	2.20462 * 1000000;
break;		
case "in":		
num = num	*	0.0393701;
break;		
case "ft":		
num = num	*	0.00328084;
 
break;
}
break; case "lb":
switch (text2) {
case "km":
num = num * 0.453592;
break; case "hm":
num = num * 0.453592 * 10;
break; case "Dm":
num = num * 0.453592 * 100;
break; case "m":
num = num * 0.453592 * 1000;
break; case "dm":
num = num * 0.453592 * 10000;
break; case "cm":
num = num * 0.453592 * 100000;
break; case "mm":
num = num * 0.453592 * 1000000;
break; case "lb":
break; case "in":
num = num * 0.453592 * 39370.1;
break; case "ft":
num = num * 0.453592 * 39370.1 * 0.0833333;
break;
}
break; case "in":
switch (text2) {
case "km":
num = num * 0.0000254 ;
break; case "hm":
num = num * 0.000254 ;
break; case "Dm":
num = num * 0.00254 ;
break; case "m":
num = num * 0.0254 ;
break; case "dm":
num = num * 0.254 ;
break; case "cm":
 
num = num * 2.54;
break; case "mm":
num = num * 25.4;
break; case "lb":
num = num * 25.4 * 0.002204623;
break; case "in":
break; case "ft":
num = num * 0.0833333;
break;
}
break; case "ft":
switch (text2) {
case "km":
num = num * 0.0003048;
break; case "hm":
num = num * 0.003048;
break; case "Dm":
num = num * 0.03048;
break; case "m":
num = num * 0.3048;
break; case "dm":
num = num * 3.048;
break; case "cm":
num = num * 30.48;
break; case "mm":
num = num * 304.8;
break; case "lb":
num = num * 12 * 25.4 * 0.002204623;
break; case "in":
num = num * 12;
break; case "ft":
break;
}
break;
}
String s = Double.toString(num);
Intent i = new Intent(this, SecondActivity.class); i.putExtra("answer", s);
i.	putExtra("selected", text2); startActivity(i);
 
}
}



//activity_second.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent" android:layout_height="match_parent"
android:background="#85875330" tools:context=".SecondActivity" android:orientation="vertical">

<TextView
android:id="@+id/answer" android:layout_width="match_parent" android:layout_height="wrap_content" android:textStyle="bold" android:gravity="center" android:textSize="40sp" android:layout_marginTop="150dp" android:text="@string/answer"/>

<TextView
android:id="@+id/ans" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="40dp" android:textSize="30sp" android:gravity="center" tools:text="num"/>

</LinearLayout>



//SecondActivity.java

package com.example.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity { TextView t;
 
@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_second);
t = findViewById(R.id.ans); Intent i = getIntent();
String m = i.getStringExtra("answer"); String p = i.getStringExtra("selected"); String result = m + " " + p; t.setText(result);
}
}



//strings.xml

<resources>
<string name="app_name">Unit Converter</string>
<string name="enter_the_number">Enter the number :</string>
<string name="select_the_unit_you_want_to_convert_to">Select the unit you want to convert to</string>
<string name="convert">convert</string>
<string name="answer">Answer</string>
<string-array name="units">
<item>km</item>
<item>hm</item>
<item>Dm</item>
<item>m</item>
<item>dm</item>
<item>cm</item>
<item>mm</item>
<item>lb</item>
<item>in</item>
<item>ft</item>
</string-array>
</resources>


     
     
