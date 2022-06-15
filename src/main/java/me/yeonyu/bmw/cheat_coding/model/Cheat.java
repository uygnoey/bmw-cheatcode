package me.yeonyu.bmw.cheat_coding.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import me.yeonyu.bmw.cheat_coding.constrant.CheatType;
import org.springframework.web.multipart.MultipartFile;

@Data
@ToString
@NoArgsConstructor
public class Cheat {

    private CheatType type;
    private MultipartFile cheatFile;

}
