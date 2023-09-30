package jp.ac.it_college.std.s22020.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.ac.it_college.std.s22020.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listener = HelloListener()
        binding.btClick.setOnClickListener(listener)
    }

    private  inner class HelloListener: View.OnClickListener {
        override fun onClick(v: View?) {
            val inputStr = binding.etName.text.toString()
            binding.tvOutput.text = "${inputStr}さん、こんにちは"
        }

    }
}