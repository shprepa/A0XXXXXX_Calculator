package sh.a0xxxxxx_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates a pointer to the XML's Textview control using the built-in method findViewById
        TextView txtOutput = (TextView) findViewById(R.id.txtOutput);

//String variable where the result is going to be stored
        String sOut = "";

//Int variables with the first number (firstNum) and second number (secondNum) values
        int firstNum = 5;
        int secondNum = 10;

//Executes and displays the addition, subtraction, multiplication and division operations and stores the results in the sOut variable
        sOut += firstNum + " + " + secondNum + " = " + (firstNum + secondNum) + "\n";
        sOut += firstNum + " - " + secondNum + " = " + (firstNum - secondNum) + "\n";;
        sOut += firstNum + " * " + secondNum + " = " + (firstNum * secondNum) + "\n";;
        sOut += firstNum + " / " + secondNum + " = " + (firstNum / secondNum) + "\n";;

//Displays the value of the variable sOut on the Textview txtOutput previously declared
        txtOutput.setText(sOut);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
