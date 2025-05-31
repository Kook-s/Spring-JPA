package study.datajpa.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import study.datajpa.entity.Member;

@Data
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}
