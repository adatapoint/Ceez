package co.com.geosat.ceez

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import co.com.geosat.ceez.model.Sesion
import co.com.geosat.ceez.model.Url
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sesiones: ArrayList<Sesion>? = null
    var urlsCapital: ArrayList<Url>? = null
    var urlsLenguaje: ArrayList<Url>? = null
    var expositoresQuijote: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urlsCapital?.add(Url("https://drive.google.com/open?id=0B5O_lhOUxHupNG5vVmVRR19JTkk"))
        urlsLenguaje?.add(Url("https://drive.google.com/open?id=0B0LPs9Khw_z7NElDRXhtS3FVTlk"))
        expositoresQuijote?.add("Andrés Galeano")

        sesiones = ArrayList()
        sesiones?.add(Sesion(
            "Leer el Capital",
            "Seminario",
            "8:00 am",
            "1 hora y media",
            "El Capital",
            "Sección cuarta: Maquinaria y gran industria - Acápite 5 Lucha entre el obrero y la máquina",
            null,
            null,
            null,
            urlsCapital,
            "Universidad Nacional - Bloque 46 - Salón 114"
            )
        )
        sesiones?.add(Sesion(
            "El Ser y el Lenguaje",
            "Seminario",
            "10:30 am",
            "1 hora y media",
            "Conferencias Caraqueñas",
            "Elementos de epistemología",
            "páginas",
            null,
            null,
            urlsLenguaje,
            "Universidad Nacional - Bloque 46 - Salón 114"
            )
        )
        sesiones?.add(Sesion(
            "El Quijote",
            "Seminario",
            "1:15 pm",
            "2 horas",
            "Segunda parte del Ingenioso Caballero Don Quijote de la Mancha",
            "Capítulo XXXII De la respuesta que dio don Quijote a su reprehensor, con otros graves y graciosos sucesos.",
            null,
            expositoresQuijote,
            null,
            null,
            "Universidad Nacional - Bloque 46 - Salón 114"
            )
        )
        sesiones?.add(Sesion(
            "Obra de Estanislao Zuleta",
            "Grupo de Estudio",
            "3:30 pm",
            "1 hora y media",
            "El pensamiento psicoanalítico",
            "Capítulo 1 - Sobre la psicosis",
            null,
            null,
            null,
            null,
            "Universidad Nacional - Bloque 46 - Salón 114"
            )
        )

        recyclerViewSesion.layoutManager = LinearLayoutManager(this)
        recyclerViewSesion.adapter = SesionAdapter(sesiones)
    }
}
