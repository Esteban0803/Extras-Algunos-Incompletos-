/* 1 */
select Nombre 
from jugadores
order by Nombre;
/* 2 */
select Nombre, Peso, Posicion
from jugadores
where Peso > 200
and Posicion = 'C'
order by Nombre;
/* 3 */
select Nombre
from equipos
order by Nombre;
/* 4 */
select Nombre, Conferencia
from equipos
where Conferencia = 'East';
/* 5 */
select Nombre, Ciudad
from equipos
where Ciudad like 'C%'
order by Nombre;
/* 6 */
select e.Nombre, j.Nombre
from equipos e, jugadores j
order by e.Nombre;
/* 7 */
select j.Nombre, j.Nombre_equipo
from jugadores j
where j.Nombre_equipo = 'Raptors'
order by j.Nombre;
/* 8 */
select j.Nombre, es.Puntos_por_partido
from jugadores j, estadisticas es
where j.Nombre = 'Pau Gasol';
/* 9 */
select j.Nombre, es.Puntos_por_partido, es.temporada
from jugadores j, estadisticas es
where j.Nombre = 'Pau Gasol'
and es.temporada = '04/05';
/* 10 */
select j.Nombre, es.Puntos_por_partido
from jugadores j,  estadisticas es;
/* 11 */
select e.Nombre, COUNT(*) as Numero_jugadores
from equipos e
left join jugadores j on e.Nombre = j.Nombre_equipo
group by e.Nombre;
/* 12 */
select j.Nombre, MAX(Puntos_por_partido)
from jugadores j, estadisticas es
group by j.Nombre
limit 1;
/* 13 */
select e.Nombre, e.Conferencia, e.Division
from equipos e
join jugadores j on e.Nombre = j.Nombre_Equipo
where j.Altura = (
  select MAX(Altura)
  from jugadores);
/* 14 */
select p.equipo_local, p.equipo_visitante, ABS(p.puntos_local - p.puntos_visitante) AS diferencia
from partidos p
order by diferencia desc
limit 1;
/* 15 */
select codigo, equipo_local, equipo_visitante,
       case
           when puntos_local > puntos_visitante then equipo_local
           when puntos_local < puntos_visitante then equipo_visitante
           else null
       end as equipo_ganador
from partidos