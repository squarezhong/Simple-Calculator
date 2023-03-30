package com.example.simplator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.simplator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*Number Buttons*/

        binding.tvOne.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("1")
        }

        binding.tvTwo.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("2")
        }

        binding.tvThree.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("3")
        }
        binding.tvFour.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("4")
        }

        binding.tvFive.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("5")
        }

        binding.tvSix.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("6")
        }

        binding.tvSeven.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("7")
        }

        binding.tvEight.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("8")
        }

        binding.tvNine.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("9")
        }

        binding.tvZero.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("0")
        }

        /*Operators*/

        binding.tvPlus.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("+")
        }

        binding.tvMinus.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("-")
        }

        binding.tvMul.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("*")
        }

        binding.tvDivide.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append("/")
        }

        binding.tvDot.setOnClickListener {
            binding.tvResult.text = ""
            binding.tvExpression.append(".")
        }

        binding.tvClear.setOnClickListener {
            binding.tvExpression.text = ""
            binding.tvResult.text = ""
        }

        binding.tvEquals.setOnClickListener {
            val text = binding.tvExpression.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                binding.tvResult.text = longResult.toString()
            } else {
                binding.tvResult.text = result.toString()
            }
        }

        binding.tvBack.setOnClickListener {
            val text = binding.tvExpression.text.toString()
            if(text.isNotEmpty()) {
                binding.tvExpression.text = text.dropLast(1)
            }

            binding.tvResult.text = ""
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_item -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return true }
}