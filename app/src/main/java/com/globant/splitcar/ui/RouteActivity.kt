package com.globant.splitcar.ui

import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.globant.splitcar.R
import com.globant.splitcar.model.Route
import com.globant.splitcar.model.addRoutes
import com.globant.splitcar.model.routes
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_route.autoCompleteTextViewDestinationRoute
import kotlinx.android.synthetic.main.activity_route.constraintLayoutActivityRoute
import kotlinx.android.synthetic.main.activity_route.editTextDestinationReference
import kotlinx.android.synthetic.main.activity_route.editTextUser
import kotlinx.android.synthetic.main.activity_route.imageViewSaveRoute
import kotlinx.android.synthetic.main.activity_route.linearLayoutActivityRoute
import kotlinx.android.synthetic.main.activity_route.spinnerCarSeat
import kotlinx.android.synthetic.main.activity_route.textViewDateRoute
import kotlinx.android.synthetic.main.activity_route.textViewTimeRoute
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Locale

class RouteActivity : AppCompatActivity() {
    private val firebaseFirestore = FirebaseFirestore.getInstance()
    private val carSeat: Array<Long> = arrayOf(1, 2, 3, 4)
    private var calendar = Calendar.getInstance()
    private var route: Route? = null
    private val currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    private val currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    override fun onCreate(savedInstanceState: Bundle?) {
        val email = intent.getStringExtra("email")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Crea tu Ruta"
        val arrayAdapter = ArrayAdapter(this@RouteActivity, android.R.layout.simple_spinner_item, carSeat)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCarSeat.adapter = arrayAdapter
        editTextUser.text = email
        textViewDateRoute.text = currentDate
        textViewTimeRoute.text = currentTime
        val onTimeSetListener = TimePickerDialog.OnTimeSetListener { _, hour, minute ->
            calendar.set(Calendar.HOUR_OF_DAY, hour)
            calendar.set(Calendar.MINUTE, minute)
            updateTimeInTextViewDateRoute()
        }
        textViewTimeRoute.setOnClickListener {
            TimePickerDialog(this@RouteActivity, onTimeSetListener, calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE),
                    false).show()
        }
        imageViewSaveRoute.setOnClickListener {
            val route = Route(
                    (routes.size + 1).toLong(),
                    editTextUser.text.toString(),
                    autoCompleteTextViewDestinationRoute.text.toString(),
                    "Vizcaya",
                    com.globant.splitcar.model.currentDate,
                    textViewTimeRoute.text.toString(),
                    spinnerCarSeat.selectedItem as Long,
                    editTextDestinationReference.text.toString()
            )
            addRoutes(route)
            Snackbar.make(linearLayoutActivityRoute, "$route", Snackbar.LENGTH_LONG).show()
            saveFireStore()
            finish()
        }
    }

    private fun updateTimeInTextViewDateRoute() {
        textViewTimeRoute.text = SimpleDateFormat("HH:mm a", Locale.US).format(calendar.time)
        Snackbar.make(constraintLayoutActivityRoute, SimpleDateFormat("HH:mm a", Locale.US).format(calendar.time), Snackbar.LENGTH_LONG).show()
    }

    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(menuItem)
    }

    private fun saveFireStore() {
        val id: Long = routes.size + 1.toLong()
        val email = editTextUser.text.toString()
        val route = Route(
                id,
                email,
                autoCompleteTextViewDestinationRoute.text.toString(),
                "Vizcaya",
                com.globant.splitcar.model.currentDate,
                textViewTimeRoute.text.toString(),
                spinnerCarSeat.selectedItem as Long,
                editTextDestinationReference.text.toString()
        )
        firebaseFirestore
                .collection("Route")
                .document("$email")
                .set(route)
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, RouteActivity::class.java)
        }
    }
}
