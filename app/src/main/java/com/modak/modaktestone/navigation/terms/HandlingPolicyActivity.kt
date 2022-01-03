package com.modak.modaktestone.navigation.terms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.modak.modaktestone.R
import com.modak.modaktestone.databinding.ActivityHandlingPolicyBinding
import com.modak.modaktestone.databinding.ActivityNoticeDetailBinding
import com.modak.modaktestone.navigation.EditContentActivity
import com.modak.modaktestone.navigation.ReportViewActivity

class HandlingPolicyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHandlingPolicyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandlingPolicyBinding.inflate(layoutInflater)
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