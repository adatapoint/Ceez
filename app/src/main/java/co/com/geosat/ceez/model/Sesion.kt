package co.com.geosat.ceez.model

import java.util.*
import java.io.Serializable

class Sesion (
    var nombre: String,
    var tipo: String,
    var hora: String,
    var duracion: String?,
    var texto: String?,
    var apartado: String?,
    var paginaje: String?,
    var expositor: List<String>?,
    var observacion: String?,
    var urls: List<Url>?,
    var lugar: String
) :Serializable