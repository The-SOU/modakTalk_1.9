package com.modak.modaktestone.navigation.terms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.modak.modaktestone.databinding.ActivityCommunityRuleBinding
import com.modak.modaktestone.databinding.ActivityHandlingPolicyBinding

class CommunityRuleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCommunityRuleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunityRuleBinding.inflate(layoutInflater)
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