package com.onyourleft.web.service;

import com.onyourleft.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
