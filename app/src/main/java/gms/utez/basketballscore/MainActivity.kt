package gms.utez.basketballscore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pointsLocalX = 0
        var pointsVisitorX = 0

        //Local
        btnMas1Local.setOnClickListener{
            pointsLocalX = pointsLocal.text.toString().toInt()
            pointsLocalX = pointsLocalX + 1
            pointsLocal.text = pointsLocalX.toString()
        }

        btnMas2Local.setOnClickListener {
            pointsLocalX = pointsLocal.text.toString().toInt()
            pointsLocalX = pointsLocalX + 2
            pointsLocal.text = pointsLocalX.toString()
        }

        btnMenos1Local.setOnClickListener {
            pointsLocalX = pointsLocal.text.toString().toInt()
            if (pointsLocalX == 0){
                Toast.makeText(this, "Chuco, no se puede hacer eso",  Toast.LENGTH_LONG).show()
            } else{
                pointsLocalX = pointsLocalX -1
                pointsLocal.text = pointsLocalX.toString()
            }

        }
        //Visitante

        btnMas1Visitor.setOnClickListener{
            pointsVisitorX = pointsVisitor.text.toString().toInt()
            pointsVisitorX = pointsVisitorX + 1
            pointsVisitor.text = pointsVisitorX.toString()
        }

        btnMas2Visitor.setOnClickListener {
            pointsVisitorX = pointsVisitor.text.toString().toInt()
            pointsVisitorX = pointsVisitorX + 2
            pointsVisitor.text = pointsVisitorX.toString()
        }

        btnMenos1Visitor.setOnClickListener {
            pointsVisitorX = pointsVisitor.text.toString().toInt()
            if (pointsVisitorX == 0){
                Toast.makeText(this, "Chuco, no se puede hacer eso",  Toast.LENGTH_LONG).show()
            } else{
                pointsVisitorX = pointsVisitorX - 1
                pointsVisitor.text = pointsVisitorX.toString()
            }

        }
        btnReinicio.setOnClickListener{
            pointsLocal.text = "0"
            pointsVisitor.text = "0"
            pointsLocalX = 0
            pointsVisitorX = 0
        }

        btnFinish.setOnClickListener {
            val i = Intent(this, FinishedActivity::class.java).apply {
                putExtra("pLocal", pointsLocalX.toString())
                putExtra("pVisitor", pointsVisitorX.toString())
            }
            startActivity(i)
        }
    }
}