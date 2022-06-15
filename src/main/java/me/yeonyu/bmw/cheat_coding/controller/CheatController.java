package me.yeonyu.bmw.cheat_coding.controller;

import me.yeonyu.bmw.cheat_coding.model.Cheat;
import me.yeonyu.bmw.cheat_coding.service.CheatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/cheat")
public class CheatController {

    private CheatService cheatService;

    @PostMapping("/")
    public ResponseEntity<String> insertCheatData(@RequestBody Cheat cheat) {

        cheatService.insertCheatData(cheat);

    }
}
