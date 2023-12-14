package com.example.airlines

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val mList:ArrayList<ItemsModel>):RecyclerView.Adapter<AdapterClass.ViewModelClass>() {

    class ViewModelClass(itemView: View) :RecyclerView.ViewHolder(itemView) {

       val timeArrival:TextView = itemView.findViewById(R.id.arrival_time)
        val timeReach:TextView = itemView.findViewById(R.id.reach_time)
        val flightName:TextView = itemView.findViewById(R.id.flight_name)
        val timeTaken:TextView = itemView.findViewById(R.id.time_taken)
        val availableSeat:TextView = itemView.findViewById(R.id.seat_available)
        val luggageAmount:TextView = itemView.findViewById(R.id.luggage_amount)
        val flightNumber:TextView = itemView.findViewById(R.id.flight_num)
        val points:TextView = itemView.findViewById(R.id.points_num)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewModelClass {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewModelClass(view)
    }

    override fun onBindViewHolder(holder: ViewModelClass, position: Int) {
        val itemsModel = mList[position]
         holder.timeArrival.text = itemsModel.departureTime
        holder.timeReach.text = itemsModel.reachTime
        holder.flightName.text = itemsModel.name
        holder.timeTaken.text = itemsModel.travelTime
        holder.availableSeat.text = itemsModel.seatAvailable.toString()
        holder.luggageAmount.text = itemsModel.luggageAmount.toString()
        holder.flightNumber.text = itemsModel.flightNumber
        holder.points.text = itemsModel.earningPoints.toString()
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}
