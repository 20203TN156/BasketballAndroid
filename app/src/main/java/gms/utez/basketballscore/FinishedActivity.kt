package gms.utez.basketballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        var pointsTeamLocal = intent.getStringExtra("pLocal")
        var pointsTeamVisitor = intent.getStringExtra("pVisitor")
        val points = "$pointsTeamLocal - $pointsTeamVisitor"
        tvPoints.text = points

        if(pointsTeamLocal == pointsTeamVisitor ){
            tvResul.text = resources.getString(R.string.app_tied)
        } else if (pointsTeamLocal.toString().toInt() > pointsTeamVisitor.toString().toInt()){
            tvResul.text = resources.getString(R.string.app_local_victory)
        } else if (pointsTeamVisitor.toString().toInt() > pointsTeamLocal.toString().toInt()){
            tvResul.text = resources.getString(R.string.app_visitor_victory)
        }
    }
}