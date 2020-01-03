package com.globant.splitcar.utils

/**
 * Constants
 *
 * In this class all the constants that are needed in the application are declared
 *
 * @author juan.rendon
 */

const val ID_USER = "idUser"
const val EMAIL = "email"
const val ROUTE_OBJECT = "Route"
const val ROUTE_ORIGIN = "Vizcaya"
val CARSEAT = arrayOf(1, 2, 3, 4)
val PLACES = arrayOf(
        "1er Parque de Laureles",
        "Vizcaya",
        "2do Parque de Laureles",
        "Aldea Pablo VI",
        "Alejandro Echavarría",
        "Alejandría",
        "Alfonso López",
        "Altamira",
        "Altavista Sector Central",
        "Altavista",
        "Altos del Poblado",
        "Andalucía",
        "Antonio Nariño",
        "Aranjuez",
        "Asomadera No.1",
        "Asomadera No.2",
        "Asomadera No.3",
        "Astorga",
        "Atrio Iglesia Madre de Dios",
        "Atrio Iglesia San Bernardo",
        "Atrio Iglesia San Gregorio Magno",
        "Atrio Iglesia San Judas Tadeo",
        "Atrio Parroquia Santa Maria de Jesús")
/*
var PLACES = arrayOf(
        "1er Parque de Laureles",
        "Vizcaya",
        "2do Parque de Laureles",
        "Aldea Pablo VI",
        "Alejandro Echavarría",
        "Alejandría",
        "Alfonso López",
        "Altamira",
        "Altavista Sector Central",
        "Altavista",
        "Altos del Poblado",
        "Andalucía",
        "Antonio Nariño",
        "Aranjuez",
        "Asomadera No.1",
        "Asomadera No.2",
        "Asomadera No.3",
        "Astorga",
        "Atrio Iglesia Madre de Dios",
        "Atrio Iglesia San Bernardo",
        "Atrio Iglesia San Gregorio Magno",
        "Atrio Iglesia San Judas Tadeo",
        "Atrio Parroquia Santa Maria de Jesús",
        "Aures No.1",
        "Aures No.2",
        "Barrio Caicedo",
        "Barrio Colombia",
        "Barrio Colón",
        "Barrio Cristóbal",
        "Barrios de Jesús",
        "Barro Blanco",
        "Belalcázar",
        "Belencito",
        "Bello Horizonte",
        "Belén",
        "Berlín",
        "Bermejal-Los Álamos",
        "Betania",
        "Blanquizal",
        "Bomboná No.1",
        "Bomboná No.2",
        "Bosques de San Pablo",
        "Boston",
        "Boyacá",
        "Brasilia",
        "Buenos Aires",
        "Buga Patio Bonito",
        "Cabecera Urbana Corregimiento San Cristóbal",
        "Calasanz Parte Alta",
        "Calasanz",
        "Calle Nueva",
        "Campo Alegre",
        "Campo Amor",
        "Campo Valdés No.1",
        "Campo Valdés No.2",
        "Cancha de Futbol y Placa Polideportiva El Corazón",
        "Cancha de Fútbol Horizontes",
        "Cancha de Fútbol y Placa Polideportiva El Corazón",
        "Cancha Divina Providencia.",
        "Cancha Fuente Clara",
        "Cancha Los Tablones",
        "Cancha Múltiple y Zona Verde",
        "Cancha San José del Manzanillo",
        "Cancha San Pablo",
        "Carlos E. Restrepo",
        "Carpinelo",
        "Casa de la Cultura Raíces de la Raza + Biblioteca",
        "Castilla",
        "Castropol",
        "Cataluña",
        "Cementerio Universal",
        "Centro Administrativo",
        "Centro Educativo Pedregal Alto",
        "Cerro La Asomadera",
        "Cerro Nutibara",
        "Chorro Clarín",
        "Ciudad Don Bosco",
        "Conectividad Quebrada Santa Elena - El Pinal",
        "Corazón de Jesús",
        "Corredor Ecológico Lineal La Iguaná",
        "Corredor Ecológico Lineal La Moreno",
        "Cristo Rey",
        "Cuarta Brigada",
        "Cucaracho",
        "Córdoba",
        "Diego Echavarría",
        "Doce de Octubre No.1",
        "Doce de Octubre No.2",
        "Ecoparque Cerro El Volador",
        "Eduardo Santos",
        "El Castillo",
        "El Chagualo",
        "El Compromiso",
        "El Corazón El Morro",
        "El Corazón",
        "El Danubio",
        "El Diamante No.2",
        "El Diamante",
        "El Nogal-Los Almendros",
        "El Pesebre",
        "El Pinal",
        "El Poblado",
        "El Pomar",
        "El Progreso",
        "El Raizal",
        "El Rincón",
        "El Salado",
        "El Salvador",
        "El Socorro",
        "El Tesoro",
        "El Triunfo",
        "El Velódromo",
        "Enciso",
        "EP Plan Parcial Pajarito",
        "Espacio Público Plan Parcial Pajarito",
        "Estación Metrocable Juan XXIII",
        "Estación Villa",
        "Estadio",
        "Facultad de Minas U. Nacional",
        "Ferrini",
        "Florencia",
        "Florida Nueva",
        "Francisco Antonio Zea",
        "Fuente Clara",
        "Fátima",
        "Gerona",
        "Girardot",
        "Granada",
        "Granizal",
        "Guayabal",
        "Guayaquil",
        "Héctor Abad Gómez",
        "I.E. Doce de Octubre",
        "I.E. Julio César García",
        "I.E. Las Independencias",
        "I.E. San José Obrero",
        "Iglesia Concilio Vaticano",
        "Iglesia San Felipe Neri",
        "Institución Educativa Doce de Octubre",
        "Institución Educativa Julio César García",
        "Institución Educativa Las Independencias",
        "Institución Educativa San José Obrero",
        "Jardín Botanico Joaquín Antonio Uribe",
        "Jardín Botánico Joaquín Antonio Uribe",
        "Jardín Botánico",
        "Jardín Comunitario Susanita Díaz",
        "Jardín Público Teatro Pablo Tobón Uribe",
        "Juan Pablo II",
        "Juan XXIII La Quiebra",
        "Kennedy",
        "Kilómetro Paisajístico",
        "La Aguacatala",
        "La Alpujarra",
        "La América",
        "La Avanzada",
        "La Candelaria",
        "La Castellana",
        "La Colina",
        "La Cruz",
        "La Esperanza No.2",
        "La Esperanza",
        "La Floresta",
        "La Florida",
        "La Francia",
        "La Frontera",
        "La Gloria",
        "La Hondonada",
        "La Isla",
        "La Ladera",
        "La Libertad",
        "La Loma de Los Bernal",
        "La Loma",
        "La Mansión",
        "La Milagrosa",
        "La Mota",
        "La Palma",
        "La Pilarica",
        "La Piñuela",
        "La Pradera",
        "La Rosa",
        "La Salle",
        "La Sierra",
        "Las Acacias",
        "Las Brisas",
        "Las Esmeraldas",
        "Las Estancias",
        "Las Granjas",
        "Las Independencias",
        "Las Lomas No.1",
        "Las Lomas No.2",
        "Las Mercedes",
        "Las Palmas",
        "Las Playas",
        "Las Violetas",
        "Laureles",
        "Llanaditas",
        "Lorena",
        "Loreto",
        "Los Alcázares",
        "Los Alpes",
        "Los Balsos No.1",
        "Los Balsos No.2",
        "Los Cerros El Vergel",
        "Los Colores",
        "Los Conquistadores",
        "Los Mangos",
        "Los Naranjos",
        "Los Pinos",
        "Los Ángeles",
        "López de  Mesa",
        "Manila",
        "Manrique Central No.1",
        "Manrique Central No.2",
        "Manrique Oriental",
        "Mazo",
        "Metropolitano",
        "Mirador Arcoiris",
        "Mirador de Calasanz",
        "Mirador de Palmitas",
        "Mirador del Doce",
        "Mirador Las Palmas",
        "Miraflores",
        "Miranda",
        "Miravalle",
        "Monteclaro",
        "Moravia",
        "Moscú No.1",
        "Moscú No.2",
        "Naranjal",
        "Nueva Villa de La Iguaná",
        "Nueva Villa del Aburrá",
        "Nuevos Conquistadores",
        "Ocho de Marzo",
        "Oleoducto",
        "Pablo VI",
        "Pajarito",
        "Palenque",
        "Palermo",
        "Palmitas Sector Central",
        "Parque Alcázares",
        "Parque Aliadas",
        "Parque Almería",
        "Parque Altamira",
        "Parque Ambiental Finca la Mesa",
        "Parque Ambiental Finca Montecarlo",
        "Parque Aranjuez",
        "Parque Bailarina Isabel Cristina Restrepo Cárdenas",
        "Parque Barrio Alfonso Lopez",
        "Parque Barrio Antioquia 1",
        "Parque Barrios de Jesús",
        "Parque Belén Los Alpes",
        "Parque Betania",
        "Parque Biblioteca La Ladera",
        "Parque Biblioteca San Javier",
        "Parque Biblioteca Tomás Carrasquilla",
        "Parque Bicentenario",
        "Parque Carlos E. Restrepo",
        "Parque Cedezo",
        "Parque Cementerio San Lorenzo",
        "Parque Centro Carcelario Metropolitano",
        "Parque Centro Logístico Servientrega",
        "Parque Centro Suramericana",
        "Parque Ciudad del Río",
        "Parque Colegio Presbítero Antonio José Bernal",
        "Parque Conjunto Residencial  Alcalá",
        "Parque Conquistadores",
        "Parque Contenedores Móviles",
        "Parque Cristo Rey",
        "Parque Cucaracho",
        "Parque Córdoba",
        "Parque de Belén",
        "Parque de Berrío",
        "Parque de Bolívar",
        "Parque de Boston",
        "Parque de La Curva",
        "Parque de La Escalera",
        "Parque de La Piñuela",
        "Parque de la República",
        "Parque de las Terminalias",
        "Parque de los Deseos",
        "Parque de los Pies Descalzos",
        "Parque de Los Tanques",
        "Parque de Manrique Central N°1",
        "Parque de San Cristóbal",
        "Parque de Skate Santo Domingo",
        "Parque de Villa Hermosa",
        "Parque del Cerro Pan de Azúcar",
        "Parque del Periodista",
        "Parque del Viento",
        "Parque Deportivo Antonio Nariño",
        "Parque Deportivo Belén La Palma",
        "Parque Deportivo El Rincón",
        "Parque Deportivo El Salado",
        "Parque Deportivo El Socorro",
        "Parque Deportivo La Maracaná",
        "Parque Deportivo Santa Lucía",
        "Parque Deportivo Sede Social La Pradera Parte Baja",
        "Parque Diego Echavarría",
        "Parque Divina Eucaristía",
        "Parque Doce de Octubre 1 Unidad Hospitalaria",
        "Parque Doce de Octubre 2",
        "Parque Doce de Octubre La Torre 1",
        "Parque Ecológico Cerro Nutibara",
        "Parque Ecológico La Perla",
        "Parque Ecológico Los Vikingos",
        "Parque Ecológico Quebrada La Mansión",
        "Parque Eduardo Santos",
        "Parque Efe Gómez",
        "Parque El Ajedrez",
        "Parque El Calvario",
        "Parque El Corazón",
        "Parque El Limonar III",
        "Parque El Molino",
        "Parque El Progreso",
        "Parque El Rodeo",
        "Parque El Silletero Núcleo Central",
        "Parque El Vergel",
        "Parque Florida Nueva",
        "Parque Francisco Antonio Zea",
        "Parque Gratamira",
        "Parque I.E. Luis López de Mesa",
        "Parque Iglesia del Perpetuo Socorro",
        "Parque Iglesia Nuestra Señora de Fátima",
        "Parque Iglesia San Agustín",
        "Parque Iglesia Santa Mónica",
        "Parque Iglesia Santa Teresita del Niño Jesús",
        "Parque Infantil Barrios de Jesús",
        "Parque Infantil Bomberos",
        "Parque Infantil Centro Comercial Oviedo",
        "Parque Infantil El Compromiso",
        "Parque Infantil El Mirador",
        "Parque Infantil El Rosario",
        "Parque Infantil Fátima",
        "Parque Infantil La Isla",
        "Parque Infantil Las Brisas",
        "Parque Infantil Los Mangos",
        "Parque Infantil Pablo VI",
        "Parque Infantil Popular",
        "Parque Infantil Santa Lucía",
        "Parque Infantil Urb. Quintanar de Toledo II",
        "Parque Infantil",
        "Parque Institución Educativa Luis López de Mesa",
        "Parque Israel",
        "Parque J.F. Kennedy - Estación Floresta",
        "Parque Jorge Eliécer Gaitán",
        "Parque Juan Pablo II",
        "Parque Juanes De La Paz",
        "Parque La Almería",
        "Parque La América",
        "Parque La Castellana",
        "Parque La Chinca",
        "Parque La Colina",
        "Parque La Colinita 1",
        "Parque La Floresta",
        "Parque La Gloria",
        "Parque La Madre",
        "Parque La Matea",
        "Parque La Mattina",
        "Parque La Milagrosa",
        "Parque La Mota",
        "Parque La Nubia",
        "Parque La Pradera",
        "Parque Las Américas",
        "Parque Las Brisas",
        "Parque Las Independencias",
        "Parque Las Mercedes",
        "Parque Las Mirlas",
        "Parque Las Playas",
        "Parque Lineal Bosques de la Frontera",
        "Parque Lineal de Los Sentidos",
        "Parque Lineal Quebrada El Salado",
        "Parque Lineal Quebrada La Batea",
        "Parque Lineal Quebrada La Bermejala",
        "Parque Lineal Quebrada La Herrera",
        "Parque Lineal Quebrada La India",
        "Parque Lineal Quebrada La Malpaso",
        "Parque Lineal Quebrada La Presidenta",
        "Parque Lineal Quebrada La Quintana Fase 1",
        "Parque Lineal Quebrada La Quintana",
        "Parque Lineal Quebrada La Tinaja",
        "Parque Lleras",
        "Parque Loma del Garabato",
        "Parque Lorena",
        "Parque Los Almendros",
        "Parque Los Cerros I",
        "Parque Los Colores",
        "Parque Los Conquistadores",
        "Parque Los Jubilados",
        "Parque Los Mangos",
        "Parque Los Naranjos",
        "Parque Lourdes",
        "Parque Malibú",
        "Parque Manila",
        "Parque Manzanares",
        "Parque Maria Auxiliadora",
        "Parque Mayorca",
        "Parque Metrocable Occidente",
        "Parque Mirador Cancha",
        "Parque Miravalle 1",
        "Parque Miravalle 2",
        "Parque Monumento a La Virgen",
        "Parque Monumento Simesa",
        "Parque Natural Metropolitano Cerro El Volador",
        "Parque Norte",
        "Parque Obrero",
        "Parque Paraguay",
        "Parque Pilarica",
        "Parque Pinocho",
        "Parque Plaza Colón",
        "Parque Plaza de la Libertad",
        "Parque Principal El Poblado",
        "Parque Principal San Antonio de Prado",
        "Parque Quimbaya",
        "Parque Rafael J. Mejía",
        "Parque Recreativo Bosques de San Pablo",
        "Parque Recreativo Cataluña No.1",
        "Parque Recreativo Cataluña No.2",
        "Parque Recreativo El Salvador",
        "Parque Recreativo Estación Caribe Metro",
        "Parque Recreativo infantil",
        "Parque Recreativo La Ocho",
        "Parque Recreativo Loreto",
        "Parque Recreativo Pablo Vi",
        "Parque Recreativo Pablo VI",
        "Parque Recreativo Policarpa Salavarrieta",
        "Parque Recreativo Santa Fe",
        "Parque Recreativo Santa Inés",
        "Parque Recreativo Trinidad",
        "Parque Recreativo Versalles",
        "Parque Recreativo",
        "Parque Reversadero I - Las Independencias",
        "Parque Robledo",
        "Parque San Antonio",
        "Parque San Carlos",
        "Parque San Joaquín",
        "Parque San Pablo",
        "Parque Santa Lucía",
        "Parque Santa María de Los Ángeles No.1",
        "Parque Santa María de Los Ángeles No.2",
        "Parque Santander",
        "Parque Sector Central",
        "Parque Sede Comunal Juan XXIII",
        "Parque Simona Duque",
        "Parque Suramericana",
        "Parque Terrazas",
        "Parque Tomas Cipriano de Mosquera",
        "Parque Travesías Sector La Cumbre",
        "Parque Unidad Residencial Manila",
        "Parque Urb. Aguas del Bosque",
        "Parque Urb. Aldea Guayabal",
        "Parque Urb. Alejandro Echavarría",
        "Parque Urb. Ciudadela Prado II",
        "Parque Urb. Colinas del Viento",
        "Parque Urb. Compartir",
        "Parque Urb. El Limonar II",
        "Parque Urb. El Pinar",
        "Parque Urb. La Alborada",
        "Parque Urb. La Carmelita",
        "Parque Urb. La Milagrosa",
        "Parque Urb. Leonardo Davinci",
        "Parque Urb. Matisse y Miró",
        "Parque Urb. Parques de Villa Carlota",
        "Parque Urb. Patio de las Fuentes",
        "Parque Urb. Pinar del Río",
        "Parque Urb. Prados del Este",
        "Parque Urb. Puente Jardín",
        "Parque Urb. Quintas del Plantío",
        "Parque Urb. Rincón del Aguacatal",
        "Parque Urb. San Fernando Plaza",
        "Parque Urb. Sananghelis",
        "Parque Urb. Santa Ana de los Balsos",
        "Parque Urb. Solaris",
        "Parque Urb. Tesoro La Y",
        "Parque Urb. Torre Laguna",
        "Parque Urb. Torres de la Visitación",
        "Parque Urb. Villa Loma",
        "Parque Urb. Ávila",
        "Parque Urbanización Aguas del Bosque",
        "Parque Urbanización Aldea Guayabal",
        "Parque Urbanización Alejandro Echavarría",
        "Parque Urbanización Ciudadela Prado II",
        "Parque Urbanización Colinas del Viento",
        "Parque Urbanización Compartir",
        "Parque Urbanización El Limonar II",
        "Parque Urbanización El Pinar",
        "Parque Urbanización La Alborada",
        "Parque Urbanización La Carmelita",
        "Parque Urbanización La Milagrosa",
        "Parque Urbanización Leonardo Davinci",
        "Parque Urbanización Matisse y Miró",
        "Parque Urbanización Parques de Villa Carlota",
        "Parque Urbanización Patio de las Fuentes",
        "Parque Urbanización Pinar del Río",
        "Parque Urbanización Prados del Este",
        "Parque Urbanización Puente Jardín",
        "Parque Urbanización Quintas del Plantío",
        "Parque Urbanización Rincón del Aguacatal",
        "Parque Urbanización San Fernando Plaza",
        "Parque Urbanización Sananghelis",
        "Parque Urbanización Santa Ana de los Balsos",
        "Parque Urbanización Solaris",
        "Parque Urbanización Tesoro La Y",
        "Parque Urbanización Torre Laguna",
        "Parque Urbanización Torres de la Visitación",
        "Parque Urbanización Villa Loma",
        "Parque Urbanización Ávila",
        "Parque Vegas de Alcalá",
        "Parque Villa del Socorro",
        "Parque y Monumento El Salvador",
        "Parque",
        "Parroquia Corpus Cristi",
        "Parroquia La Divina Gracia",
        "Parroquia San Fernando",
        "Parroquia Santa María del Carmen",
        "Pasaje Uribe Uribe",
        "Patio Bonito",
        "Pedregal Alto",
        "Pedregal",
        "Perpetuo Socorro",
        "Picachito",
        "Picacho",
        "Piedras Blancas - Matasano",
        "Placa Polideportiva Betania",
        "Placa Polideportiva Córdoba",
        "Placa Polideportiva La Capilla",
        "Placa Polideportiva",
        "Playón de Los Comuneros",
        "Plaza Botero",
        "Plaza Cívica San Antonio",
        "Plaza de Eventos Villa Suramericana",
        "Plaza de Ferias",
        "Plaza de la Luz",
        "Plaza Gardel",
        "Plaza Mayor",
        "Plaza Mazo",
        "Plaza Talleres Robledo",
        "Plazoleta Bancolombia",
        "Plazoleta Barrio Colón",
        "Plazoleta Carlos Gardel",
        "Plazoleta Central Palmitas",
        "Plazoleta Centro Educativo Bucarelly",
        "Plazoleta Estación Hospital",
        "Plazoleta Estación Poblado",
        "Plazoleta Estación Prado 1",
        "Plazoleta Estación Prado 2",
        "Plazoleta Gorda de Botero",
        "Plazoleta Granizal",
        "Plazoleta Hospital General",
        "Plazoleta Iglesia de San José",
        "Plazoleta La Alpujarra",
        "Plazoleta La Veracruz",
        "Plazoleta Puente La Aguacatala",
        "Plazoleta Punto Clave",
        "Plazoleta San Antonio",
        "Plazoleta Suramericana",
        "Plazoleta Terminal de Transporte",
        "Plazoleta Trece de Noviembre",
        "Plazoleta U.D. Atanasio Girardot",
        "Plazoleta Unidad Deportiva Atanasio Girardot",
        "Plazoleta Urb. Santillana",
        "Plazoleta Urb. Sao Paulo",
        "Plazoleta Urb. Villa de Aburrá",
        "Plazoleta Urb. Villa Suramericana",
        "Plazoleta Urbanización Santillana",
        "Plazoleta Urbanización Sao Paulo",
        "Plazoleta Urbanización Villa de Aburrá",
        "Plazoleta Urbanización Villa Suramericana",
        "Plazoleta Área de Expansión San Antonio",
        "Plazuela Francisco Antonio Zea",
        "Plazuela Manuel Jose Caycedo",
        "Plazuela Manuel José Caycedo",
        "Plazuela Mon y Velarde",
        "Plazuela Nutibara",
        "Plazuela Rojas Pinilla",
        "Plazuela San Ignacio",
        "Polideportivo de Aliadas",
        "Polideportivo",
        "Popular",
        "Potrerito",
        "Prado",
        "Progreso No.2",
        "Retiro de Quebrada Bella Vista",
        "Retiro de Quebrada La Pelahueso",
        "Retiro de Quebrada",
        "Robledo",
        "Rosales",
        "S.E. Alfredo Cock Arango",
        "S.E. República de Cuba",
        "San Antonio de Prado",
        "San Benito",
        "San Bernardo",
        "San Diego",
        "San Germán",
        "San Isidro",
        "San Javier No.1",
        "San Javier No.2",
        "San Joaquín",
        "San José del Manzanillo",
        "San José La Cima No.1",
        "San Lucas",
        "San Martín de Porres",
        "San Miguel",
        "San Pablo",
        "San Pedro",
        "Santa Cruz",
        "Santa Elena Sector Central",
        "Santa Fé",
        "Santa Inés",
        "Santa Lucía",
        "Santa Margarita",
        "Santa María de Los Ángeles",
        "Santa Mónica",
        "Santa Rosa de Lima",
        "Santa Teresita",
        "Santander",
        "Santo Domingo Savio No.1",
        "Sección Escuela Alfredo Cock Arango",
        "Sección Escuela República de Cuba",
        "Sede Social Santa Rosa de Lima",
        "Sevilla",
        "Simón Bolívar",
        "Sin Nombre",
        "Sucre",
        "Suramericana",
        "Tejelo",
        "Tenche",
        "Terminal de Transporte",
        "Toscana",
        "Travesías",
        "Trece de Noviembre",
        "Tricentenario",
        "Trinidad",
        "U.D. Andrés Escobar",
        "U.D. Atanasio Girardot",
        "U.D. Barrio Cristóbal",
        "U.D. de Belén",
        "U.D. de Castilla",
        "U.D. Doce de Octubre",
        "U.D. La Floresta",
        "U.D. San Cristóbal",
        "Unidad Deportiva Andrés Escobar",
        "Unidad Deportiva Barrio Cristóbal",
        "Unidad Deportiva de Belén",
        "Unidad Deportiva de Castilla",
        "Unidad Deportiva Doce de Octubre",
        "Unidad Deportiva La Floresta",
        "Unidad Deportiva San Cristóbal",
        "Universidad Nacional",
        "Veinte de Julio",
        "Versalles No.1",
        "Villa Carlota",
        "Villa del Socorro",
        "Villa Flora",
        "Villa Guadalupe",
        "Villa Hermosa",
        "Villa Lilliam",
        "Villa Niza",
        "Villa Nueva",
        "Villa Turbay",
        "Villatina",
        "Volcana Guayabal",
        "Z.V. - Parque Infantil Pablo VI",
        "Z.V. La Cristóbal",
        "Z.V. Pajarito",
        "Z.V. Sector Central",
        "Z.V. Suramericana",
        "Z.V. Urb. Altavista Los Cerezos",
        "Z.V. Urb. Carlos E. Restrepo",
        "Z.V. Urb. La Praga",
        "Z.V. Urb. Mano de Dios",
        "Z.V. Urb. Nueva Villa de Aburrá",
        "Z.V. Urb. Piamonte",
        "Z.V. Urb. San Gabriel",
        "Z.V. Villa de Santa Catalina",
        "Zona Comunal No 3 Caunces",
        "Zona Comunal Urbanización Pradera Verde",
        "Zona Verde La Cristóbal",
        "Zona Verde Pajarito",
        "Zona Verde Parque Infantil",
        "Zona Verde Sector Central",
        "Zona Verde Suramericana",
        "Zona Verde Urbanización Altavista Los Cerezos",
        "Zona Verde Urbanización Carlos E. Restrepo",
        "Zona Verde Urbanización La Praga",
        "Zona Verde Urbanización Mano de Dios",
        "Zona Verde Urbanización Nueva Villa de Aburrá",
        "Zona Verde Urbanización Piamonte",
        "Zona Verde Urbanización San Gabriel",
        "Zona Verde Villa de Santa Catalina",
        "Zona Verde y Parque Infantil Pablo VI",
        "Zona Verde",
        "Área de Expansión Altavista",
        "Área de Expansión Belén Rincón",
        "Área de Expansión Pajarito",
        "Área de Expansión San Antonio de Prado",
        "Área de Recreación Parque Ecológico Cerro Nutibara",
        "Área de Recreación Urbana Cerro La Asomadera"
)

*/
