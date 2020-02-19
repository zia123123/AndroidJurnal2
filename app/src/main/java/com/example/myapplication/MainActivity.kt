package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import com.example.myapplication.databinding.ActivityMainBinding
const val key_a = "key-a"
const val key_b = "key-b"

class MainActivity : AppCompatActivity() {
    private var skorA = 0
    private var skorB = 0
private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            skorA += 3
            binding.skorTeamA = skorA
        }
        binding.button3.setOnClickListener {
            skorA += 2
            binding.skorTeamA = skorA
        }
        binding.button6.setOnClickListener {
            skorA += 1
            binding.skorTeamA = skorA
        }
        binding.button2.setOnClickListener {
            skorB += 3
            binding.skorTeamB = skorB
        }
        binding.button5.setOnClickListener {
            skorB += 2
            binding.skorTeamB = skorB
        }
        binding.button4.setOnClickListener {
            skorB += 1
            binding.skorTeamB = skorB
        }

        binding.button8.setOnClickListener {
            skorB = 0
            skorA = 0
            binding.skorTeamB = skorB
            binding.skorTeamA = skorA

        }
        if (savedInstanceState != null){
            skorA = savedInstanceState.getInt(key_a)
            skorB = savedInstanceState.getInt(key_b)

        }
        binding.skorTeamA = skorA
        binding.skorTeamB = skorB

    }



    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(key_a,skorA)
        outState.putInt(key_b, skorB)
        super.onSaveInstanceState(outState)
    }



}
