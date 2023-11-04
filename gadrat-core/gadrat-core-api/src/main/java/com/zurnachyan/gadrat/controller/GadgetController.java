package com.zurnachyan.gadrat.controller;

import com.zurnachyan.gadrat.dto.GadgetDto;
import com.zurnachyan.gadrat.enums.GadgetType;
import com.zurnachyan.gadrat.facade.GadgetsServicesFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/grbcknd/gadgets")
@CrossOrigin("http://localhost:3000/")
public class GadgetController {

    private final GadgetsServicesFacade servicesFacade;

    @PostMapping(value = "", consumes = {"multipart/form-data"})
    public void saveGadget(@ModelAttribute GadgetDto gadgetDto) {
        servicesFacade.saveGadget(gadgetDto);
    }

    @GetMapping("/types")
    public List<String> getGadgetTypes() {
        return Arrays.stream(GadgetType.values()).map(Objects::toString).collect(Collectors.toList());
    }
}
