package com.modak.modaktestone.navigation.terms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.modak.modaktestone.databinding.ActivityHandlingPolicyBinding
import com.modak.modaktestone.databinding.ActivityServiceTermsBinding

class ServiceTermsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityServiceTermsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServiceTermsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbar = binding.myToolbar
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)
        ab.setDisplayShowCustomEnabled(true)
        ab.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}