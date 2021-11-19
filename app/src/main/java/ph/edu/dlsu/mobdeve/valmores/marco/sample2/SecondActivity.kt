package ph.edu.dlsu.mobdeve.valmores.marco.sample2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    var et_username: EditText? = null
    var et_email: EditText? = null
    var et_password: EditText? = null
    var btn_submit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        et_username = findViewById(R.id.et_username)
        et_email = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
        btn_submit = findViewById(R.id.btn_submit)

        btn_submit!!.setOnClickListener {
            Log.i("Second Activity", "name:${et_username?.text} " +
                    "email:${et_email?.text}" +
                    "pass:${et_password?.text}")

            Toast.makeText(applicationContext,
                "name:${et_username?.text} " +
                        "email:${et_email?.text}" +
                        "pass:${et_password?.text}",
                Toast.LENGTH_SHORT
                ).show()

            val gotoHomeActivity = Intent(applicationContext, HomeActivity::class.java)

            var bundle = Bundle()
            bundle.putString("username", et_username!!.text.toString())
            gotoHomeActivity.putExtras(bundle)

            gotoHomeActivity.putExtra("email", et_email!!.text.toString())

            startActivity(gotoHomeActivity)
            finish()
        }
    }
}