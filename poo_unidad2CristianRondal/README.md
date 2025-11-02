# Proyecto POO - Contenido Audiovisual

## Objetivos y Propósito del Proyecto
Este proyecto tiene como objetivo desarrollar un sistema en Java para la gestión de contenidos audiovisuales, incluyendo películas, series de TV y documentales.  
El propósito es aplicar los conceptos de **Programación Orientada a Objetos (POO)**, como clases, herencia, agregación, composición y asociaciones, para modelar un sistema funcional y escalable.  

Con este proyecto se busca:
- Practicar la creación de clases y subclases en Java.
- Implementar relaciones entre objetos (asociación, agregación, composición).
- Desarrollar un sistema funcional que permita la creación y manipulación de contenidos audiovisuales.

---

## Clases y Funcionalidades Nuevas
Se han añadido las siguientes clases y funcionalidades al proyecto original:

### Nuevas Clases
1. **Actor**  
   - Relacionada con `Película` mediante agregación.  
   - Atributos: `nombre`, `fechaNacimiento`, `nacionalidad`.  
   - Métodos: getters, setters, `mostrarInfo()`.  

2. **Temporada**  
   - Relacionada con `SerieDeTV` mediante composición.  
   - Atributos: `numeroTemporada`, `cantidadEpisodios`.  
   - Métodos: getters, setters, `mostrarTemporada()`.  

3. **Investigador**  
   - Relacionada con `Documental` mediante agregación.  
   - Atributos: `nombre`, `especialidad`.  
   - Métodos: getters, setters, `mostrarInfoInvestigador()`.  

### Nuevas Subclases de `ContenidoAudiovisual`
1. **Cortometraje**  
   - Atributos: `duracion`, `genero`.  
   - Métodos: getters, setters, `mostrarInfo()`.  

2. **VideoYouTube**  
   - Atributos: `url`, `numeroDeLikes`.  
   - Métodos: getters, setters, `mostrarInfo()`.  

---

## Instrucciones para Clonar y Ejecutar el Proyecto
1. Clonar el repositorio:
```bash
git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git

### Diagrama de Clases

![Diagrama de Clases](imagenes_diagrama/diagrama_clases.png)
