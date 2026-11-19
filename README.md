# LlanquihueTourApp

**Autor:** Pedro Ascui

## Descripción
Sistema en Java para la agencia de turismo Llanquihue Tour. Lee desde un
archivo de texto externo (`guias.txt`) los datos de los guías turísticos,
los carga en una colección (`ArrayList`) y permite listarlos y filtrarlos
por ciudad y por lugar. El proyecto está organizado en paquetes
funcionales y aplica encapsulamiento, composición y reutilización de
código.

## Paquetes utilizados y clases implementadas
| Paquete | Clase | Rol |
|---|---|---|
| `App` | `Main` | Clase principal: carga los datos, muestra el catálogo y aplica los filtros |
| `model` | `Guia` | Representa a un guía (nombre, rut y dirección) |
| `model` | `Direccion` | Lugar, ciudad y precio. Se compone dentro de `Guia` (composición) |
| `service` | `GestorGuias` | Administra la lista de guías: mostrar todos y filtrar por ciudad o lugar |
| `util` | `LectorArchivo` | Lee el archivo de texto, separa los datos y crea los objetos |
| `resources` | `guias.txt` | Archivo con los datos de los guías |

## Estructura del proyecto
```
LlanquihueTourApp/
├── README.md
└── src/
    ├── App/
    │   └── Main.java
    ├── model/
    │   ├── Guia.java
    │   └── Direccion.java
    ├── service/
    │   └── GestorGuias.java
    ├── util/
    │   └── LectorArchivo.java
    └── resources/
        └── guias.txt
```

## Formato de guias.txt
Una línea por guía, con los datos separados por punto y coma:
```
lugar;ciudad;precio;nombre;rut
```
Ejemplo:
```
Baquedano;Santiago;46000;Pedro Ascui;18638007k
```

## Cómo ejecutar el programa
1. Clonar o descargar el repositorio.
2. Abrir el proyecto en NetBeans (File → Open Project).
3. Verificar que `guias.txt` esté en `src/resources/`.
4. Ejecutar la clase `Main` del paquete `App`
   (clic derecho → Run File).
5. En consola se muestra la carga del archivo, el catálogo completo de
   guías y los resultados de los filtros por ciudad y por lugar.
