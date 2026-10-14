# Java Fundamentals

Colección de programas en **Java** que practican los fundamentos del lenguaje: condicionales, ciclos, cadenas, arreglos, manejo de archivos, programación orientada a objetos y modularidad con interfaces gráficas (Swing).

**Autor:** Dylan Zuleta (`dygrz`) · Octubre 2026
**Entorno:** Apache NetBeans · Maven · paquete `umg.javafundamentals`

---

## 📁 Estructura del proyecto

```
java-fundamentals/
├── README.md
└── javafundamentals/                      ← proyecto Maven (abrir ESTA carpeta en NetBeans)
    ├── pom.xml
    ├── productos.csv                      ← datos de ejemplo del módulo "modularidad"
    └── src/main/java/umg/javafundamentals/
        ├── Javafundamentals.java          (clase principal: "Hello World!")
        ├── condicionales/   DiasSemana, VerificarNota
        ├── ciclos/          SumarNumeros, ImprimirTabla, NumeroMenor,
        │                    CalcularMedia, OperacionesMenu, CalcularAreas
        ├── Cadenas/         Cadenas, ComparacionCadena
        ├── arreglos/        ejemplos, calculoprecios (GUI), palindromos (GUI)
        ├── archivos/        manejoarchivos (GUI)
        ├── poo/             estudiantes, Galleta, prueba
        └── modularidad/     Menu (GUI), Registro (GUI), Consultas (GUI)
```

---

## ▶️ Cómo ejecutar

1. Abrir **NetBeans** → **File → Open Project** → seleccionar la carpeta `javafundamentals`.
2. En **Projects**, desplegar `Source Packages → umg.javafundamentals` y el paquete deseado.
3. **Clic derecho sobre la clase → Run File** (o `Shift + F6`).

| Tipo de programa | Cómo se usa |
|---|---|
| **Consola** (`condicionales`, `ciclos`, `Cadenas`, `arreglos/ejemplos`, `poo/prueba`) | Los datos se escriben en la ventana **Output** de NetBeans (clic dentro del Output y teclear + Enter) |
| **Ventana gráfica** (`calculoprecios`, `palindromos`, `manejoarchivos`, `Menu`) | Se abre una ventana Swing con cajas de texto y botones |

> ⚠️ Cada clase tiene su propio `main`, así que se ejecutan **de una en una** con *Run File*.
> `Run Project` (F6) solo ejecuta `Javafundamentals`, que imprime `Hello World!`.
> `productos.csv` se lee y escribe de forma relativa, por eso debe estar en la carpeta `javafundamentals` (la raíz del proyecto Maven).

**Desde terminal** (opcional), dentro de la carpeta `javafundamentals`:

```bash
mvn compile
java -cp target/classes umg.javafundamentals.ciclos.SumarNumeros
```

Cambiar la clase final por la que se quiera ejecutar (con su paquete completo).

---

## 📚 Módulos

### 1️⃣ `condicionales`

| Clase | Qué hace | Ejemplo |
|---|---|---|
| `VerificarNota` | Lee una nota entera y decide con `if / else` si aprobó (nota ≥ 61) o reprobó | `75` → `Aprobó` |
| `DiasSemana` | Lee un número del 1 al 7 y muestra el día con `switch`; cualquier otro valor da un aviso | `3` → `Miercoles` |

### 2️⃣ `ciclos`

| Clase | Ciclo / estructura | Qué hace |
|---|---|---|
| `SumarNumeros` | `while` + acumulador | Pide cuántos números sumar y muestra la suma total |
| `ImprimirTabla` | `while` | Imprime la tabla de multiplicar (del 1 al 10) de un número |
| `NumeroMenor` | `for` + `if` | Pide N números y muestra el menor |
| `CalcularMedia` | `while` | Lee números hasta que se ingresa **0** y muestra la lista y el promedio |
| `OperacionesMenu` | `while` + `switch` | Menú de suma, resta, multiplicación y división; repite mientras se responda `S` |
| `CalcularAreas` | `while` + `switch` | Menú para área de triángulo, círculo (`Math.PI`) y rectángulo; la opción `4` sale |

### 3️⃣ `Cadenas`

| Clase | Métodos de `String` practicados |
|---|---|
| `Cadenas` | `length()`, `charAt()`, `isEmpty()`, `concat()` |
| `ComparacionCadena` | `equals()`, `compareToIgnoreCase()`, `contains()`, `indexOf()`, `startsWith()` |

### 4️⃣ `arreglos`

