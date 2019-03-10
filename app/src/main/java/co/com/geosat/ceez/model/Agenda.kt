package co.com.geosat.ceez.model

import java.util.*
import java.io.Serializable

class Agenda (
    var fecha: Date,
    var sesiones: List<Sesion>?
): Serializable
