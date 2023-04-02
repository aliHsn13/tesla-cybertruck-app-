package com.example.teslamotor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import com.example.teslamotor.databinding.ActivityMain2Binding
import kotlin.properties.Delegates

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewAC.isInvisible = false

        binding.btnGoToAcFragment.setOnClickListener {
            if (!binding.imageViewAC.isInvisible) {
                val acfrgment = acFragment(this)
                acfrgment.show(supportFragmentManager, null)
            } else {
                Toast.makeText(this, "please turn on A/C first", Toast.LENGTH_SHORT).show()
            }

        }
        /**********************************************************************************/
        binding.btnOnOff.setOnClickListener {
            if (!binding.imageViewAC.isInvisible) {
                binding.btnOnOff.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                binding.btnOnOff.setShadowColorDark(
                    ContextCompat.getColor(
                        this,
                        R.color.new_shadow1
                    )
                )
                binding.btnOnOff.setShadowColorLight(
                    ContextCompat.getColor(
                        this,
                        R.color.new_shadow2
                    )
                )
                binding.acMode.text = "A/C is off"
                binding.textViewAC.text = "A/C is off"
                binding.imageViewAC.isInvisible = true
            } else {
                binding.imageViewAC.isInvisible = false
                binding.btnOnOff.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.blue_light
                    )
                )
                binding.acMode.text = "A/C is on"
                binding.textViewAC.text = "A/C is on"
            }
        }
        /**********************************************************************************/
    }

}