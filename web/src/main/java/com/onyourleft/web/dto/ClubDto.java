package com.onyourleft.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {
    private Long id;
    private String name;
    private String photo;
    private String description;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
