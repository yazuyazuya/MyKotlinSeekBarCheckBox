package com.example.yazuyazuya.mykotlinseekbarcheckbox

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SeekBarのプログラム
        seekBar.setProgress(0)
        seekBar.max = 100

        seekBar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener {

                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        val str = String.format(Locale.US, "%d %%", progress)
                        textView.text = str
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {

                    }

                }
        )

        // CheckBoxのプログラム
        val checkBox = arrayOfNulls<CheckBox>(3)
        //val context = applicationContext
        val status = arrayOf(
                "未チェック",
                "チェックしたよ",
                "チェックしてないよ"
        )

        /*
        val machParent = LinearLayout.LayoutParams.MATCH_PARENT

        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL
        layout.layoutParams = LinearLayout.LayoutParams(machParent, machParent)

        layout.setBackgroundColor(Color.parseColor("#ddffee"))
        layout.gravity = Gravity.CENTER_VERTICAL

        setContentView(layout)
        */


        for (args in checkBox) {
            val cbox = findViewById<CheckBox>(R.id.checkBox)
            val cbox2 = findViewById<CheckBox>(R.id.checkBox2)
            val cbox3 = findViewById<CheckBox>(R.id.checkBox3)

            cbox.isChecked = false
            cbox2.isChecked = false
            cbox3.isChecked = false
            cbox.text = status[0]
            cbox2.text = status[0]
            cbox3.text = status[0]

            cbox.setOnClickListener {
                val check = cbox.isChecked
                if (check) {
                    cbox.text = status[1]
                } else {
                    cbox.text = status[2]
                }

            }

            cbox2.setOnClickListener {
                val check = cbox2.isChecked
                if (check) {
                    cbox2.text = status[1]
                } else {
                    cbox2.text = status[2]
                }
            }

            cbox3.setOnClickListener {
                val check = cbox3.isChecked
                if (check) {
                    cbox3.text = status[1]
                } else {
                    cbox3.text = status[2]
                }
            }

            /*
            val scale = resources.displayMetrics.density.toInt()
            val margins = 20 * scale

            val wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT
            val checBoxLayout = LinearLayout.LayoutParams(
                    wrapContent, wrapContent)

            checBoxLayout.setMargins(margins*2, margins, margins, margins);
            cbox.layoutParams = checBoxLayout

            layout.addView(cbox)
            */

        }

    }
}
