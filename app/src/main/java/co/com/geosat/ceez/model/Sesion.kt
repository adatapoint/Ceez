package co.com.geosat.ceez.model

import java.util.*
import java.io.Serializable

class Sesion (
    var codigo: Int,
    var nombre: String,
    var tipo: String,
    var inicia: String,
    var termina: String?,
    var texto: String?,
    var apartado: String?,
    var paginaje: String?,
    var expositor: List<String>?,
    var observacion: String?,
    var urls: List<Url>?,
    var lugar: String
) :Serializable