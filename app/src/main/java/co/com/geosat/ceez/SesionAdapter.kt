package co.com.geosat.ceez

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import co.com.geosat.ceez.model.Sesion
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.sesion_adapter.view.*

class SesionAdapter (var items: ArrayList<Sesion>?): RecyclerView.Adapter<SesionAdapter.ViewHolder>() {

    var viewHolder: ViewHolder? = null

    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        val item = items?.get(p1)
        holder.textViewNombre?.text = item?.nombre
        holder.textViewTipo?.text = item?.tipo
        holder.textViewHorario?.text = "${item?.inicia} a ${item?.termina}"
        when (item?.codigo) {
            1 -> holder.circleImageViewIcon?.setImageResource(R.drawable.el_capital)
            2 -> holder.circleImageViewIcon?.setImageResource(R.drawable.ser_lenguaje)
            3 -> holder.circleImageViewIcon?.setImageResource(R.drawable.quijote)
            4 -> holder.circleImageViewIcon?.setImageResource(R.drawable.estanislao_zuleta)
        }

        holder.cardViewSesion?.setOnClickListener {
            Toast.makeText(it.context,"Item is clicked", Toast.LENGTH_SHORT).show()
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var cardViewSesion: CardView? = null
        var textViewNombre: TextView? = null
        var textViewTipo: TextView? = null
        var textViewHorario: TextView? = null
        var circleImageViewIcon: CircleImageView? = null

        init {
            this.cardViewSesion = view.cardViewSesion
            this.textViewNombre = view.textViewNombre
            this.textViewTipo = view.textViewTipo
            this.textViewHorario = view.textViewHorario
            this.circleImageViewIcon = view.circleImageViewIcon

        }


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SesionAdapter.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.sesion_adapter, p0,false)
        viewHolder = ViewHolder(view)
        return viewHolder!!
    }
}