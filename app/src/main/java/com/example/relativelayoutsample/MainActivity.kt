package com.example.relativelayoutsample



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // Зв'язування елементів з XML
        val entry = findViewById<EditText>(R.id.entry)
        val okButton = findViewById<Button>(R.id.ok)
        val cancelButton = findViewById<Button>(R.id.cancel)

        // Обробник для кнопки OK
        okButton.setOnClickListener {
            val inputText = entry.text.toString()
            Toast.makeText(this, "Ви ввели: $inputText", Toast.LENGTH_SHORT).show()
        }

        // Обробник для кнопки Cancel
        cancelButton.setOnClickListener {
            entry.setText("")
        }
    }
}
