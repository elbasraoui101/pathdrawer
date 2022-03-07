package com.rirtelecom.tpathdrawer.pathdrawer.web;

import com.rirtelecom.tpathdrawer.pathdrawer.model.Arch;
import com.rirtelecom.tpathdrawer.pathdrawer.service.ArchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ArchController {

    private final ArchService archService;

    public ArchController(ArchService archService) {
        this.archService = archService;
    }

    @GetMapping("arch")
    public ResponseEntity<List<Arch>> findAll() {
        List<Arch> data = archService.findAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("arch/polyline")
    public ResponseEntity<List<Double[]>> getPolyLine() {
        List<Double[]> data = archService.getPolyLine();
        return ResponseEntity.ok(data);
    }

}