| Clase | Tipo | Qué hace |
|---|---|---|
| `ejemplos` | Consola | Métodos estáticos `ejemplo1()` (5 nombres en orden inverso), `ejercicio1()` (tabla índice/valor) y `ejercicio2()` (suma, multiplicación y promedio de N números). El `main` ejecuta `ejercicio2()` |
| `calculoprecios` | GUI | Se escriben precios separados por comas; **Calcular** muestra el total a pagar y el impuesto del 12 % |
| `palindromos` | GUI | Invierte la palabra con un `char[]` y dice si es palíndromo (sin distinguir mayúsculas) |

| Ventana | Componentes |
|---|---|
| `calculoprecios` | `txtprecios`, `btncalcular`, `lbltotal`, `lblimpuesto` |
| `palindromos` | `txtIngreso`, `btnEvaluar`, `lblresultado` |

### 5️⃣ `archivos`

**Clase:** `manejoarchivos` (GUI) · práctica de `FileWriter`, `Scanner`, `File` y `Files.readString`

| Componente | Función |
|---|---|
| `txtnombre` | Nombre del archivo (sin extensión) |
| `txacontenido` | Texto a guardar / texto leído |
| `btnescribir` | Escribe el contenido de `txacontenido` en `<nombre>.txt` |
| `btnleer` | Lee `<nombre>.txt` y lo muestra en `txacontenido` |
| `btnescribirprueba` / `btnleerprueba` | Escriben / leen un archivo fijo `Prueba.txt` (los mensajes salen en la consola) |

> Los archivos se guardan en la carpeta del Escritorio definida en la variable `ubicacion` de cada método. Si se ejecuta en otra computadora, hay que cambiar esa ruta.

### 6️⃣ `poo` (Programación Orientada a Objetos)

| Clase | Atributos | Constructor imprime |
|---|---|---|
| `estudiantes` | `nombre`, `apellido`, `carnet`, `carrera`, `semestre` | `Estudiante agregado` |
| `Galleta` | `forma`, `color`, `saber`, `topping`, `anicillos`, `chidpasChocolate` | `Creando nueva galleta` |
| `prueba` | `main` que crea 3 galletas, 1 estudiante y lo guarda en un `ArrayList<estudiantes>` | |

Se practica: crear clases, instanciar con `new`, asignar atributos con el operador punto y guardar objetos en una lista.

### 7️⃣ `modularidad`

Aplicación de **tres ventanas** que se comunican a través de un archivo CSV. Se ejecuta desde `Menu`.

| Clase | Título de la ventana | Función |
|---|---|---|
| `Menu` | (menú principal) | Abre las otras dos ventanas. Botón **Registro** → `Consultas`, botón **Consultas** → `Registro` |
| `Consultas` | *Registro Productos* | Se ingresa nombre y precio (Q) y **Agregar** (hasta 5 productos). **Guardar** escribe `productos.csv` sobrescribiéndolo (`FileWriter` en modo `false`) |
| `Registro` | *Consulta de Catalogo* | **Mostrar Catalogo** lee `productos.csv`, lo lista numerado y muestra el **valor total del inventario** |

| Ventana | Componentes |
|---|---|
| `Menu` | `btnRegistro`, `btnConsultas` |
| `Consultas` | `txtNombre`, `txtPrecio`, `btnAgregar`, `Guardar`; arreglos `nombres[5]`, `precios[5]`, `indice` |
| `Registro` | `btnCargar`, `taCatalogo`; arreglos `catalogoNombres[5]`, `catalogoPrecios[5]`, `totalLeidos` |

**Flujo de uso**
1. Ejecutar `Menu` → botón **Registro** → agregar productos → **Guardar**.
2. Botón **Consultas** → **Mostrar Catalogo** para ver la lista y el total.

Formato de `productos.csv` (una línea por producto, `nombre,precio`):

```
A,1.0
B,2.0
C,3.0
```

> Nota: los **nombres de las clases** `Consultas` y `Registro` están al revés de lo que hace cada ventana (la que registra se llama `Consultas` y la que consulta se llama `Registro`). Los botones del menú ya están rotulados para que el uso sea el correcto.

---

## 🧰 Conceptos aplicados

| Tema | Dónde |
|---|---|
| `if / else`, `switch` | `condicionales`, `OperacionesMenu`, `CalcularAreas` |
| `while`, `for`, acumuladores | `ciclos` |
| Métodos de `String` | `Cadenas`, `palindromos` |
| Arreglos y `split(",")` | `arreglos`, `modularidad` |
| Lectura y escritura de archivos | `archivos`, `modularidad` |
| Clases, objetos y `ArrayList` | `poo` |
| Interfaces gráficas con Swing y eventos de botón | `calculoprecios`, `palindromos`, `manejoarchivos`, `modularidad` |
| Programación modular (varias ventanas) | `modularidad` |

---

## ✍️ Autor

**Dylan Zuleta (`dygrz`)** · Java Fundamentals · Octubre 2026
