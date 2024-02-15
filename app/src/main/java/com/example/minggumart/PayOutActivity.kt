package com.example.minggumart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minggumart.databinding.ActivityPayOutBinding

class PayOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPayOutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.placeMyHolder.setOnClickListener {
            val bottomSheetDialog = CongratulationBottomSheetFragment()
            bottomSheetDialog.show(supportFragmentManager, "Test")
        }
    }
}