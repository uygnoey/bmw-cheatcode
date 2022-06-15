package me.yeonyu.bmw.cheat_coding.model.esysLauncher;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.relational.core.sql.In;

@Data
@ToString
@NoArgsConstructor
public class Function {

    private Integer start;
    private Integer end;
    private String mask;
    private String comment;
    private String value;

}
