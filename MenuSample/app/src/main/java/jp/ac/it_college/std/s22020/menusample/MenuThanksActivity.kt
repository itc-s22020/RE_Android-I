package jp.ac.it_college.std.s22020.menusample

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import jp.ac.it_college.std.s22020.menusample.databinding.ActivityMenuThanksBinding

class MenuThanksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuThanksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuThanksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val menuName = intent.getStringExtra("menuName") ?: ""
        val menuPrice = intent.getIntExtra("menuPrice", 0)

        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%,d".format(menuPrice)

        binding.btThxBack.setOnClickListener {
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val result = when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
        return result
    }
}