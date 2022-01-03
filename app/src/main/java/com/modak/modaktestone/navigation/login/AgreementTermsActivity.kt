package com.modak.modaktestone.navigation.login

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.modak.modaktestone.R
import com.modak.modaktestone.databinding.ActivityAgreementTermsBinding
import com.modak.modaktestone.databinding.ActivitySelectRegionBinding
import com.modak.modaktestone.navigation.SelectRegionActivity
import kotlinx.android.synthetic.main.activity_agreement_terms.*

class AgreementTermsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgreementTermsBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgreementTermsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.agreementBtn.setOnClickListener {
                Toast.makeText(this, "btn", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, SelectRegionActivity::class.java))
                finish()

        }

        binding.totalCheck.setOnCheckedChangeListener(listener)
        binding.firstCheck.setOnCheckedChangeListener(listener)
        binding.secondCheck.setOnCheckedChangeListener(listener)
        binding.thirdCheck.setOnCheckedChangeListener(listener)

        binding.agreementBtn.isEnabled = false
        binding.agreementBtn.backgroundTintList =
            ContextCompat.getColorStateList(applicationContext, R.color.whitegrey)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    var listener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked) {
            when (buttonView.id) {
                R.id.total_check -> {
                    Toast.makeText(this, "total", Toast.LENGTH_SHORT).show()
                    binding.firstCheck.isChecked = true
                    binding.secondCheck.isChecked = true
                    binding.thirdCheck.isChecked = true
                    binding.agreementBtn.isEnabled = true
                    binding.agreementBtn.backgroundTintList =
                        ContextCompat.getColorStateList(
                            applicationContext,
                            R.color.dots_color
                        )
                }
                R.id.first_check -> {
                    Toast.makeText(this, "first", Toast.LENGTH_SHORT).show()
                    if (binding.secondCheck.isChecked && binding.thirdCheck.isChecked) {
                        binding.agreementBtn.isEnabled = true
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(
                                applicationContext,
                                R.color.dots_color
                            )
                    } else {
                        binding.agreementBtn.isEnabled = false
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(applicationContext, R.color.whitegrey)
                    }
                }
                R.id.second_check -> {
                    Toast.makeText(this, "second", Toast.LENGTH_SHORT).show()
                    if (binding.firstCheck.isChecked && binding.thirdCheck.isChecked) {
                        binding.agreementBtn.isEnabled = true
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(
                                applicationContext,
                                R.color.dots_color
                            )
                    } else {
                        binding.agreementBtn.isEnabled = false
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(applicationContext, R.color.whitegrey)
                    }
                }
                R.id.third_check -> {
                    Toast.makeText(this, "third", Toast.LENGTH_SHORT).show()
                    if (binding.secondCheck.isChecked && binding.firstCheck.isChecked) {
                        binding.agreementBtn.isEnabled = true
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(
                                applicationContext,
                                R.color.dots_color
                            )
                    } else {
                        binding.agreementBtn.isEnabled = false
                        binding.agreementBtn.backgroundTintList =
                            ContextCompat.getColorStateList(applicationContext, R.color.whitegrey)
                    }
                }
            }
        } else {
            binding.agreementBtn.isEnabled = false
            binding.agreementBtn.backgroundTintList =
                ContextCompat.getColorStateList(applicationContext, R.color.whitegrey)

        }
    }
}