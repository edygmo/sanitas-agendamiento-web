package co.sena.agendamiento.service;
import java.time.*;
public class Validacion {
 public static void cita(int paciente,int medico,LocalDateTime fecha,LocalDateTime ahora){if(paciente<=0||medico<=0||fecha==null||!fecha.isAfter(ahora)) throw new IllegalArgumentException("Seleccione paciente, médico y fecha futura.");}
 public static void estado(String estado){if(!"ATENDIDA".equals(estado)&&!"CANCELADA".equals(estado))throw new IllegalArgumentException("Estado inválido.");}
}