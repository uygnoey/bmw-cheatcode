package me.yeonyu.bmw.cheat_coding.model.esysLauncher;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class Group {

    private String id;
    private List<Function> function;

}
