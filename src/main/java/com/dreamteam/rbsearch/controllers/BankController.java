package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntityDTO.BankEntityDTO;
import com.dreamteam.rbsearch.entities.BankEntity;
import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.services.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BankController {

    private final BankService bankService;

    @GetMapping("/")
    public String returnStartPage() {
        return "start_page";
    }

    @GetMapping("/error")
    public String returnErrorPage() {
        return "error/404_page";
    }

    @GetMapping("/criteria")
    public String returnSearchPage() {
        return "criteria_page";
    }

    public List<BankEntity> bankEntites(BankEntityDTO bankEntityDTO) {
        return bankService.findByPriceAndApp(bankEntityDTO);
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> get(
            @RequestParam(value = "price", required = true) String price,
            @RequestParam(value = "app", required = true) String app) {
        BankForm bankForm = new BankForm(price, app);
        List bankEntities = bankEntites(new BankEntityDTO(Integer.parseInt(price), app));
        return new ResponseEntity<>(bankEntities.toString(), HttpStatus.OK);
    }

}
