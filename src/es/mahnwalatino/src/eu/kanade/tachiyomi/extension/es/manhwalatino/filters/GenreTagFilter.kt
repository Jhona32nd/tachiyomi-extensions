package eu.kanade.tachiyomi.extension.es.manhwalatino.filters

class GenreTagFilter : UriPartFilter(
    "Género o Tag",
    "filtro",
    arrayOf(
        Pair("manga-genre/manga", "Todas"),
        Pair("manga-genre/accion", "Acción"),
        Pair("manga-genre/adulto", "Adulto"),
        Pair("manga-genre/aventura", "Aventura"),
        Pair("manga-genre/bondage", "Bondage"),
        Pair("manga-genre/cambio-de-pareja", "Cambio de pareja"),
        Pair("manga-genre/chantaje", "Chantaje"),
        Pair("manga-genre/ciencia-ficcion", "Ciencia Ficción"),
        Pair("manga-genre/comedia", "Comedia"),
        Pair("manga-genre/doujinshi", "Doujinshi"),
        Pair("manga-genre/drama", "Drama"),
        Pair("manga-tag/lunes", "Dia Publicación Lunes"),
        Pair("manga-tag/martes", "Dia Publicación Martes"),
        Pair("manga-tag/miercoles", "Dia Publicación Miércoles"),
        Pair("manga-tag/jueves", "Dia Publicación Jueves"),
        Pair("manga-tag/viernes", "Dia Publicación Viernes"),
        Pair("manga-tag/sabado", "Dia Publicación Sábado"),
        Pair("manga-tag/domingo", "Dia Publicación Domingo"),
        Pair("manga-genre/ecchi", "Ecchi"),
        Pair("manga-tag/espanol", "Español"),
        Pair("manga-genre/exhibicion", "Exhibición"),
        Pair("manga-genre/familia", "Familia"),
        Pair("manga-genre/fantasia", "Fantasia"),
        Pair("manga-tag/fin", "Finalizado"),
        Pair("manga-genre/harem", "Harem"),
        Pair("manga-genre/manga", "Manga"),
        Pair("manga-genre/manhua", "Manhua"),
        Pair("manga-genre/manhwa", "Manhwa"),
        Pair("manga-genre/misterio", "Misterio"),
        Pair("manga-genre/ntr", "Ntr"),
        Pair("manga-genre/obsenidad", "Obsenidad"),
        Pair("manga-genre/relato vida", "Relato vida"),
        Pair("manga-genre/romance", "Romance"),
        Pair("manga-genre/sangre", "Sangre"),
        Pair("manga-genre/sexo-forzado", "Sexo forzado"),
        Pair("manga-genre/sometimiento", "Sometimiento"),
        Pair("manga-genre/tragedia", "Tragedia"),
        Pair("manga-genre/venganza", "Venganza"),
        Pair("manga-genre/vida-escolar", "Vida Escolar"),
        Pair("manga-genre/webtoon", "Webtoon")
    )
)