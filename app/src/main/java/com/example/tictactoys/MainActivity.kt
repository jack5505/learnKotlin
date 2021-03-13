package com.example.tictactoys

import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun bu1(view: View) {
        val selected = view as Button
        Log.d("buClick ", selected.id.toString())
        var cellId = 0;
        when(selected.id){
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9
        }
        playGame(cellId,selected)
    }

    var activePlayer = 1;

    var player1 = ArrayList<Int>();
    var player2 = ArrayList<Int>();

    fun playGame(cellId: Int, btn: Button){
            if(activePlayer == 1){
                btn.text = "X"
                btn.setBackgroundColor(R.color.blue)
                player1.add(cellId)
                activePlayer = 2;
            }else{
                btn.text = "0"
                btn.setBackgroundColor(R.color.darkGreen)
                player2.add(cellId)
                activePlayer = 1
            }
    }
}