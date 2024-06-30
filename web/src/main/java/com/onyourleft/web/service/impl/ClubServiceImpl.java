package com.onyourleft.web.service.impl;

import com.onyourleft.web.dto.ClubDto;
import com.onyourleft.web.models.Club;
import com.onyourleft.web.repository.ClubRepository;
import com.onyourleft.web.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .name(club.getName())
                .photo(club.getPhoto())
                .description(club.getDescription())
                .createdOn(club.getCreatedOn())
                .updatedOn((club.getUpdatedOn()))
                .build();
        return clubDto;
    }
}
