package com.example.helloworld.gyjv.live

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun clickEvent(v: View){
        when(v.id){
            R.id.leftBracket ->{
                Toast.makeText(this,leftBracket.text,Toast.LENGTH_SHORT).show()
            }
            R.id.rightBracket ->{
                Toast.makeText(this,findViewById<Button>(R.id.rightBracket).text,Toast.LENGTH_SHORT).show()
            }
            R.id.percentage ->{
                Toast.makeText(this,findViewById<Button>(R.id.percentage).text,Toast.LENGTH_SHORT).show()
            }
            R.id.on->{
                Toast.makeText(this,findViewById<Button>(R.id.on).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num7 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num7).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num8 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num8).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num9 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num9).text,Toast.LENGTH_SHORT).show()
            }
            R.id.arthDiv->{
                Toast.makeText(this,findViewById<Button>(R.id.arthDiv).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num4 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num4).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num5 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num5).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num6 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num6).text,Toast.LENGTH_SHORT).show()
            }
            R.id.arthMul ->{
                Toast.makeText(this,findViewById<Button>(R.id.arthMul).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num1 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num1).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num2 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num2).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num3->{
                Toast.makeText(this,findViewById<Button>(R.id.num3).text,Toast.LENGTH_SHORT).show()
            }
            R.id.arthSub ->{
                Toast.makeText(this,findViewById<Button>(R.id.arthSub).text,Toast.LENGTH_SHORT).show()
            }
            R.id.num0 ->{
                Toast.makeText(this,findViewById<Button>(R.id.num0).text,Toast.LENGTH_SHORT).show()
            }
            R.id.point ->{
                Toast.makeText(this,findViewById<Button>(R.id.point).text,Toast.LENGTH_SHORT).show()
            }
            R.id.equal ->{
                Toast.makeText(this,findViewById<Button>(R.id.equal).text,Toast.LENGTH_SHORT).show()
            }
            R.id.plus ->{
                Toast.makeText(this,findViewById<Button>(R.id.plus).text,Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}