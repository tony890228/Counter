package tw.csim.edu.pu.gm.s1071461.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

    var counter:Int=0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text=counter.toString()
    }
    fun Addone(v:View) {
        counter++
        txv.text = counter.toString()
    }

}