package com.example.hellotoast

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // setting binding inflate
        binding = ActivityMainBinding.inflate(layoutInflater)

        //setting content dari layar activity: MainActivity
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()

            // jika btn count diklik
            btnCount.setOnClickListener {
                number = number + 1
                txtNumber.text = number.toString()
            }

            // jika btn toast diklik
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Count $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
