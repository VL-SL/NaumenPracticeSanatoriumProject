package ru.naumen.sanatoriumproject.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UserShiftInfoDTO {
    private Long shiftId;
    private String shiftName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String roomNumber;
    private String roomDescription;
    private List<AppointmentDTO> appointments;
    private List<ProcedureCompletionDTO> completedProcedures;
}
