package com.rirtelecom.tpathdrawer.pathdrawer.service;

import com.rirtelecom.tpathdrawer.pathdrawer.model.Arch;
import com.rirtelecom.tpathdrawer.pathdrawer.repository.ArchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArchService {
    private final ArchRepository archRepository;


    public ArchService(ArchRepository archRepository) {
        this.archRepository = archRepository;
    }

    public List<Arch> findAll() {
        return archRepository.findAll();
    }

    public List<Double[]> getPolyLine() {
        List<Arch> list = archRepository.findAll();
        return list.stream().map(x -> new Double[]{x.getLatitude(), x.getLongitude()}).collect(Collectors.toList());
    }
}
